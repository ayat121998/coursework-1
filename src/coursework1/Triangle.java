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
public class Triangle extends TwoDShape {
    private final double _side1;
    private final double _side2;
    private final double _base;
    private final double _height;

    public Triangle(String name, double side1, double side2, double base, double height){
        super(3, name);
        _side1=side1;
        _side2=side2;
        _base=base;
        _height=height;
    }

 
    
    
     @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\tI'm also a Triangle");
    }
    @Override
    public double getArea(){
        return (_height*_base)/2;
    }

    @Override
    public double getPerimeter(){
        return _side1+_side2+_base;
    }
}
    

