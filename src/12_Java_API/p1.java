package percobaan1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class DemoHastSet1841720189Rhea {
    public static void main(String[] args) {
        Set mSetCity = new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");
        //set.add("Malang");
        
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        
        while(mIterator.hasNext()) {
            System.out.println(mIterator.next().toLowerCase());
    }
  } 
}
