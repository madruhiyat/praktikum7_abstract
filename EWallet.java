public class EWallet implements Pembayaran{
    @Override
    public void prosespembayaran(double jumlah){
        System.err.println("Pembayaran via EWallet " + jumlah + " Berhasil");
    }
}
