public class MobilePhone {
    int numberOfSimCardSlots= 1;
    int series = 12;
    int numberOfPhysicalButtons =0;
    float size= 6.7f;
    String compatibility ="5G";
    String operatingSystem ="iOS 16";
    String manufacturedIn ="USA";
    String manufacturer ="Apple";
    boolean isAvailable= true;

    public MobilePhone(int id){
        int number = id;
        System.out.println("I am an outer class"+number);

    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public float getSize(){
        return this.size;
    }

    public int getSeries(){
        return this.series;
    }
}
