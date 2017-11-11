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
public class Circle extends TwoDShape {
    private final double _radius;
    public Circle(String name, double radius) {
        super(1, name);
        _radius = radius;
        
        
    }

     @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\tI'm also a circle");
    }
    @Override
    public double getArea() {
        
        
        return 2 * Math.PI * (_radius)*(_radius);
    }

    @Override
    public double getPerimeter() {
        
        
        return 2 * Math.PI * _radius;
    }
    
    
}
