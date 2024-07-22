import java.util.*;
public class currency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 rupee");
        System.out.println("2 dollar");
        System.out.println("3 euro");
        System.out.println("4 yen");
        System.out.println("5 dinar");
        
        System.out.println("choose the currency : ");
        int choice = sc.nextInt();

        System.out.println("enter the amount : ");
        double amount = sc.nextDouble();

        switch(choice) {
            case 1: INDto(amount);
            break;

            case 2: USDto(amount);
            break;

            case 3: EURto(amount);
            break;

            case 4: YENto(amount);
            break;

            case 5: KWDto(amount);
            break;

            default : System.out.println("INVALID CHOICE !");
         } }


         public static void INDto(double amount) {
            System.out.println(amount + " rupee = "+(amount*0.013)+ " dollar");
            System.out.println(amount + " rupee = "+(amount*0.011)+ " euro");
            System.out.println(amount + " rupee = "+(amount*1.88)+ " yen");
            System.out.println(amount + " rupee = "+(amount*0.0037)+ " dinar");
            
            System.out.println();
         }

         public static void USDto(double amount) {
            System.out.println(amount + " dollar = "+(amount*83.64)+ " rupee");
            System.out.println(amount + " dollar = "+(amount*0.92)+ " euro");
            System.out.println(amount + " dollar = "+(amount*156.85)+ " yen");
            System.out.println(amount + " dollar = "+(amount*0.31)+ " dinar");
            
            System.out.println();
         }

         public static void EURto(double amount) {
            System.out.println(amount + " euro = "+(amount*91.02)+ " rupee");
            System.out.println(amount + " euro = "+(amount*1.09)+ " dollar");
            System.out.println(amount + " euro = "+(amount*170.69)+ " yen");
            System.out.println(amount + " euro = "+(amount*0.33)+ " dinar");
            
            System.out.println();
         }

         public static void YENto(double amount) {
            System.out.println(amount + " yen = "+(amount*0.53)+ " rupee");
            System.out.println(amount + " yen = "+(amount*0.0064)+ " dollar");
            System.out.println(amount + " yen = "+(amount*0.0059)+ " euro");
            System.out.println(amount + " yen = "+(amount*0.0019)+ " dinar");

            System.out.println();
         
         }

         public static void KWDto(double amount) {
            System.out.println(amount + " dinar = "+(amount*237.24)+ " rupee");
            System.out.println(amount + " dinar = "+(amount*3.27)+ " dollar");
            System.out.println(amount + " dinar = "+(amount*3.00)+ " euro");
            System.out.println(amount + " dinar = "+(amount*512.81)+ " yen");

            System.out.println();
         }





    
}
