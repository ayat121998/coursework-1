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
public abstract class TwoDShape extends Shape {

    public TwoDShape(String name, int noOfSides) {
        super(name, noOfSides);
    }
   
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}


/*
    public TwoDShape(int numberOfSides, String name) {
        super(numberOfSides, name);
    }
    
     public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
*/