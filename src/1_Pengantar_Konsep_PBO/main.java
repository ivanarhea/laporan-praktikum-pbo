public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bangun b = new Bangun();
        Luas lu = new Luas();
        
        b.setJari(2);
        b.setPanjang(5);
        b.setLebar(3);
        b.cetak();
        
        lu.setJari(4);
        lu.setPanjang(2);
        lu.setLebar(7);
        
        lu.cetak();
    }
    
}