package SeleniumSession;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age ");
    
        int value = scanner.nextInt();
        assert value >= 18 : " Not valid";
    
        System.out.println("value is " + value);
    
        System.out.print("Enter your Weight ");
        value = scanner.nextInt();
        assert value >= 20 : " Underweight";
        System.out.println("value is " + value); // value is 15
    
        int i = 7;
        if (i % 3 == 0) {
            //...
        } else if (i % 3 == 1) {
            //...
        } else {
            assert i % 3 == 2 : i;
            //...
        }
    }

        int sum ( int a, int b){
            System.out.println("Calculates the sum of a (int) + b (int) and returns the result (int)");
            assert (Integer.MAX_VALUE - a >= b) : "Value of " + a + " + " + b + " is too large to add.";
            final int result = a + b;
            assert (result - a == b) : "Sum of " + a + " + " + b + " returned wrong sum " + result;
            return result;
        }
    
    
    



	}


