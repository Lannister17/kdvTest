import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        double fiyat,kdv,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz : ");
        fiyat = input.nextDouble();
        if (fiyat < 1000) {
            kdv = fiyat * 18 / 100;
            total = fiyat + kdv;
            System.out.println("KDV dahil tutar : " + total + " birimdir.");
            System.out.println("KDV tutarı : " + kdv + " birimdir.");
            System.out.println("KDV siz tutar : " + fiyat + " birimdir.");
        }else {
            kdv = fiyat * 8 / 100;
            total = fiyat + kdv;
            System.out.println("KDV dahil tutar : " + total + " birimdir.");
            System.out.println("KDV tutarı : " + kdv + " birimdir.");
            System.out.println("KDV siz tutar : " + fiyat + " birimdir.");
        }
    }
}
