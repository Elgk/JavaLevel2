package Lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static final int PORT = 8189;
    private static ServerSocket server;
    private static Socket socket;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");
            System.out.println("Server connected");
            socket = server.accept();
            System.out.println("Client connected");
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            while (true){
                String str = scanner.nextLine();
                if (str.equals("/end")){
                    System.out.println("Client disconnected");
                    break;
                }
                System.out.println("Client: " + str);
                out.println("ECHO: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
