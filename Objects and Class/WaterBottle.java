public class WaterBottle {
    int volume = 24;
    int cost = 14;
    String material = "Tritan Plastic";
    boolean isLeakProof = true;
    String company = "Contigo";
    boolean isFilled = false;
    String soldBy = "Amazon.com";
    String availableColors = "Blue and Purple";

    public WaterBottle(int id){
        int number = id;
        System.out.println("I am an outer class"+number);
    }

    public String getIsFilled(){
        if(isFilled){
            return "yes";
        }
        return "no";
    }

    public String getSoldBy() {
        return soldBy;
    }

    public int getVolume(){
        return volume;
    }
}
