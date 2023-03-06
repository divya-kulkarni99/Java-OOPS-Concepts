public class Board {

    int length = 3;
    int breadth = 2;
    String color = "white and silver";
    boolean hasHooks =true;
    boolean isPortable = true;
    boolean hasStand= true;
    String material = "Alloy Steel";
    String includes = "Duster and Pen";

    public Board(int id){
        int number = id;
        System.out.println("I am an outer class"+number);
    }

    public String getMadeUpOf(){
        return material;
    }

    public String getIncludes(){
        return includes;
    }

    public String getIsPortable(){
        if(isPortable){
            return "yes";
        }
        return "no";
    }
}
