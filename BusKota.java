public class BusKota extends Bus implements HitungTiket {
    private final double hargaPerKM = 500;

    public BusKota(String namaBus, String warna){
        super(namaBus, warna);
    }

    @Override
    public double hitungHarga(double jarak) {
        return hargaPerKM * jarak;
    }
}