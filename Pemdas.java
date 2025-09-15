import java.util.Scanner;

public class Pemdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Energi Potensial dan Kinetik");
        double Massa, kecepatan, ketinggian, Energipotensial, Energikinetik, Energimekanik;
        System.out.print("Masukkan Massa = ");
        Massa = input.nextDouble();
        System.out.print("Masukkan Kecepatan = ");
        kecepatan = input.nextDouble();
        System.out.print("Masukkan Ketinggian = ");
        ketinggian = input.nextDouble();

        Energipotensial = 10*Massa*ketinggian;
        Energikinetik = Massa*kecepatan*kecepatan*1/2;
        Energimekanik = Energipotensial+Energikinetik;

        System.out.println("Energi potensial = "+Energipotensial);
        System.out.println("Energi kinetik = "+Energikinetik);
        System.out.println("Energi Mekanik = "+Energimekanik);

    }
}
