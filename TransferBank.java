public class TransferBank implements Pembayaran{
    @Override
    public void prosespembayaran(double jumlah){
        System.err.println("Transfer Bank Rp." + jumlah + " Berhasil");
    }
}