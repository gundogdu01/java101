package com.company;

import java.util.Scanner;

public class kullaniciGiris {

    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Başarılı giriş yaptınız.:)");
        } else {
            System.out.println("Şifreniz Yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? ");
            System.out.println("1-Şifremi sıfırla\n2-İstemiyorum ");

            int sifreSecim = input.nextInt();

            switch (sifreSecim) {
                case 1:
                    System.out.print("Yeni şifreniz : "+ input.nextLine());
                    String yeniSifre = input.nextLine();

                    if (yeniSifre.equals("java101")) {
                        System.out.println("Yeni şifreniz eskisi ile aynı olamaz\nTekrar deneyiniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                    break;

                case 2:
                    System.out.println("İyi günler dileriz :)");
                    break;
            }
        }
    }
}
