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
    public static void main(String[] args) {
        // TODO code application logic here
        final Rectangle Rectangle = new Rectangle("A Rectangle" , 10, 20);
        Rectangle.displayDescription();
        System.out.println("Area   : " + Rectangle.getArea());
                System.out.println("Perimeter   : " + Rectangle.getPerimeter());
                
                
                
        final Circle Circle = new Circle("A Circle" , 10);
        Circle.displayDescription();
        System.out.println("Area   : " + Circle.getArea());
                System.out.println("Perimeter   : " + Circle.getPerimeter());
                
        final Cube Cube = new Cube("A Cube" , 10);
        Cube.displayDescription();
        System.out.println("Area   : " + Cube.getArea());
                System.out.println("Perimeter   : " + Cube.getPerimeter());
                
                
        final Sphere Sphere = new Sphere("A Sphere" , 10);
        Sphere.displayDescription();
        System.out.println("Area   : " + Sphere.getArea());
                System.out.println("Perimeter   : " + Sphere.getPerimeter());
                
                
    }
    
}
