public class Desk {

    int weight = 30;
    int legs = 4;
    int armrest = 2;
    int height=12;
    String color = "Beige";
    String brand = "Ikea";
    String material= "wooden";
    boolean hasWheels;



    public Desk(int id){
        int number = id;
        System.out.println("I am an outer class"+number);
    }


    public String getBrand() {
        return this.brand;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColor() {
        return this.color;
    }



}
