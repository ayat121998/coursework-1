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
public class Rectangle extends TwoDShape {

    private final double _height;
    private final double _width;

    public Rectangle(String name, double height, double width) {
        super(4, name);
        _height = height;
        _width = width;

    }
    
    

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\tI'm also a rectangle");
    }

    @Override
    public double getArea() {
        return _height * _width;

    }

    public double getPerimeter() {
        return (_height + _width) * 2;
    }


}
