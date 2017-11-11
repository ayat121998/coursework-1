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
public class Sphere extends ThreeDShape {
    
    private final double _radius;

    public Sphere(String name, double radius) {
        super(1, name);
        _radius = radius;
    }

     @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\tI'm also a sphere");
    }
    
    
    @Override
    public double getArea() {
        
        return 3 * Math.PI * _radius * _radius ;
    }

    @Override
    public double getPerimeter() {
        
    
        
        return 1.333 * Math.PI * _radius * _radius * _radius ;
    
}
}