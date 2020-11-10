import java.util.Scanner;

public class YuvarlamaIslemi {
    /*
    Kullanicidan alinan ondalikli bir sayinin ondalik kismina
    göre asagi ve yukari dogru yuvarlama islemi yapan program
     */
    public static void main(String[] args) {
        System.out.print("Bir sayi giriniz = ");
        Scanner scanner = new Scanner(System.in);
        double sayi = scanner.nextDouble();

        System.out.println("Girilen sayi nasil yuvarlansin? ");
        System.out.println("1-Asagi ");
        System.out.println("2-Yukari ");
        int secim = scanner.nextInt();
        if(secim == 1){
            double sayi1 = Math.floor(sayi);
            System.out.println("Asagi yuvarlama = " + sayi1);

        }else if (secim == 2){
            double sayi2 = Math.ceil(sayi);
            System.out.println("Yukari yuvarlama = " + sayi2);

        }else
            System.out.println("Gecersiz islem");
    }
}
