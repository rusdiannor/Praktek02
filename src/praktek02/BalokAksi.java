package praktek02;

public class BalokAksi {
    public static void main(String[] args) {
        Balok r1 = new Balok ();
        r1. panjang = 4 ;
        r1. lebar  = 5;
        r1. tinggi  = 3;
        
        r1.cetakInfo();
        System.out.println("volume balok ="+ r1.hitungVolume ());
        
    }
           
}
