package src;

import java.io.Serializable;

public class Triangle extends Shape implements Serializable {


    int dimension1,dimension2,dimension3;

    //Constructor overloading
    Triangle(int dim1, int dim2, int dim3){

        this.dimension1=dim1;
        this.dimension2=dim2;
        this.dimension3=dim3;
    }
    Triangle(int dim1, int dim2){
        this.dimension1 =dim1;
        this.dimension2 =dim2;
    }
    //Methods from Shape overridden
    @Override
    public double calculateArea() {

        return dimension1*dimension2*0.5;
    }

    @Override
    public double calculatePerimeter() {
        return dimension1*dimension3*dimension2;
    }





}
