package network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        try (Socket socket = new Socket("172.30.108.25", 3000);
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));) {
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int count = inputStream.read(buffer);
            String messageFromServer = new String(buffer, 0, count);
            System.out.println(messageFromServer);

            String msg = "${Ruslan}" + '\n';
            for (char c : msg.toCharArray()) {
                bufferedWriter.write(c);

            }
            System.out.println("To msg: " + msg);
            System.out.println("Enter you msg: ");

            do {
                String message = scanner.nextLine() + '\n';
                for (char c : message.toCharArray()) {
                    bufferedWriter.write(c);
                }
                bufferedWriter.flush();
            } while (true);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

