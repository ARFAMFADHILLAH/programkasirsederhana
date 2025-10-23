import java.util.Scanner;

public class programkasirsederhana {

    public static void main(String[] args) {

        // Gunakan try-with-resources agar Scanner otomatis ditutup
        try (Scanner input = new Scanner(System.in)) {

            // MENU MAKANAN
            System.out.println("|=========================================|");
            System.out.println("|          PROGRAM KASIR SEDERHANA        |");
            System.out.println("|=========================================|");
            System.out.println("|             PILIH MENU MAKANAN          |");
            System.out.println("|=========================================|");
            System.out.println("| 1. Nasi Goreng          Rp 12.000       |");
            System.out.println("| 2. Ayam Geprek          Rp 10.000       |");
            System.out.println("| 3. Ikan Bakar           Rp 20.000       |");
            System.out.println("| 4. Nasi Bakar           Rp 15.000       |");
            System.out.println("| 5. Cumi Goreng          Rp 8.000        |");
            System.out.println("|=========================================|");

            System.out.print("Pilih makanan 1/2/3/4/5 : ");
            int makanan = input.nextInt();

            System.out.print("Berapa Porsi : ");
            int jumPorsi = input.nextInt();

            int totalMakan = 0;
            String namaMakanan = "";

            switch (makanan) {
                case 1 -> {
                    totalMakan = jumPorsi * 12000;
                    namaMakanan = "Nasi Goreng";
                }
                case 2 -> {
                    totalMakan = jumPorsi * 10000;
                    namaMakanan = "Ayam Geprek";
                }
                case 3 -> {
                    totalMakan = jumPorsi * 20000;
                    namaMakanan = "Ikan Bakar";
                }
                case 4 -> {
                    totalMakan = jumPorsi * 15000;
                    namaMakanan = "Nasi Bakar";
                }
                case 5 -> {
                    totalMakan = jumPorsi * 8000;
                    namaMakanan = "Cumi Goreng";
                }
                default -> System.err.println("Pilihan makanan tidak tersedia.");
            }

            // MENU MINUMAN
            System.out.println("\n|=========================================|");
            System.out.println("|             PILIH MENU MINUMAN          |");
            System.out.println("|=========================================|");
            System.out.println("| 1. Es Teh Susu          Rp 5.000        |");
            System.out.println("| 2. Es Coklat            Rp 10.000       |");
            System.out.println("| 3. Es Cappucino         Rp 10.000       |");
            System.out.println("| 4. Es Cincau            Rp 5.000        |");
            System.out.println("| 5. Jus Apel             Rp 10.000       |");
            System.out.println("|=========================================|");

            System.out.print("Pilih minuman 1/2/3/4/5 : ");
            int minuman = input.nextInt();

            System.out.print("Berapa Gelas : ");
            int jumGelas = input.nextInt();

            int totalMinum = 0;
            String namaMinum = "";

            switch (minuman) {
                case 1 -> {
                    totalMinum = jumGelas * 5000;
                    namaMinum = "Es Teh Susu";
                }
                case 2 -> {
                    totalMinum = jumGelas * 10000;
                    namaMinum = "Es Coklat";
                }
                case 3 -> {
                    totalMinum = jumGelas * 10000;
                    namaMinum = "Es Cappucino";
                }
                case 4 -> {
                    totalMinum = jumGelas * 5000;
                    namaMinum = "Es Cincau";
                }
                case 5 -> {
                    totalMinum = jumGelas * 10000;
                    namaMinum = "Jus Apel";
                }
                default -> System.err.println("Pilihan minuman tidak tersedia.");
            }

            int totalSemua = totalMakan + totalMinum;

            // CETAK RINCIAN
            System.out.println("\n|=========================================|");
            System.out.println("|             DAFTAR PEMBELIAN            |");
            System.out.println("|=========================================|");
            System.out.println("| Makanan      : " + namaMakanan);          
            System.out.println("| Jumlah Porsi : " + jumPorsi);
            System.out.println("| Minuman      : " + namaMinum);
            System.out.println("| Jumlah Gelas : " + jumGelas);
            System.out.println("|=========================================|");
            System.out.println(" Total Harga   : Rp " + totalSemua);
            System.out.println("|=========================================|");
        }
    }
}
