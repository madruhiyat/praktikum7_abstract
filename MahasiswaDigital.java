
public class MahasiswaDigital extends Mahasiswa implements DapatDigital {

    public MahasiswaDigital(String id, String nama, String nim) {
        super(id, nama, nim);
    }

    @Override
    public void aksesEBook(String url) {
        System.err.println("Mahasiswa " + getNama() + " Mengakses EBook di" + url);
        System.err.println("Maksimal Download per Hari " + MAX_DOWNLOAD_PER_HARI + " File");
    }

    public String getNama() {
        return super.nama;
    }
}
