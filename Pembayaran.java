public interface Pembayaran{
    void prosespembayaran(double jumlah);
    default void cetakbukti(){
        System.err.println("Bukti Pembayaran Telah Di Cetak");
    }
}





