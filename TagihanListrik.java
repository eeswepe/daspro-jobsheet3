import java.util.Scanner;

class TagihanListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kwh, tarif;
        boolean isExceed;

        System.out.print("Masukkan pemakaian listrik anda: ");
        kwh = input.nextInt();

        tarif = 1500 * kwh;
        isExceed = kwh > 500;

        System.out.println("Tagihan listrik anda adalah " + tarif + " Rupiah");
        System.out.println("Status (Melebihi 500 kWh): " + isExceed);

    }
}
