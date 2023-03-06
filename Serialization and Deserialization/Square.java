package src;

import java.io.Serializable;

public class Square extends Shape implements Serializable {
    public int dimension1;
    public Square(int dim1){
        this.dimension1 =dim1;

    }
    //Methods from Shape overridden
    @Override
    public double calculateArea() {

        return dimension1*dimension1;
    }

    @Override
    public double calculatePerimeter() {
        return 4*dimension1;
    }

}

