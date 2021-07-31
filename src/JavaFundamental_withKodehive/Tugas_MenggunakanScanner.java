package JavaFundamental_withKodehive;

import java.util.Scanner;

public class Tugas_MenggunakanScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Data of Kodehive Academy Students");
        System.out.println("======================================");
        System.out.println("Please fill your data honestly");
        System.out.print("E-mail\t\t\t\t: ");
        String email = input.nextLine();
        System.out.print("Nama\t\t\t\t: ");
        String nama = input.nextLine();
        System.out.print("Jenis Kelamin [L/P]\t: ");
        String gender = input.nextLine();
        System.out.print("Alamat\t\t\t\t: ");
        String alamat = input.nextLine();

        System.out.println("\n======================================");
        System.out.println("Data of Kodehive Academy Students");
        System.out.println("======================================");
        System.out.println("Thankyou, you have been regeistered");

        System.out.println("Email\t\t\t\t: " + email);
        System.out.println("Nama\t\t\t\t: " + nama);
        System.out.println("Jenis Kelamin [L/P]\t: " + gender);
        System.out.println("Alamat\t\t\t\t: " + alamat);
        System.out.println("Press ENTER to exitt...");

    }
}
