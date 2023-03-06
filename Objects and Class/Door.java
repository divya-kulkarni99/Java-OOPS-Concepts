public class Door {
    int numberOfBolts =2;
    boolean hasStopper=false;
    boolean hasLock=true;
    String typeOfLock="Levers";
    String store="Home depot";
    String color ="white";
    String material="Metal";

    public Door(int id){
        int number = id;
        System.out.println("I am an outer class"+number);

    }

    public String getTypeOfLock() {
        return typeOfLock;
    }

    public String hasLock() {
        if (hasLock) {
            return "yes";
        }
        return "no";
    }

    public String getStore() {
        return store;
    }
}
