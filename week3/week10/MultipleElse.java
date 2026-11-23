package week10;
import java.util.Scanner; 
public class MultipleElse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number1 = 0, number2 = 0;
        System.out.println("Enter first number: ");
        number1 = input.nextInt();
        System.out.println("Enter second number: ");
        number2 = input.nextInt();
        if (number1%number2 == 0){
            System.out.println("Multiple");
        }else{
            System.out.println("Not a Multiple");
        }
    }
}