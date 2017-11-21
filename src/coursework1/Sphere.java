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

    private  double _radius;

    public Sphere(String name, double radius) {
        super(name,1);
        _radius = radius;
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\tI'm also a sphere");
    }

    @Override
    public double getVolume() {

        return 3 * Math.PI * _radius * _radius;
    }

    @Override
    public double getSA() {

        return 1.333 * Math.PI * _radius * _radius * _radius;

    }
}

  
