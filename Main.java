import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lala = new Scanner(System.in);


        int x ;
        double y;
        System.out.println("what is your age");
        x = lala.nextInt();

        System.out.println("what is your annual income");
        y= lala.nextDouble();

        System.out.println("what is your name");
         String name = lala.next();

        System.out.println("hello , "  + name + " your age is "  +  x  +  " and you income is $ " + y  );



    }
}