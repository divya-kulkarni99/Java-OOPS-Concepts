public class Main {
    public static void main(String[] args) {
        //Triangle area and perimeter
        Triangle tArea = new Triangle(10,20);
        Triangle tPerimeter = new Triangle(10,20,30);
        System.out.println("Area of Triangle is "+tArea.calculateArea());
        System.out.println("Perimeter of Triangle is "+tPerimeter.calculatePerimeter());
        //Static field
        Triangle.Color();
        //Square area and perimeter
        Square s = new Square(20);
        System.out.println("Area of Square is "+s.calculateArea());
        System.out.println("Perimeter of Square is "+s.calculatePerimeter());
        //Static field
        Square.Color();
        //Rectangle area and perimeter
        Rectangle r = new Rectangle(10,20);
        System.out.println("Area of Rectangle is "+r.calculateArea());
        System.out.println("Perimeter of Rectangle is "+r.calculatePerimeter());
        //Static field
        Rectangle.Color();
        //Circle area and perimeter
        Circle c = new Circle(10);
        System.out.println("Area of Circle is "+c.calculateArea());
        System.out.println("Perimeter of Circle is "+c.calculatePerimeter());
        //Static field
        Circle.Color();


    }
}