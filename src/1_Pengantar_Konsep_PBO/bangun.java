public class Bangun {
    float r,p,l;
    
    public void setJari(float jari){
        r = jari;
    }
    
    public void setPanjang(float panjang){
        p = panjang;
    }
    
    public void setLebar(float lebar){
        l= lebar;
    }
    
    public void cetak(){
        System.out.println("jari-jari : "+r);
        System.out.println("panjang : "+p);
        System.out.println("lebar : "+l);
    }
}