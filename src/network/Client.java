package network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter you msg: ");
        String msg = scanner.nextLine() + '\n';


        try {

            do {
                Socket socket = new Socket("localhost", 3000);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                for (char c : msg.toCharArray()) {
                    bufferedWriter.write(c);
                }
                bufferedWriter.flush();
                InputStream inputStream = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int count = inputStream.read(buffer);
                String messageFromServer = new String(buffer, 0, count);
                System.out.println(messageFromServer);
            }while (msg.equals("!!!!"));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
