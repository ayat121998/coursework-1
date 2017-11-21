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
public abstract class ThreeDShape extends Shape {

    public ThreeDShape(String name, int noOfSides) {
        super(name, noOfSides);
    }
   
    
    
    public abstract double getSA();
    
    public abstract double getVolume();
}



   /* public ThreeDShape(int numberOfSides, String name) {
        super(numberOfSides, name);
        
        
    }
    public double getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
*/