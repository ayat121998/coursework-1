/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package coursework1;


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


public class Server {

   private int _port;

    Server(int port) {
        _port = port;
    }

    public void start() {

        try {

            InputStream in = new ServerSocket(8000).accept().getInputStream();
            //final Scanner in = new Scanner(clientConnection.getInputStream());

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
