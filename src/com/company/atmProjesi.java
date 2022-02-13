package com.company;

import java.util.Scanner;

public class atmProjesi {

    public static void main(String[] args) {
        String userName, password;
        int right = 3, balance = 1500, select;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adını giriniz : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev")) {
                System.out.println("Merhaba Kodluyoruz bankasına hoşgeldiniz.!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediginiz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Para Miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Para Miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere.");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur. Lütfen Banka İle İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
