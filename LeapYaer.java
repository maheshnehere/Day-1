import java.util.Scanner;

public class LeapYaer {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the year");

        int num=obj.nextInt();

        if(num%4 == 0 && num%100 !=0 && num%400 ==0){

            System.out.println("The year is a leap year");
        }
        else{

            System.out.println("not a leap year");
        }
    }
}
