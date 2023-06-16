import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {

        int yas,km,yolculukTipi;

        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi KM turunden giriniz: ");
        km=input.nextInt();

        System.out.print("Yasinizi(age) giriniz: ");
        yas=input.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 =>Tek Yon , 2 =>Gidis Donus ): ");
        yolculukTipi=input.nextInt();

        double toplam= km*0.10;

        if (km <= 0 || yas<0 || (yolculukTipi !=1 && yolculukTipi !=2)) {
            System.out.println("Hatali Veri Girdiniz !");
        }
        else if (yas<12) {
            if (yolculukTipi == 2) {
                double toplam2 = toplam - (toplam * 50 / 100);
                toplam2 -=  (toplam2 * 20 / 100);
                System.out.print("Toplam Tutariniz: " + toplam2*2);
            } else {
                toplam = toplam - (toplam * 50 / 100);
                System.out.print("Toplam Tutariniz: " + toplam);
            }
        }
        else if (12<= yas && yas<24) {
            if (yolculukTipi == 2) {
                double toplam2 = toplam - (toplam * 10 / 100);
                toplam2 -= (toplam2 * 20 / 100);
                System.out.print("Toplam Tutariniz: " + toplam2*2);
            } else {
                toplam = toplam - (toplam * 10 / 100);
                System.out.print("Toplam Tutariniz: " + toplam);
            }
        }
        else if (yas>65) {
            if (yolculukTipi == 2) {
                double toplam2 = toplam - (toplam * 30 / 100);
                toplam2 -= (toplam2 * 20 / 100);
                System.out.print("Toplam Tutariniz: " + toplam2*2);
            } else {
                toplam = toplam - (toplam * 30 / 100);
                System.out.print("Toplam Tutariniz: " + toplam);
            }
        }
        else if (yolculukTipi == 2) {
            toplam= toplam- (toplam*20/100);
            System.out.print("Toplam Tutariniz: " + toplam*2);
        }
        else {
            System.out.print("Toplam Tutariniz: " + toplam);
        }

    }
}

/*
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */