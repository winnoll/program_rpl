import java.util.Scanner;

public class MainKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Transaksi transaksi = new Transaksi();

        System.out.println("======== KASIR ========");
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("\nBarang ke-" + i + ":");
            System.out.print("Nama barang: ");
            String nama = input.nextLine();
            System.out.print("Harga satuan: ");
            double harga = input.nextDouble();
            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();
            input.nextLine();
            Barang b = new Barang(nama, harga, jumlah);
            transaksi.tambahBarang(b);
        }

        transaksi.hitungTotal();
        transaksi.tampilkanRincian();

        System.out.println("Terima kasih telah berbelanja!");
        input.close();
    }
}
