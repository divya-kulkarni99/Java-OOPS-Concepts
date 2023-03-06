public class Monitor {
    int length = 10;
    int width = 20;
    int weight = 3;
    int numberOfButtons = 5;
    int numberOfSockets = 4;
    String color = "Black";
    String brand = "ViewSonic";
    String cable = "hdmi to c type";

    public Monitor(int id){
        int number = id;
        System.out.println("I am an outer class \n"+number);
    }
    public void view(){

    }
    public void screenConnect(){

    }
    public void powerSupply(){

    }

    public class Work{
        public void print() {
            System.out.println("I am an Work inner class");
        }
    }
    public class PlayGames{
        public void print() {
            System.out.println("I am an PlayGames inner class");
        }
    }

    public class Movie{
        public void print() {
            System.out.println("I am a Movie inner class");
        }
    }






}
