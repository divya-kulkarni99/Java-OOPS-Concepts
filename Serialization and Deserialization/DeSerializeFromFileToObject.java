package src;

import java.io.*;

public class DeSerializeFromFileToObject {
    public static Object DeSerializeFromFileToObject(String fileName) {
        try {
            //Object of FileInputStream of a file
            FileInputStream fileStream = new FileInputStream(new File(fileName));
            //Create a ObjectInputStream convert to object
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            //converts byte to object
            Object deserializeObject = objectStream.readObject();
            //Close all streams
            objectStream.close();
            fileStream.close();
            return deserializeObject;

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        return null;
    }

        public static void main (String[]args)
        {
            Triangle t = new Triangle(10, 20);
            SerializeToFile.SerializeToFile(t, "triangleIsSerialized");
            Square s = new Square(10);
            SerializeToFile.SerializeToFile(s, "squareIsSerialized");
            Rectangle r = new Rectangle(10, 20);
            SerializeToFile.SerializeToFile(r, "rectangleIsSerialized");
            Circle c = new Circle(10);
            SerializeToFile.SerializeToFile(c, "circleIsSerialized");



            Triangle deSerializedAreaTriangle = (Triangle) DeSerializeFromFileToObject("triangleIsAreaSerialized");
            System.out.println("Triangle area is " + deSerializedAreaTriangle.calculateArea());
            Triangle deSerializedPerimeterTriangle = (Triangle) DeSerializeFromFileToObject("triangleIsPerimeterSerialized");
            System.out.println("Triangle Perimeter is " + deSerializedPerimeterTriangle.calculatePerimeter());

            Square deSerializedSquare = (Square) DeSerializeFromFileToObject("squareIsSerialized");
            System.out.println("Square area is " + deSerializedSquare.calculateArea());
            System.out.println("Square Perimeter is " + deSerializedSquare.calculatePerimeter());

            Rectangle deSerializedRectangle = (Rectangle) DeSerializeFromFileToObject("rectangleIsSerialized");
            System.out.println("Rectangle area is " + deSerializedRectangle.calculateArea());
            System.out.println("Rectangle Perimeter is " + deSerializedRectangle.calculatePerimeter());

            Circle deSerializedCircle = (Circle) DeSerializeFromFileToObject("circleIsSerialized");
            System.out.println("Circle area is " + deSerializedCircle.calculateArea());
            System.out.println("Circle Perimeter is " + deSerializedCircle.calculatePerimeter());



        }

}