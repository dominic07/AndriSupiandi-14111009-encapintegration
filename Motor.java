public class Motor {
    public void Motor (){
        System.out.println("Kendaraan Motor");
        Kendaraan kn = new Kendaraan();
        kn.setJenis("Metic");
        System.out.println("Jenis Motor :"+kn.getJenis());
        kn.setMerk("Yamaha");
        System.out.println("Merk Kendaraan:"+kn.getMerk());
        kn.setJumlahroda(2);
        System.out.println("Jumlah Roda Kendaraan:"+kn.getJumlahroda());
    }
}