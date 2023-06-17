public class BusProvinsi extends Bus implements HitungTiket {
    private final double hargaPerKM = 1000;

    public BusProvinsi(String namaBus, String warna){
        super(namaBus, warna);
    }

    @Override
    public double hitungHarga(double jarak) {
        return hargaPerKM * jarak;
    }

    public double hitungHarga(String jarak){
        double jarakInteger = Double.parseDouble(jarak);
        return hargaPerKM * jarakInteger;
    }
}