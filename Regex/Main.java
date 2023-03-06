import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        //Patter for Positive
        System.out.println("Patter for phone number : ^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$ \n Input phone number: 5104534573 : "+Pattern.matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$", "510 453 4533"));
        //Patter for Negative
        System.out.println("Patter for phone number: ^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$ \n Input not a phone number 51045345777 : "+Pattern.matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$", "51045345777")+"\n");

        //Patter for Positive
        System.out.println("Patter for SSN:\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b \n Input for SSN: 123-45-6789: "+Pattern.matches("\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b", "123-45-6789"));
        //Patter for Negative
        System.out.println("Patter for SSN:\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b  \n Input for SSN: 123456789 : "+Pattern.matches("\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b", "123456789")+"\n");

        //Patter for Positive
        System.out.println("Patter for date for Mon dd,yyyy: \\b[A-Z][a-z][a-z] [0-9][0-9],[0-9]{4}\\b  \n Input for Mon dd,yyyy: : Oct 04,2022 :"+Pattern.matches("\\b[A-Z][a-z][a-z] [0-9][0-9],[0-9]{4}\\b", "Oct 04,2022"));
        //Patter for Negative
        System.out.println("Patter for date for Mon dd,yyyy: \\b[A-Z][a-z][a-z] [0-9][0-9],[0-9]{4}\\b  \n Input for Mon dd,yyyy: October 04 2022 :"+Pattern.matches("\\b[A-Z][a-z][a-z] [0-9][0-9],[0-9]{4}\\b", "October 04 2022")+"\n");

        //Patter for Positive
        System.out.println("Patter for date for Zip Code :\\b[0-9]{5}(-[0-9]{4})?\\b \n Input for Zip Code: 95113 : "+Pattern.matches("\\b[0-9]{5}(-[0-9]{4})?\\b", "95113"));
        //Patter for Negative
        System.out.println("Patter for date for Zip Code : \\b[0-9]{5}(-[0-9]{4})?\\b \n Input for Zip Code: 580007 : "+Pattern.matches("\\b[0-9]{5}(-[0-9]{4})?\\b", "580007")+"\n");

        //Patter for Positive
        System.out.println("Patter for IP Address:\\b([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\b \n Input for IP Address: 999.999.999.999 : "+Pattern.matches("\\b([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\b", "999.999.999.999"));
        //Patter for Negative
        System.out.println("Patter for IP Address:\\b([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\b  \n Input for IP Address: 999999999999 : "+Pattern.matches("\\b([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\b", "999999999999"));




    }
}