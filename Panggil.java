public class Panggil {
    public static void main (String []args){
        
        Kendaraan kn = new Kendaraan();
        System.out.println("Spesifikasi Kendaraan");
        
        
        MobilSedan mb = new MobilSedan();
        mb.mobil();
        mb.mobilSedan();
        mb.printLampu();
        mb.printBbm();
        
        System.out.println("");
        Motor mr = new Motor();
        mr.Motor();
    }
    
}