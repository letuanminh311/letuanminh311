import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextFloat();
        System.out.print("b =  ");
        b = sc.nextFloat();
        System.out.println("The perimeter of the rectangle is:" + (a + b)*2);
        System.out.println("The area of the rectangle is:" + (a*b));
        System.out.println("The width is: " + Math.min(a, b));
    }
}