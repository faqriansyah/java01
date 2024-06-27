package classes;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

class MyObject {
    String value;

    public MyObject(String val) {
        value = val;
    }

    public void setVal(String newVal) {
        value = newVal;
    }

    @Override
    public String toString() {
        return value;
    }
}

public class Equality {
    public static void main(String[] args) {
        Set<MyObject> myset = new HashSet<>();
        MyObject myobj = new MyObject("Dodi");
        myset.add(myobj);
        myobj.setVal("Eko");

        Iterator<MyObject> setIt = myset.iterator();
        while(setIt.hasNext()) {
            System.out.println(setIt.next());
        }

        System.out.println(myset.equals(myobj));

        System.out.println(myset);
        
    }
}
