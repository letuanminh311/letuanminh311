import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        a = sc.nextDouble();
        double volume = Math.pow(a,3);
        System.out.println("The volume is: " + volume);
    }
}