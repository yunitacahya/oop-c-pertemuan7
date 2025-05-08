package pertemuan703;

/**
 *
 * @author Yunita Cahya
 * TGL 8 MEI 2025
 */
public class Pertemuan703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        segiTiga segi3 = new segiTiga();
        segi3.setAlas(5);
        segi3.setTinggi(10);
        segi3.hitungLuas();
        segi3.cetakLuas();
        
        persegi kotak = new persegi();
        kotak.setPanjang(10);
        kotak.setLebar(5);
        kotak.hitungKeliling();
        kotak.hitungLuas();
    }
    
}
