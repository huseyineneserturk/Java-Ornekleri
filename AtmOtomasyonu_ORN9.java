import java.util.Objects;
import java.util.Scanner;

public class AtmOtomasyonu_ORN9 {
    public static void main(String[] args){
        String islemler = "Lütfen aşağıdaki işlemlerden birini seçiniz: \n" +
                "(1) Bakiye Sorgulama\n" +
                "(2) Para Çekme\n" +
                "(3) Para Yatırma\n" +
                "(4) Para Transferi\n" +
                "(q) Çıkış";

        System.out.println("*********************");
        System.out.println(islemler);
        System.out.println("*********************");

        Scanner scann = new Scanner(System.in);

        int bakiye1 = 1000;
        int bakiye2 = 1000;

        while (true){
            System.out.print("İşlem: ");
            String islem = scann.nextLine();
            System.out.print("Lütfen hesap harfinizi giriniz...");
            String hesap = scann.next();
            scann.nextLine();

            if (islem.equals("q")){
                System.out.println("İşlemlerden çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                if (hesap.equals("a")){
                    System.out.println("Hesabınızın bakiyesi : " + bakiye1);
                } else if (hesap.equals("b")) {
                    System.out.println("Hesabınızın bakiyesi : " + bakiye2);
                    break;
                }
            } else if (islem.equals("2")) {
                if (hesap.equals("a")){
                    System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz: ");
                    int tutar = scann.nextInt();
                    scann.nextLine();
                    bakiye1 += tutar;
                    System.out.println("Hesabınızın yeni bakiyesi: " + bakiye1);
                } else if (hesap.equals("b")){
                    System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz: ");
                    int tutar = scann.nextInt();
                    scann.nextLine();
                    bakiye2 += tutar;
                    System.out.println("Hesabınızın yeni bakiyesi: " + bakiye2);
                }
            } else if (islem.equals("3")) {
                if (hesap.equals("a")){
                    System.out.println("Lütfen hesabınızdan çekmek istediğiniz tutarı giriniz: ");
                    int tutar = scann.nextInt();
                    scann.nextLine();
                    bakiye1 -= tutar;
                    System.out.println("Hesabınızın yeni bakiyesi: " + bakiye1);
                } else if (hesap.equals("b")){
                    System.out.println("Lütfen hesabınızdan çekmek istediğiniz tutarı giriniz: ");
                    int tutar = scann.nextInt();
                    scann.nextLine();
                    bakiye2 -= tutar;
                    System.out.println("Hesabınızın yeni bakiyesi: " + bakiye2);
                }
            } else if (islem.equals("4")) {
                System.out.print("Lütfen para transferi gerçekleştireceğiniz hesabın hesap harfini giriniz: ");
                String hesapharf = scann.next();
                scann.nextLine();

                if (hesap.equals("a") && hesapharf.equals("b") ){
                    System.out.println("lütfen yatıracağınız tutarı giriniz: ");
                    int tutar1 = scann.nextInt();
                    scann.nextLine();
                    bakiye1 -= tutar1;
                    bakiye2 += tutar1;

                    System.out.println("Yeni hesap bakiyeniz: " + bakiye1);
                } else if (hesap.equals("b") && hesapharf.equals("a")) {
                    System.out.println("lütfen yatıracağınız tutarı giriniz: ");
                    int tutar1 = scann.nextInt();
                    scann.nextLine();
                    bakiye2 -= tutar1;
                    bakiye1 += tutar1;

                    System.out.println("Yeni hesap bakiyeniz: " + bakiye2);
                } else {
                    System.out.println("Geçersiz işlem...");
                }
            } else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
