import java.util.ArrayList;
import java.util.Scanner;

public class LoketBusApp {
    public static ArrayList<Tiket> tiket = new ArrayList<Tiket>();
    public static Bus pilihanBus;
    public static double harga;
    public static String tujuanBus;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("NAMA : NALA ADANI PUTRI");
        System.out.println("NIM  : 225150600111019");
        System.out.println("\n====================================================");
        System.out.println("========= SELAMAT DATANG DI TICKETBUS.KOM ==========");
        int pilihan1 = 0;
        System.out.println("====================================================\n");
        while (true) {
            try {
                System.out.println("------------ SILAHKAN PILIH TUJUAN ANDA ------------");
                System.out.println("1. Luar Provinsi\n");
                System.out.println("2. Dalam Provinsi\n");
                System.out.print("Masukkan pilihan anda : ");
                pilihan1 = input.nextInt();
                if (pilihan1 < 1 || pilihan1 > 2) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println("\nPILIHAN ANDA TIDAK SESUAI\nSILAHKAN MASUKKAN LAGI!");
            }
            System.out.println();
        }
        switch (pilihan1) {
            case 1:
                int tujuanProv = 0;
                System.out.println("====================================================\n");
                while (true) {
                    try {
                        System.out.println("------------- DESTINASI LUAR PROVINSI --------------");
                        System.out.println("1. Solo\n2. Bandung\n3. Jakarta");
                        System.out.println("Pilih tujuan luar provinsi anda :");
                        tujuanProv = input.nextInt();
                        if (tujuanProv < 1 || tujuanProv > 3) {
                            throw new Exception();
                        }
                        break;
                    } catch (Exception e) {
                        input.nextLine();
                        System.out.println("\nPILIHAN ANDA TIDAK SESUAI\nSILAHKAN MASUKKAN LAGI!!!");
                    }
                    System.out.println();
                }
                switch (tujuanProv) {
                    case 1:
                        pilihanBus = new BusProvinsi("Panjenengan", "Coklat");
                        tujuanBus = "Solo";
                        harga = ((BusProvinsi) pilihanBus).hitungHarga("300");
                        break;
                    case 2:
                        pilihanBus = new BusProvinsi("Maneh", "Biru");
                        tujuanBus = "Bandung";
                        harga = ((BusProvinsi) pilihanBus).hitungHarga("500");
                        break;
                    case 3:
                        pilihanBus = new BusProvinsi("Elo", "Merah");
                        tujuanBus = "Jakarta";
                        harga = ((BusProvinsi) pilihanBus).hitungHarga("800");
                        break;

                    default:
                        break;
                }
                break;
            case 2:
                int tujuanKota = 0;
                System.out.println("====================================================\n");
                while (true) {
                    try {
                        System.out.println("------------- DESTINASI DALAM PROVINSI --------------");
                        System.out.println("1. Jember\n2. Blitar\n3. Surabaya");
                        System.out.println("Pilih tujuan dalam provinsi anda :");
                        tujuanKota = input.nextInt();
                        if (tujuanKota < 1 || tujuanKota > 3) {
                            throw new Exception();
                        }
                        break;
                    } catch (Exception e) {
                        input.nextLine();
                        System.out.println("\nPILIHAN ANDA TIDAK SESUAI\nSILAHKAN MASUKKAN LAGI!!!");
                    }
                    System.out.println();
                }
                switch (tujuanKota) {
                    case 1:
                        pilihanBus = new BusKota("Gasing", "Hijau");
                        tujuanBus = "Jember";
                        harga = ((BusKota) pilihanBus).hitungHarga(50);
                        break;
                    case 2:
                        pilihanBus = new BusKota("AmongMas", "Kuning");
                        tujuanBus = "Blitar";
                        harga = ((BusKota) pilihanBus).hitungHarga(40);
                        break;
                    case 3:
                        pilihanBus = new BusKota("Hwonai", "Hitam");
                        tujuanBus = "Surabaya";
                        harga = ((BusKota) pilihanBus).hitungHarga(30);
                        break;

                    default:
                        break;
                }
                break;

            default:
                break;
        }
        System.out.println("-------------------- PENUMPANG ---------------------");
        int orang = 0;
        while (true) {
            try {
                System.out.print("Berapa penumpang yang akan naik bus?\nMasukkan jumlah penumpang : ");
                orang = input.nextInt();
                System.out.println("\n====================================================");
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println("\nPILIHAN ANDA TIDAK SESUAI\nSILAHKAN MASUKKAN LAGI!!!");
            }
        }

        System.out.println("\n====================================================");
        System.out.println("================= MENCETAK TIKET ===================");
        System.out.println("====================================================\n");
        for (int i = 0; i < orang; i++) {
            tiket.add(new Tiket());
            System.out.println(tiket.get(i).toString(i));
            System.out.println("====================================================\n");
        }
    }
}