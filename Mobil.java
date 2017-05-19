public abstract class Mobil {
    protected String lampu  = "Depan dan Belakang";
    protected String bbm = "Bensin";
    
    protected String getLampu(){
        return lampu;
    }
    
	protected String getBbm(){
        return bbm;
    }
    
    protected abstract void printLampu();
    protected abstract void printBbm();
}