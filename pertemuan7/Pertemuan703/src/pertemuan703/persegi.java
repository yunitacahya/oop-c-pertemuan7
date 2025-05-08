package pertemuan703;

/**
 *
 * @author Yunita Cahya
 * TGL 8 MEI 2025
 */
public class persegi extends BangunRuang{
    private int panjang, lebar;
    
    public void setPanjang(int pj){
        this.panjang = pj;
    }
    public void setLebar(int pb){
        this.lebar = pb;
    }
    
    @Override
    public void hitungLuas(){
        this.luas = this.panjang*this.lebar;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = 2*(this.panjang*this.lebar);
    }
}
