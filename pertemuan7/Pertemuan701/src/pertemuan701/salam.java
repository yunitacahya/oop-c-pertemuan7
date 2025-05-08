package pertemuan701;

/**
 *
 * @author Yunita Cahya
 * TGL 8 MEI 2025
 * overloading class
 */
public class salam {
    String tx = "Mengggunakan Method tulisSalam tanpa parameter";
    
    public void tulisSalam(){
        System.out.println(this.tx);
    }
    public void tulisSalam(String txt){
        System.out.println(txt);
    }
    public void tulisSalam(int txt2){
        System.out.println(txt2);
    }
}
