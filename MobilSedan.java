public class MobilSedan extends Mobil {
    
    public void mobil(){
        System.out.println("Kendaraan Mobil");
        Kendaraan kn = new Kendaraan();
        kn.setJenis("Sedan");
        System.out.println("Jenis Mobil :"+kn.getJenis());
        kn.setMerk("BMW");
        System.out.println("Merk Kendaraan:"+kn.getMerk());
        kn.setJumlahroda(4);
        System.out.println("Jumlah Roda Kendaraan:"+kn.getJumlahroda());
       
    }
    
    public void mobilSedan(){
        
      System.out.println("Spesifikasi Mobil Sedan BMW");
	}
    
    protected void printLampu(){
        System.out.println("Memiliki Lampu :"+super.getLampu());
    }
    
    public void printBbm(){
        System.out.println("Bahan Bakar Kendaraan :"+super.getBbm());
    }

}