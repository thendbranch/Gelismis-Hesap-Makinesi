// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Gelişmiş Hesap Makinesi
            Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

        Hesap makinesinin fonksiyonları :

            1- Toplama İşlemi
            2- Çıkarma İşlemi
            3- Çarpma İşlemi
            4- Bölme işlemi
            5- Üslü Sayı Hesaplama
            6- Faktoriyel Hesaplama
            7- Mod Alma
            8- Dikdörtgen Alan ve Çevre Hesabı

            Her işlem için metot tanımla.
         */
        Scanner input = new Scanner(System.in);
        boolean a =true;

        while (a){
            System.out.println(" ");
            System.out.println("!! Hesap Makinesine Hoşgeldiniz !!");
            System.out.print("1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                    "9- Çıkış Yap\n" +
                    "Lütfen İşlem Seçiniz : ");
            int islem = input.nextInt();
            switch (islem){
                case 1 :
                    toplam();
                    break;
                case 2 :
                    cikarma();
                    break;
                case 3 :
                    carpma();
                    break;
                case 4 :
                    bolme();
                    break;
                case 5 :
                    usluSayi();
                    break;
                case 6 :
                    faktoriyel();
                    break;
                case 7 :
                    modAlma();
                    break;
                case 8 :
                    dikalancevre();
                    break;
                case 9 :
                    a=false;
                    break;
            }
        }
        System.out.println("Güle Güle tekrar bekleriz.");
    }



    // kullanıcıdan alınan sayıları topla.
    static void toplam (){
        Scanner input = new Scanner(System.in);

        System.out.println("!! Toplama İşlemine Hoşgeldiz !!");
        System.out.print("1.) İki Sayı Toplamak\n" +
                "2.) Birden Fazla Sayı Toplamak\n" +
                "3.) Bir Önceki Menüye Dön\n" +
                "Lütfen İşlem Seçiniz : ");
        int islem = input.nextInt();
        if (islem == 1){
            System.out.print("Birinci Sayı : ");
            int a = input.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = input.nextInt();
            int sonuc = a+b;
            System.out.println(a+ " + " + b + " = " + sonuc);
        } else if (islem == 2) {
            System.out.println("İşlem Sonucunu Görmek İçin '0' basınız !!");
            int sayi = 1, a , b = 0;
            while (true){
                System.out.print(sayi++ + ". Sayı Giriniz : " );
                a = input.nextInt();
                b += a;
                if (a == 0){
                    System.out.print("Girilen Sayıların Toplamı : " + b);
                    break;
                }
            }
        } else if (islem == 3) {
            System.out.println(" *** *** *** *** *** ***");
        }
    }
    // kullanıcıdan 2 sayı al büyük olana göre çıkar.
    static void cikarma (){
        Scanner input = new Scanner(System.in);

        System.out.println("!! Çıkarma İşlemine Hoşgeldiz !!");
        System.out.print("Birinci Sayı : ");
        int a = input.nextInt();
        System.out.print("İkinci Sayı : ");
        int b = input.nextInt();

        if (a >= b){
            System.out.println(a + " - " + b + " = " + (a-b));
        } else if (b > a) {
            System.out.println(b + " - " + a + " = " + (b-a));
        }
    }
    // kullanıcıdan alınan sayıları çarp.
    static void carpma (){
        Scanner input = new Scanner(System.in);

        System.out.println("!! Çarpma İşlemine Hoşgeldiz !!");
        System.out.print("1.) İki Sayı Çarpmak\n" +
                "2.) Birden Fazla Sayı Çarpmak\n" +
                "3.) Bir Önceki Menüye Dön\n" +
                "Lütfen İşlem Seçiniz : ");
        int islem = input.nextInt();
        if (islem == 1){
            System.out.print("Birinci Sayı : ");
            int a = input.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = input.nextInt();
            System.out.println(a + " x " + b + " = " + (a*b) );
        } else if (islem == 2) {
            int sayi = 1,a,b=1;
            System.out.println("İşlem Sonucunu Görmek İçin '0' basınız !!");
            while (true){
                System.out.print(sayi++ + ". Sayı Giriniz : ");
                a = input.nextInt();


                if (a == 0){
                    System.out.println("Çarpımların Sonucu : " + b);
                    break;
                }
                b *=a;
            }
        } else if (islem == 3) {
            System.out.println(" *** *** *** *** *** ***");
        }
    }
    // Kullanıcıdan alınan sayıların bölümü ve kalanını bulma
    static void bolme (){
        Scanner input = new Scanner(System.in);

        System.out.println("!! Bölme İşlemine Hoşgeldiz !!");
        System.out.print("1.) İki Sayı Bölmek\n" +
                "2.) İki Sayının Bölümünden Kalan Sonucu\n" +
                "3.) Bir Önceki Menüye Dön\n" +
                "Lütfen İşlem Seçiniz : ");
        int islem = input.nextInt();
        if (islem == 1){
            System.out.print("Birinci Sayı : ");
            int a = input.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = input.nextInt();
            System.out.println(a + " / " + b + " = " + (a/b));
        } else if (islem == 2) {
            System.out.print("Birinci Sayı : ");
            int a = input.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = input.nextInt();
            System.out.println(a + " / " + b + " = " + (a%b));
        } else if (islem == 3) {
            System.out.println(" *** *** *** *** *** ***");
        }
    }
    // kullanıcıdan alınan taban ve üssün hesaplaması
    static void usluSayi (){
        Scanner input = new Scanner(System.in);

        System.out.println("!! Üslü Sayı İşlemine Hoşgeldiz !!");
        System.out.print("Taban Sayısını Giriniz : ");
        int a = input.nextInt();
        System.out.print("Üs Sayısını Giriniz : ");
        int b = input.nextInt();
        int c = 1;
        for (int i = 1; i <= b; i++) {
            c*=a;
        }
        System.out.println(a + "^" + b + " = " + c);
    }
    // kullanıcıdan alınan sayının faktöriyelinin bulunması
    static void faktoriyel (){
        Scanner input = new Scanner(System.in);

        System.out.println("!! Faktöriyel İşlemine Hoşgeldiz !!");
        System.out.print("Hesaplanıcak Sayıyı Giriniz : ");
        int a = input.nextInt();
        int s = a;
        int b =1;
        while (a != 0){
            b*=a;
            a--;
        }
        System.out.println(s + "! Sonucu : " + b);
    }
    // kullanıcıdan alınan sayının modunun hesaplanması
    static void modAlma () {
        Scanner input = new Scanner(System.in);

        System.out.println("!! Mod Alma İşlemine Hoşgeldiz !!");
        System.out.print("Modu Alınacak Sayıyı Giriniz : ");
        int a = input.nextInt();
        System.out.print("Modu Giriniz : ");
        int b = input.nextInt();
        if (a>b){
            System.out.println(a + "'nın " + b + "'ye Göre Modu : " + (a%b));
        }
    }
    // kullanıcıdan alınan sayılar ile çecre ve alan hesabı.
    static void dikalancevre () {
        Scanner input = new Scanner(System.in);

        System.out.println("!! Dikdörtgen Alan Ve Çevre Hesaplama İşlemine Hoşgeldiz !!");
        System.out.print("1.) Alan Hesabı\n" +
                "2.) Çevre Hesabı\n" +
                "3.) Dikdörtgen Çizdir\n" +
                "4.) Bir Önceki Menüye Dön\n" +
                "Lütfen İşlem Seçiniz : ");
        int islem = input.nextInt();
        if (islem == 1){
            System.out.println("!! Dikdörtgen Alan Hesaplama Hoşgeldiz !!");
            System.out.print("Birinci Kenarı Giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci Kenarı Giriniz : ");
            int b = input.nextInt();
            System.out.println("Dikdörtgenin Alanı : " + (a*b));

        } else if (islem == 2) {
            System.out.println("!! Dikdörtgen Çevre Hesaplama Hoşgeldiz !!");
            System.out.print("Birinci Kenarı Giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci Kenarı Giriniz : ");
            int b = input.nextInt();
            System.out.println("Dikdörtgenin Çevresi : " + (2*(a+b)));
        } else if (islem == 3) {
            dene();
        } else if (islem == 4) {
            System.out.println(" *** *** *** *** *** ***");
        }

    }
    // Kullanıcının dikdörtgenini çizmeye çalış
    static void dene(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayı : ");
        int a = input.nextInt();
        System.out.print("İkinci Sayı : ");
        int b = input.nextInt();
        System.out.print(" ");

        for (int i = 1; i <=a-1; i++) {
            System.out.print("_ ");
        }
        System.out.print("_");
        System.out.println("");
        for (int i = 1; i <= b; i++) {
            System.out.print("|");
            for (int j = 1; j <=2*a; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.print(" ");
        for (int i = 1; i <=a; i++) {
            System.out.print("_ ");
        }
    }
}