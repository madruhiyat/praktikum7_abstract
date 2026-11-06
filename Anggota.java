
public abstract class Anggota {

    protected String id;
    protected String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.err.println("ID                      : " + id);
        System.err.println("Nama                    : " + nama);
    }

    public abstract int getLimitPinjamBuku();

    public abstract double hitungDenda(int terlambatHari);
}
