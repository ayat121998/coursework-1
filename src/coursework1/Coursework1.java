/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

/**
 *
 * @author M00557670
 */
public class Coursework1 {

    /**
     * @param args the command line arguments
     */
      //  final static String FORMAT = "--server <port>\n--client <host><port>";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    /*    if(args.length ==0) {
            System.out.println("Invalid arguments provided. Arguments: ");
            System.out.println(FORMAT);
            return;
        }
        
        if(args[0].equals("--server") && args.length ==2) {
            final Server server = new Server(Integer.parseInt(args[1]));
            server.start();
        } else if(args[0].equals("--client") && args.length ==3) {
            final Client client = new Client(args[1],Integer.parseInt(args[2]));
            client.start();
        } else{
            System.out.println("Invalid arguments provided. Arguments: ");
            System.out.println(FORMAT);;
        }
        
    }
}   */

    
        // TODO code application logic here
        final Rectangle Rectangle = new Rectangle("A Rectangle", 10, 20);
        Rectangle.displayDescription();
        System.out.println("Area   : " + Rectangle.getArea());
        System.out.println("Perimeter   : " + Rectangle.getPerimeter());

        final Circle Circle = new Circle("A Circle", 10);
        Circle.displayDescription();
        System.out.println("Area   : " + Circle.getArea());
        System.out.println("Perimeter   : " + Circle.getPerimeter());

        final Sphere Sphere = new Sphere("A Sphere", 10) {};
        Sphere.displayDescription();
        System.out.println("Volume   : " + Sphere.getVolume());
        System.out.println("Surface Area   : " + Sphere.getSA());

        final Cylinder Cylinder = new Cylinder("A Cylinder", 10,20);
        Cylinder.displayDescription();
        System.out.println("Volume   : " + Cylinder.getVolume());
        System.out.println("Surface Area   : " + Cylinder.getSA());

        final Triangle Triangle = new Triangle("A Triangle", 10,20,30,40);
        Triangle.displayDescription();
        System.out.println("Area   : " + Triangle.getArea());
        System.out.println("Perimeter   : " + Triangle.getPerimeter());

    }
    
}
