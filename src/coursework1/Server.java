/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import coursework1.Shape;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Administrator
 */
public class Server {

    private int _port;

    Server(int port) {
        _port = port;
    }

public static void main(String[] args) throws IOException {
        try {
            
            InputStream in = new ServerSocket(8000).accept().getInputStream();
         

            Object object = new ObjectInputStream(in).readObject();
            System.out.println(object.getClass() + ": " + object);
            
      
            ArrayList<Shape> castedObject = (ArrayList<Shape>) object;
            for (Shape s : castedObject) {
                s.printInfo();
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}





  /*    private static ArrayList<Shape> shapesArray = new ArrayList<Shape>();

    private static ObjectOutputStream shapeToClient;
    private static ObjectInputStream shapeFromClient;

    private static ServerSocket serverSocket;
    private static Socket socket;
    
    public static void main(String[] args) {
    System.out.println ("server started");
    
    
    try{
    while (true) {
    
                serverSocket = new ServerSocket(5555);
                
                socket = serverSocket.accept();
                
                System.out.println("connect ");
                shapeToClient = new ObjectOutputStream(socket.getOutputStream());
                
                shapeFromClient = new ObjectInputStream(socket.getInputStream());
                
                //Shapes clientShape = (Shapes)shapeFromClient.readObject();
                
                readObject();
                
                //shapesArray.add(clientShape);
              //  System.out.println(shapesArray.get(0).getName());

            }
    
    }catch(Exception e){
        System.out.println(e);
    }
    
    
    }
    
    public static void readObject(){
        try{
            
                
            Shape clientShape = (Shape)shapeFromClient.readObject();
            
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    Server(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    
 /*  
    private int _port;
    Server(int port) {
      _port = port;
    }

    public void start() {

        
        try {
            final ServerSocket server = new ServerSocket(_port);

            final Socket clientConnection = server.accept();

            final PrintWriter out = new PrintWriter(clientConnection.getOutputStream(), true);

            final Scanner in = new Scanner(clientConnection.getInputStream());

            while (in.hasNext()) {

                final String clientRequest = in.nextLine();

                if (!clientRequest.isEmpty()) {

                    out.println("Request received '" + clientRequest.toUpperCase() + "'");
                }
            }
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
*/
    