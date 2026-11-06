
public interface DapatDigital {

    void aksesEBook(String url);

    default void infoDigital() {
        System.err.println("Anggota ini dapat mengakses EBook");
    }

    int MAX_DOWNLOAD_PER_HARI = 10;
}
