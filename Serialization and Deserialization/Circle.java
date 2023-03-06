package src;

import java.io.Serializable;

public class Circle extends Shape implements Serializable {

    public int dimension1;
    public Circle(int dim1){
        this.dimension1 =dim1;
    }
    //Methods from Shape overridden
    @Override
    public double calculateArea() {
        //static field
        return super.pi*dimension1*dimension1;
    }

    @Override
    public double calculatePerimeter() {
        //static field
        return 2*super.pi*dimension1;
    }

}
