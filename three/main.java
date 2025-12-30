
import java.util.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your first number :");
        int num1 = sc.nextInt();

        System.out.println("Ener Your 2nd number :");
        int num2 = sc.nextInt();

        if (num1== num2) {
            System.out.println("Equal");
        } else if (num1 > num2){
            System.out.println("number 1 " + num1 + " is bigger");
        }
        else if(num2 > num1){
            System.out.println("num2 " + num2 + " is bigger");
        }
    }
}
