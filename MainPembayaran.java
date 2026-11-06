
public class MainPembayaran {

    public static void main(String[] args) {
        Pembayaran[] metode = {
            new TransferBank(),
            new EWallet()
        };
        for (Pembayaran p : metode) {
            p.prosespembayaran(150000);
            p.cetakbukti();
            System.err.println("========================================");
        }
    }
}
