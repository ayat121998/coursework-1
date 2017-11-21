/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;



/**
 *
 * @author M00558529
 */
public abstract class TwoDShape extends Shape {

    public TwoDShape(String name, int noOfSides) {
        super(name, noOfSides);
    }
   
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}