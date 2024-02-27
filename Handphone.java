public class Handphone {
    String jenisHp;
    int tahunPembuatan;

    public void setDataHp(String jenisHp, int tahunPembuatan) {
        this.jenisHp = jenisHp;
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getJenisHp() {
        return jenisHp;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public static void main(String args[]) {
        Handphone hp = new Handphone();
        hp.setDataHp("Smartphone", 2022);
        System.out.println("Jenis HP: " + hp.getJenisHp());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}