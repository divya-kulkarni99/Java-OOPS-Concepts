public class Headphones {

    int lastsHours=15;
    int drivers=40;
    String brand="boAt";
    String connectorType ="Wireless";
    String modelName ="Rockerz 450";
    String manufacturedIn="India";
    boolean isBluetoothEnabled = true;
    boolean isFoldable =true;

    public Headphones(int id){
        int number = id;
        System.out.println("I am an outer class"+number);

    }
    public String getBrand(){
        return this.brand;
    }
    public String getConnectorType(){
        return this.connectorType;
    }

    public String getModelName(){
        return this.modelName;
    }


}
