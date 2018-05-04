package praktek02;

public class BalokAksi {
    public static void main(String[] args) {
        Balok r1 = new Balok ();
        r1. panjang = 4 ;
        r1. lebar  = 5;
        r1. tinggi  = 3;
        
        r1.cetakInfo();
        System.out.println("volume balok ="+ r1.hitungVolume ());
        r1.cetakVolume();
        
        Balok r2 = new Balok();
        r2.cetakInfo();
        
        Balok r3 = new Balok (40,50,30);
        r3.cetakInfo();
        
    }
           
}
