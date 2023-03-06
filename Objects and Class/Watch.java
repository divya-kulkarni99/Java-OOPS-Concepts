public class Watch {
    int dialSize =36;
    int cost = 150;
    boolean isDigital = false;
    String quartzMovement = "Japanese";
    String company = "Daniel Wellington";
    String color = "black";
    String manufacturedIn = "Sweden";
    String strapMaterial = "Leather";

    public Watch(int id){
        int number = id;
        System.out.println("I am an outer class"+number);
    }

    public int getDialSize(){
        return dialSize;
    }

    public String getManufacturedIn(){
        return manufacturedIn;
    }

    public String getCompany(){
        return company;
    }


}
