public class Luas {
    private float luasp,jari;
    
    public static float jarinya(float r){
        float luas;
        luas = 3.1415f * r * r;
        return(luas);
    }
    
    public static float luasp(float p, float l){
        float luasnya;
        luasnya = p*l;
        return(luasnya);
    }
    
    float luasp(){
        return p*l;
    }
    
    public void cetak(){
        super.cetak();
        float luas = jarinya(r);
        System.out.println("Luas lingkaran : "+luas);
        float luass = luasp(p,l);
        System.out.println("Luas Persegi Panjang : "+luass);
    }
}