import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Barang> daftarBarang;
    private double totalSebelumDiskon;
    private double totalSetelahDiskon;
    private double diskon;

    public Transaksi() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void hitungTotal() {
        totalSebelumDiskon = 0;
        for (Barang b : daftarBarang) {
            totalSebelumDiskon += b.hitungSubtotal();
        }

        if (totalSebelumDiskon > 100000) {
            diskon = totalSebelumDiskon * 0.10;
        } else {
            diskon = 0;
        }

        totalSetelahDiskon = totalSebelumDiskon - diskon;
    }

    public void tampilkanRincian() {
        System.out.println("\n===== RINCIAN TRANSAKSI =====");
        for (Barang b : daftarBarang) {
            System.out.println("- " + b.getNama() + " (" + b.getJumlah() + " x Rp" + b.getHarga() + ") = Rp" + b.hitungSubtotal());
        }

        System.out.println("------------------------------------");
        System.out.println("Total sebelum diskon : Rp" + totalSebelumDiskon);
        System.out.println("Diskon (10%)         : Rp" + diskon);
        System.out.println("Total setelah diskon : Rp" + totalSetelahDiskon);
        System.out.println("------------------------------------");
    }
}
