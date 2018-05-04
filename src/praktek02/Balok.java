package praktek02;
public class Balok {
  double panjang ;
  double lebar ;
  double tinggi ;

    public Balok() {
        panjang=5;
        lebar=6;
        tinggi=4;
    }
  
    void cetakInfo () {
       System.out.println("================");
       System.out.println("Panjang   :"+panjang );
       System.out.println("Lebar   :"+lebar );
       System.out.println("Tinggi :"+tinggi);
       System.out.println("================");
       

}
    double hitungVolume(){
        double volume ;
        volume =panjang*lebar*tinggi;
        return volume;
     }
    
    
    void cetakVolume(){
        System.out.println("Volumenya adalah :" +hitungVolume());
    }
}
