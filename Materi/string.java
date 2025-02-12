package Materi;
import java.util.*;

public class string{
    Integer y = 9;
    Float x = 99f;

    String r = "I am Yilong Ma";
    String s = new String("I am yilong ma");

    public string(){
        y = Integer.parseInt("1000");
        System.out.println(y);
        System.out.println(x.MAX_VALUE);

        System.out.println("");
        
        System.out.println(r);
        System.out.println(s);

        // Comparing
        // string compare
        System.out.println(s.equals(r)); 
        // string compare tanpa mentingin besar kecil huruf
        System.out.println(s.equalsIgnoreCase(r)); 
        // mengcompare character satu per satu sampai menghasilkan seliish
        System.out.println(s.compareTo(r));
        // mengcompare character satu per satu sampai menghasilkan seliish tanpa mentingin besar kecil huruf
        System.out.println(s.compareToIgnoreCase(r));

        // Substring
        // mengeprint string mulai dari index
        System.out.println(r.substring(2)); 
        // mengeprint string mulai dari index dan berhenti pada index ditentukan
        System.out.println(r.substring(2, 5));
        // mencari character
        System.out.println(r.indexOf('I'));
        // mencari string
        System.out.println(r.indexOf("Yilo"));
        // mencari character
        System.out.println(r.indexOf('I', 5));
        // print characte dalam string
        System.out.println(r.charAt(0));

    }

    public static void main(String[] x){
        new string();
    }
}