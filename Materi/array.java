package Materi;
import java.util.*;

public class array {
    Integer x[][]= {
        {1, 2, 3},
        {4, 5}, 
        {7}
    }; // deklarasi array

    ArrayList<Integer> y = new ArrayList<Integer>(); // dynamic array ato array list

    HashMap<String, Integer> z= new HashMap<String, Integer>();
    //HashMap<key, value> z= new HashMap<key,  value>();    key dan value bebas

    HashSet<Integer> w = new HashSet<Integer>();
    //HashMap<key, value> z= new HashMap<key,  value>();    key dan value bebas

    public array(){

        for (int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j < x[i].length ; j++){
                System.out.print(x[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        y.add(2);
        y.add(8);
        y.add(0);
        y.add(5);

        System.out.println(y.size());
        for (Integer n : y){ // ngak usah akses index, store value sampe habis
            System.out.println(n);
        }

        z.put("sfx", 99);
        z.put("bgm", 77);

        for (int i = 0 ; i < z.size() ; i++){
        }

        z.forEach(
            (k, v) -> {
                System.out.println(k + " -> " + v);
            }
        );

        System.out.println(z.get("sfx"));
        System.out.println(z.get("bgm"));        
    }

    public static void main(String[] x){
        new array();
    }
}
