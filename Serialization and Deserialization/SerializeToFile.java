package src;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeToFile {

    public static void SerializeToFile(Object classObject, String fileName) {
        try {
            //Object of FileOutputStream of a file
            FileOutputStream fileStream = new FileOutputStream(fileName);
            //Create a ObjectOutputStream convert object to byte
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            //writes to the file
            objectStream.writeObject(classObject);
            //close all streams
            objectStream.close();
            fileStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(10, 20);
        Triangle t2 = new Triangle(10,20,30);
        SerializeToFile(t, "triangleIsAreaSerialized");
        SerializeToFile(t2, "triangleIsPerimeterSerialized");
        Square s = new Square(10);
        SerializeToFile(s, "squareIsSerialized");
        Rectangle r = new Rectangle(10, 20);
        SerializeToFile(r, "rectangleIsSerialized");
        Circle c = new Circle(10);
        SerializeToFile(c, "circleIsSerialized");


    }
}