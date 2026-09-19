import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("NIK (16 Digit): ");
    long nikViv = scanner.nextLong();

    System.out.print("Umur: ");
    int umurViv = scanner.nextInt();

    scanner.nextLine();

    System.out.print("Tinggi Badan: ");
    double tinggiBadan = scanner.nextDouble();

    scanner.nextLine();

    System.out.print("Golongan Darah: ");
    char golonganDarah = scanner.next().charAt(0);

    System.out.print("Sudah menikah: ");
    boolean menikahViv = scanner.nextBoolean();

    scanner.nextLine();

    System.out.print("Nama Lengkap: ");
    String namaLengkap = scanner.nextLine();

    System.out.println();
    System.out.println("=== KARTU MAHASISWA ===");
    System.out.println("Nama: " + namaLengkap);
    System.out.println("NIK: "+ nikViv);
    System.out.println("Umur: " + umurViv + " tahun");
    System.out.println("Tinggi: "+tinggiBadan+" cm");
    System.out.println("Gol Darah: "+golonganDarah);
    System.out.println("Menikah: "+menikahViv);

    }
}
