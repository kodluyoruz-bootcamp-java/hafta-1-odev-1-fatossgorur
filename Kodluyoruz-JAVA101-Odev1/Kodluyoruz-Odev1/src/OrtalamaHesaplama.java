public class OrtalamaHesaplama {
    /*
    0-2000 arasinda 3,5,7 ve 53'e bolunebilen sayilarin agirlikli
    ortalamasini bulan uygulama
     */
    public static void main(String[] args) {

        int  toplam = 0;
        int sayi_adedi=0;

        for(int i = 0 ; i<2000 ; i++ ){
            if(i%3 ==0 && i%5 ==0 && i%7 ==0 && i%53 ==0 ){
                System.out.println(i); //3,5,7,53'e bolunen sayilar
                toplam = toplam + i ;
                sayi_adedi++;
            }
        }
        double ortalama = toplam / sayi_adedi ;
        System.out.println("Sayilarin toplami = " + toplam);
        System.out.println("Sayilarin adedi = "+sayi_adedi);
        System.out.println("Ortalama = " +ortalama);

    }
}
