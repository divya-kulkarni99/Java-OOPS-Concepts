public class Laptop {
    int screenSize = 13;
    int yearOfManufacturer = 2022;
    float weight = 1.4f;
    boolean isFoldable = true;
    char chargerType = 'c';
    String chip = "M1";
    String company ="Apple";
    String color = "Grey";


    public Laptop(int id){
        int number = id;
        System.out.println("I am an outer class"+number);
    }

    public float getWeight(){
        return weight;
    }

    public String getFoldable(){
        if(isFoldable) {
            return "yes";
        }
        return "no";
    }

    public String getChip(){
        return this.chip;
    }
}
