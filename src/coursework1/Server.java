/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;




/**
 *
 * @author Administrator
 */
public class Server extends ClientServer {
    
    private int _port;

    public Server(int port) {
        try{
        final ServerSocket server = new ServerSocket(5555);
        final Socket clientConnection = server.accept();
        final PrintWriter out = new PrintWriter(clientConnection.getOutputStream(), true);
        final Scanner in = new Scanner(clientConnection.getInputStream());
        while (in.hasNext()) {
            final String clientRequest = in.nextLine();
            if (!clientRequest.isEmpty()) {
                out.println("Request recieved '" + clientRequest.toUpperCase() + "'");
            }
        }
    }
    catch (IOException ex) {
    
            System.out.println("Error:" + ex.getMessage());
    }}
       public void start(){
               
       }
       public static void main(String[] args) {
 

        
    /*try{
    final ServerSocket server = new ServerSocket(5555);
    final Socket clientConnection = server.accept();
    final PrintWriter out = new PrintWriter(clientConnection.getOutStream(), true);
    final Scanner in = new Scanner(clientConnection.getInputStream());
    while (in.hasNext()) {
        final String clienRequest = in.nextLine();
        if (!clientRequest = inEmpty()) {
            out.println("Request recieved '" + clientRequest.toUpperCase()+ "'");
        }
        }
} catch (IOException ex) {
System.out.println("Error:" + ex.getMessage());
*/
        
    }}
