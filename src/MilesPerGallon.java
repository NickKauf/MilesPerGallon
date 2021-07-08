import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("enter traveled miles: ");
        int miles = kb.nextInt();
        System.out.println("enter gallons: ");
        int gallons = kb.nextInt();
        int mpg = miles / gallons;
        System.out.printf("the result is %d miles/gallon", mpg);

    }


}
