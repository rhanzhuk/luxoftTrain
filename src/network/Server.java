package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String msg = bufferedReader.readLine();
                System.out.println(msg);
                String fromServer = "ECHO: " + msg;
                System.out.println(fromServer);

                for (char c : fromServer.toCharArray()) {
                    bufferedWriter.write(c);
                }
                bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
