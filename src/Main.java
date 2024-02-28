
// Ali Eren KÖSE 28/02/2024 02:05

import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.println("2.Sayıyı Giriniz : ");
        int b = scan.nextInt();
        int result = a + b;
        System.out.println("Sonuç : " + result);
        System.out.println("================================");
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.println("2.Sayıyı Giriniz : ");
        int b = scan.nextInt();
        int result = a - b;
        System.out.println("Sonuç : " + result);
        System.out.println("================================");
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        int b =scan.nextInt();
        int result = a*b;
        System.out.println("Sonuç : " + result);
        System.out.println("================================");
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.println("2.Sayıyı Giriniz : ");
        int b = scan.nextInt();
        if (b <= 0) {
            System.out.println("Sayı sıfıra bölünemez ..");
            return ;
        }
        int result = a / b;
        System.out.println("Sonuç : " + result);
        System.out.println("================================");
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
        System.out.println("================================");
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
        System.out.println("================================");
    }

    static void rectangleCacl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz : ");
        int a = scan.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz : ");
        int b = scan.nextInt();
        int resultArea = (a * b);
        int resultPerimeter = (2 * (a + b));
        System.out.println("Dikdörtgenin Alanı : " + resultArea);
        System.out.println("Dikdörtgenin Çeversi : " + resultPerimeter);
        System.out.println("================================");
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        int b = scan.nextInt();
        int result = a % b;
        System.out.println(result);
        System.out.println("================================");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.println("================================");
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            System.out.println("================================");

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleCacl();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
        System.out.println("Çıkış Yaptınız ...");

    }
}