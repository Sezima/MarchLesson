package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class classFirstExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers: ");
        int n = input.nextInt();
        int n2 = input.nextInt();

        try {

            System.out.println(n / n2);

        } catch (InputMismatchException e){
            System.out.println("any");
        } catch (ArithmeticException e){
            System.out.println("num");
        }
        catch (Exception e){
            System.out.println("pls study mathsm we cannot divide with zero");
            System.err.println("Oh no");
        }

    }

}
