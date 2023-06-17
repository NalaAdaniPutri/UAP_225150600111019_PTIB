public class Tiket {
    public String toString(int i) {
        System.out.println("Nomor Tiket : " + (i + 1));
        System.out.println("Tujuan Bus  : " + LoketBusApp.tujuanBus);
        System.out.println("Nama Bus    : " + LoketBusApp.pilihanBus.getNamaBus());
        System.out.println("Warna Bus   : " + LoketBusApp.pilihanBus.getWarna());
        System.out.println("Harga Bus   : " + LoketBusApp.harga);
        return "";
    }
}

