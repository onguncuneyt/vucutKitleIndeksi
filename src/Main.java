import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double kilo,boy,sonuc;

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        sonuc = kilo / (boy*boy);

        System.out.println("Vücut kitle indeksiniz : " + sonuc);

    }
}