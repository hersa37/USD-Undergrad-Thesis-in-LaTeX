package penduduk;

public class Mahasiswa extends Penduduk implements Peserta{

    private String nim;

    public Mahasiswa() {}

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public double hitungIuran() {
        return Double.parseDouble(nim) / 10000;
    }

    @Override
    public String jenisSertifikat() {
        return "Sertifikat Panitia";
    }

    @Override
    public String getFasilitas() {
        return "block note, alat tulis, laptop";
    }

    @Override
    public String getKonsumsi() {
        return "snack, makan siang, makan malam";
    }
}
