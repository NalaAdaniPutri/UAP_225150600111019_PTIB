public class Bus {
    private String namaBus;
    private String Warna;

    public Bus(String namaBus, String warna) {
        this.namaBus = namaBus;
        Warna = warna;
    }

    public String getNamaBus() {
        return namaBus;
    }

    public void setNamaBus(String namaBus) {
        this.namaBus = namaBus;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }
}
