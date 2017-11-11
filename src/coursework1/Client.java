/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;



/**
 *
 * @author Administrator
 */
public class Client extends ClientServer {
    
   private String _host;
    private int _port;
    
  /* try{
    final Socket client = new Socket("127.0.0.1", 5555);
    final PrintWriter out = new PrintWriter(client.getOutputStream(), true);
           final Scanner in = new Scanner(client.getInputStream());
           final Scanner userIn = new Scanner(System.in);
           while (true) {
               System.out.print("Enter request:");
               
               final String userInput = userIn.nextLine();
               out.println(userInput);
               
               System.out.println(">>" + in.nextLine());
           }

}catch (IOException ex) {
    
    System.out.println("ERROR:" + ex.getMessage());
}
    */public Client (String host, int port) {
        try{
    final Socket client = new Socket(host, 5555);
    final PrintWriter out = new PrintWriter(client.getOutputStream(), true);
           final Scanner in = new Scanner(client.getInputStream());
           final Scanner userIn = new Scanner(System.in);
           while (true) {
               System.out.print("Enter request:");
               
               final String userInput = userIn.nextLine();
               out.println(userInput);
               
               System.out.println(">>" + in.nextLine());
           }

}catch (IOException ex) {
    
    System.out.println("ERROR:" + ex.getMessage());
}
    }
    public void start(){
        
    }
    public static void main(String[] args) {
}
}
