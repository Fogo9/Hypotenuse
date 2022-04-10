import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        int a, b, c, u;

        double area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Side 1 : ");

        a = scan.nextInt();

        System.out.print("Side 2 : ");

        b = scan.nextInt();

        System.out.print("Side 3 : ");

        c = scan.nextInt();

        u = (a + b + c) / 2;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("Area of Triangle : " + area);


    }
}
