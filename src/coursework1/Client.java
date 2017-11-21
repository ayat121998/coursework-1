/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
//public class Client  {

 /*private int port;
    private String host;

    Client(String host, int port) {
        this.port = port;
        this.host = host;
    }
    ObjectOutputStream outputToServer = null;
    ObjectInputStream fromServer = null;

    public void start() throws IOException {
        int option = 0;
        ArrayList<Shape> Shapes = new ArrayList<Shape>();
        System.out.println("Welcome to the shapes application. Please look at the menu and select the option you would like.");
        Socket client = new Socket("localhost", 8000);
        while (option != 5) {

            System.out.println("Enter a option");
            System.out.println("1. 2D Shapes");
            System.out.println("2. 3D Shapes");
            System.out.println("3. Send Shapes");
            System.out.println("4. Receive Shapes from Server");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);

            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("2D Shapes");
                System.out.println("");
                System.out.println("Enter Shape's Name:");
                String name = scanner.next();

                System.out.println("Enter an option: ");
                System.out.println("1. Create Triangle :");
                System.out.println("2. Create Circle   :");
                System.out.println("3. Create Rectangle:");
                System.out.println("4. Exit");
                String twoDOption = scanner.next();

                if (twoDOption.equals("1")) {
                    System.out.println("Enter Dimetions of Triangle");
                    System.out.println("Side 1: ");
                    double s1 = scanner.nextDouble();
                    System.out.println("Side 2:");
                    double s2 = scanner.nextDouble();
                    System.out.println("Side 3:");
                    double s3 = scanner.nextDouble();
                    System.out.println("Side 4:");
                    double s4 = scanner.nextDouble();

                    Triangle triangle = new Triangle(name, s1, s2, s3, s4);

                    triangle.displayDescription();

                    System.out.println("Area     :" + triangle.getArea());

                    System.out.println("Perimeter:" + triangle.getPerimeter());

                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Send the triangle " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the triangle to the server or not.

                } else if (twoDOption.equals("2")) {
                    System.out.println("Enter Dimetions of Circle");
                    System.out.println("Radius");
                    double radius = scanner.nextDouble();

                    Circle circle = new Circle(name, radius);

                    circle.displayDescription();

                    System.out.println("Area     :" + circle.getArea());

                    System.out.println("Perimeter:" + circle.getPerimeter());

                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Send the Circle " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the circle to the server or not.      

                } else if (twoDOption.equals("3")) {
                    System.out.println("Enter Dimetions of rectangle");
                    System.out.println("Height");
                    int height = scanner.nextInt();
                    System.out.println("Width");
                    int width = scanner.nextInt();

                    Rectangle rectangle = new Rectangle(name, height, width);

                    rectangle.displayDescription();

                    System.out.println("Area     :" + rectangle.getArea());

                    System.out.println("Perimeter:" + rectangle.getPerimeter());

                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Send the rectangle " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the rectangle to the server or not.   

                } else {
                    System.out.println("You have not entered a valid letter corresponding to the 2D shape you wish to create.");
                }
                System.exit(0);
            } else if (option == 2) {
                System.out.println("3D Shapes");

                System.out.println("Enter Shape's Name:");
                String name = scanner.next();

                System.out.println("Enter an option:");
                System.out.println("1. Cylinder   :");
                System.out.println("2. Sphere     :");
                System.out.println("To exit, enter anything else");
                String threeDOption = scanner.next();

                if (threeDOption.equals("1")) {
                    System.out.println("Enter Dimetions of cylinder");
                    System.out.println("Radius");
                    int radius = scanner.nextInt();
                    System.out.println("Height");
                    int height = scanner.nextInt();

                    Cylinder cylinder = new Cylinder(name, radius, height);

                    cylinder.displayDescription();

                    System.out.println("Surface Area:" + cylinder.getSA());

                    System.out.println("Volume      :" + cylinder.getVolume());

                    //Calculate the surface area and volume and then move to ArrayList<Shape>
                    System.out.println("Send the cylinder " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the cylinder to the server or not.

                } else if (threeDOption.equals("2")) {
                    System.out.println("Enter Dimetions of sphere");
                    System.out.println("Radius");
                    int radius = scanner.nextInt();

                    Sphere sphere = new Sphere(name, radius);

                    sphere.displayDescription();

                    System.out.println("Surface Area:" + sphere.getSA());

                    System.out.println("Volume      :" + sphere.getVolume());

                    //Calculate surface area and volume and then move to ArrayList<Shape>
                    System.out.println("Send the sphere " + name + " to the server");
                    System.out.println("Select y for yes and n for no");
                    String response = scanner.next();
                    //Based on user input, either send the sphere to the server or not.

                } else {
                    System.out.println("Invalid Entry for 3D Shapes");
                }
                System.exit(0);

            } 
            else if (option == 3) {
                System.out.println("You have selected send shapes");
                System.out.println("");
            }
                else if (option == 4) {
                //Create a line that will allow the client to receive data from the files about shapes stored.
                System.out.println("Shape to be received:");
                System.out.println("1. All");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.println("4. Circle");
                System.out.println("1. Sphere");
                System.out.println("2. Cylinder:");
                System.out.println("4. Exit");
                String receive = scanner.next();

            } else if (option == 5) {
                System.exit(0);

            } else {
                System.out.println("Please enter a valid input");
                System.out.println();
            }
         /*   try {
                final Socket client = new Socket("127.0.0.1", 5555);

                final PrintWriter out = new PrintWriter(client.getOutputStream(), true);

                final Scanner in = new Scanner(client.getInputStream());

                final Scanner userIn = new Scanner(System.in);

                while (true) {
                    System.out.print("Enter request: ");

                    final String userInput = userIn.nextLine();

                    out.println(userInput);

                    System.out.println(">> " + in.nextLine());
                }
            } catch (IOException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        }*/

    
        
