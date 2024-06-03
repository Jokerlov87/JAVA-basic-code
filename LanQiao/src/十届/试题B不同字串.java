package 十届;

import java.util.HashSet;
import java.util.Set;

public class 试题B不同字串 {
    public static void main(String[] args) {
        String str="0100110001010001";
        Set<String> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                set.add(str.substring(i,j+1));
            }
        }
        System.out.println(set.size());
    }
}
