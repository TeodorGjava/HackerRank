package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionByType {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
    }
}
