import java.util.Scanner;
public class Constructor {
    long number;
    String name;
    static Scanner scan = new Scanner(System.in);
    Constructor(long number, String name){
        this.number = number;
        this.name = name;
    }

    public static void main(String []r){
        System.out.println("Enter number of Customers");
        short records = scan.nextShort();
        Constructor[] custmr = new Constructor[records];
        for (int i = 0;i<custmr.length;i++){
            System.out.println("Enter the Customer " + (i+1) + " Details" );
            System.out.println("Enter the Customer " + (i+1) + " Number" );
            long no = scan.nextLong();
            System.out.println("Enter the Customer " + (i+1) + " Name" );
            String name = scan.next();
            Constructor obj = new Constructor(no,name);
            custmr[i] = obj;

        }
        for(int i = 0; i<custmr.length;i++){
            Constructor obj = custmr[i];
            System.out.println("Customer " + (i+1) +"Details");
            System.out.println("Customer" + (i+1) + obj.number);
            System.out.println("Customer" + (i+1) + obj.name);
        }



    }

    
}
