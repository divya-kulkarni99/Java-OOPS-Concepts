public class Main {
    public static void main(String[] args){
        Monitor outer1= new Monitor(1);
        Monitor outer2= new Monitor(2);
        Monitor outer3= new Monitor(3);
        Monitor.Work working = outer1.new Work();
        working.print();
        Monitor.PlayGames games = outer2.new PlayGames();
        games.print();
        Monitor.Movie watch = outer3.new Movie();
        watch.print();

        Desk deskObj1= new Desk(1);
        Desk deskObj2= new Desk(2);
        Desk deskObj3= new Desk(3);
        String brandName = deskObj1.getBrand();
        String colorOfDesk=deskObj2.getColor();
        String materialOfDesk = deskObj3.getMaterial();
        System.out.println("Brand of desk is "+brandName+" \t Color of Desk is "+colorOfDesk+" \tMaterial of Desk is "+materialOfDesk);

        Book bookObj1= new Book(1);
        Book bookObj2= new Book(2);
        Book bookObj3= new Book(3);
        String writer = bookObj1.getWriter();
        String editorOfBook = bookObj2.getEditor();
        String titleOfBook = bookObj3.getTitle();
        System.out.println("Writer of Book is "+writer+" \t Editor of the book is "+editorOfBook+" \t Title of the book is "+titleOfBook);

        MobilePhone phoneObj1 = new MobilePhone(1);
        MobilePhone phoneObj2 = new MobilePhone(2);
        MobilePhone phoneObj3 = new MobilePhone(3);
        String manufacturer = phoneObj1.getManufacturer();
        int series = phoneObj2.getSeries();
        float size = phoneObj3.getSize();
        System.out.println("Mobile Manufacturer is "+manufacturer+" \t Iphone Series "+series+" \t Size of mobile "+size+"inches");


        Door doorObj1 = new Door(1);
        Door doorObj2 = new Door(2);
        Door doorObj3 = new Door(3);
        System.out.println("Purchased from "+doorObj1.getStore()+"\t Does it have lock System? "+doorObj2.hasLock()+"\tWhat is the type of Lock? "+doorObj3.getTypeOfLock());

        Headphones headphonesObj1 = new Headphones(1);
        Headphones headphonesObj2 = new Headphones(2);
        Headphones headphonesObj3 = new Headphones(3);
        System.out.println("Brand "+headphonesObj1.getBrand()+"\t Connect type? "+headphonesObj2.getConnectorType()+"\t Model name  "+headphonesObj3.getModelName());


        Laptop laptopObj1 = new Laptop(1);
        Laptop laptopObj2 = new Laptop(2);
        Laptop laptopObj3 = new Laptop(3);
        System.out.println("Chip used is "+laptopObj1.getChip()+" Weight of Laptop "+laptopObj2.getWeight()+"kgs Is it foldable? "+laptopObj3.getFoldable());


        WaterBottle waterObj1 = new WaterBottle(1);
        WaterBottle waterObj2 = new WaterBottle(2);
        WaterBottle waterObj3 = new WaterBottle(3);
        System.out.println("Sold by "+waterObj1.getSoldBy()+" \t Volume "+waterObj2.getVolume()+"OZ"+" \t Is it filled "+waterObj3.getIsFilled());

        Watch watchObj1 = new Watch(1);
        Watch watchObj2 = new Watch(2);
        Watch watchObj3 = new Watch(3);
        System.out.println("Company "+watchObj1.getCompany()+" \t DialSize "+watchObj2.getDialSize()+"MM"+" \t  Manufactured in "+watchObj3.getManufacturedIn());

        Board boardObj1 = new Board(1);
        Board boardObj2 = new Board(2);
        Board boardObj3 = new Board(3);
        System.out.println("Material of the board "+boardObj1.getMadeUpOf()+" \t Is it portable? "+boardObj2.getIsPortable()+" \t  Includes "+boardObj3.getIncludes());



    }

}
