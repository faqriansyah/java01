import java.util.HashMap;
import java.util.Map;

import classes.Separator;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, Integer> hsh = new HashMap<>(10);
        {
            hsh.put("Andi", 85);
            hsh.put("Budi", 92);
            hsh.put("Citra", 78);
            hsh.put("Dewi", 88);
            hsh.put("Eko", 95);
            hsh.put("Fajar", 74);
            hsh.put("Gita", 90);
            hsh.put("Hani", 67);
            hsh.put("Iwan", 82);
            hsh.put("Joko", 70);
            hsh.put("Kiki", 91);
            hsh.put("Lina", 89);
            hsh.put("Maya", 83);
            hsh.put("Nina", 77);
            hsh.put("Omar", 68);
            hsh.put("Putri", 94);
            hsh.put("Qori", 72);
            hsh.put("Rina", 86);
            hsh.put("Sinta", 79);
            hsh.put("Tono", 81);
            hsh.put(null, null);
            hsh.put(null, null);
        }

        hsh.get("Tono");

        int count = 0;

        int hashash = "Tono".hashCode();
        int n = hsh.size();
        int index = hashash & (n -1);

        System.out.println(hashash);
        System.out.println(index);

        Separator.xsp();

        // for(Map.Entry<String, Integer> m : hsh.entrySet()){
        //     count++;
        //     System.out.println(count + ". Siswa bernama " + m.getKey() + " memiliki nilai " + m.getValue() + " dengan nilai memori " + m.hashCode());
        // }
    }
}
