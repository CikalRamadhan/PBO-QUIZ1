import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alas;
        double tinggi;
        double luas;

        System.out.print("Enter alas: ");
        alas = sc.nextDouble();
        System.out.print("Enter tinggi: ");
        tinggi = sc.nextDouble();

        luas = 0.5 * alas * tinggi;
        System.out.println("Menghitung Luas segitiga");
        System.out.println("alas = " + alas + " cm");
        System.out.println("luas = " + luas + " cm square");

    }
}