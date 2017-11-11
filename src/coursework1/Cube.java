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
public class Cube extends ThreeDShape{
    private final double _edge;

    public Cube(String name, double edge) {
        super(6, name);
        _edge = edge;
        
        
        
    }
    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\tI'm also a cube");
    }
    @Override
    public double getArea() {
        
        return (_edge * _edge * _edge);
    }

    @Override
    public double getPerimeter() {
        
        return 6 * (_edge);
    }
    
}
