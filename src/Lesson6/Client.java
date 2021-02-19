package Lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final int PORT = 8189;
    private static final String SERVER_ADDRESS = "localhost";
    private static Socket socket;

    public static void main(String[] args) {
        try {
            socket = new Socket(SERVER_ADDRESS, PORT);
            Scanner scn = new Scanner(socket.getInputStream());
            Scanner reader = new Scanner(System.in);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Введите сообщение серверу: ");
            while (true){
                String msg = reader.nextLine();
                out.println(msg);
                if (msg.equals("/end")){
                    System.out.println("Server disconnected");
                    break;
                }
                String str = scn.nextLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
