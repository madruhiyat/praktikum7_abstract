
import java.util.ArrayList;

public class MainPerpustakaan {

    public static void main(String[] args) {
        ArrayList<Anggota> anggotaList = new ArrayList<>();
        anggotaList.add(new Mahasiswa("A001", "Budi", "123456789"));
        anggotaList.add(new Dosen("A002", "Pa Andi", "123456789"));
        anggotaList.add(new MahasiswaDigital("A003", "Siti", "123456789"));

        System.err.println("DAFTAR ANGGOTA PERPUSTAKAAN");
        for (Anggota a : anggotaList) {
            a.tampilkanInfo();
            System.err.println("Limit Pinjam            : " + a.getLimitPinjamBuku() + " Buku");
            System.err.println("Denda 5 hari            : Rp." + a.hitungDenda(5));

            if (a instanceof DapatDigital) {
                System.err.println("Anggota Digital");
                DapatDigital dd = (DapatDigital) a;
                dd.aksesEBook(" https://perpus.ac.id/ebook/123");
                dd.infoDigital();
            }
            System.err.println("========================================");
        }
        System.err.println("KELOMPOK ANGGOTA DIGITAL");
        ArrayList<DapatDigital> anggotaDigital = new ArrayList<>();
        anggotaDigital.add(new MahasiswaDigital("A004", "Dewi", "09876243"));

        for (DapatDigital d : anggotaDigital) {
            d.aksesEBook(" https://perpus.ac.id/ebook/456");
            d.infoDigital();
        }
    }
}
