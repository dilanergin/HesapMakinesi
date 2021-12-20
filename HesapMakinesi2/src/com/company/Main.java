package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Switc-case kullanarak hesap makinesi yapımı
       double n1,n2,sonuc;
       String islem ;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1=input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        n2= input.nextDouble();
        System.out.println("Yapmak isrediğiniz işlemi yazınız: ");
       islem= input.next();

        switch(islem){
            case "toplama":
               sonuc=n1+n2;
                System.out.println(+sonuc);
                break;
            case "çıkarma":
                sonuc=n1-n2;
                System.out.println(+sonuc);
                break;
            case"bölme":
                sonuc=n1/n2;
                System.out.println(+sonuc);
                break;
            case "çarpma":
                sonuc=n1*n2;
                System.out.println(+sonuc);
                break;
            default:
                System.out.println("Lütfen isteğinizi kontrol ediniz ve sadece küçük harf kullanınız.");


        }



    }
}
