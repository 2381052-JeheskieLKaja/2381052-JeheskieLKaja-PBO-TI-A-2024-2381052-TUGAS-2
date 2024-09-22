import java.util.Scanner;

public class Tugas2 {
    public static double hitungLuas(double Panjang, double Lebar){
        return Panjang * Lebar;
    }
    public static double hitungLuas(double sisi){
        return sisi * sisi;
    }
    public static double hitungLuas(double jariJari, boolean isLingkaran){
        return Math.PI * jariJari * jariJari;
    }
    public static double hitungKeliling(double Panjang, double Lebar){
        return 2 * Panjang + Lebar;
    }
    public static double hitungKeliling(double sisi){
        return sisi * 4;
    }
    public static double hitungKeliling(double jariJari, boolean isLingkaran) {
        return 2 * Math.PI * jariJari;
    }
    public static void main(String[] args) {
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan pilihan anda: ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.print("Masukan sisi Persegi: ");
                double sisi = input.nextDouble();
                System.out.println("Luas Persegi: " + hitungLuas(sisi) + "\n" + "Keliling Persegi: " + hitungKeliling(sisi));
                break;

            case 2:
                System.out.print("Masukan Panjang Persegi: ");
                double panjang = input.nextDouble();
                System.out.print("Masukan Lebar Persegi: ");
                double lebar = input.nextDouble();
                System.out.println("Luas Persegi Panjang: " + hitungLuas(panjang, lebar) + "\n" + "Keliling Persegi Panjang: " + hitungKeliling(panjang, lebar));
                break;

            case 3:
                System.out.print("Masukan jari-jari Lingkaran: ");
                double jariJari = input.nextDouble();
                System.out.println("Luas lingkaran: " + hitungLuas(jariJari, true) + "\n" + "Keliling Lingkaran: " + hitungKeliling(jariJari, true));
                break;

            default:
                System.out.print("Pilihan yang anda masukan SALAH!");
                break;
        }
    }
}
