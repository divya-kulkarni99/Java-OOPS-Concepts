public class Square extends Shape{
    public int dimension1;
    public static String color = "Green";
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
    public static void Color(){
        System.out.println("Color of Square is "+Square.color);
    }

}

