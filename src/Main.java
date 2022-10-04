import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double araTutar, tutar;
        System.out.println("Gidilen mesafe nedir?");
        double km = input.nextDouble();

        tutar =  km*2.20 +10;
        tutar = tutar<20 ? 20: tutar;
        System.out.println("Ücret: " + tutar +" TL" );

    }
}