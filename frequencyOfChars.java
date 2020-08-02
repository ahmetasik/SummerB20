package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class frequencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBC";
        ArrayList<String>list = new ArrayList<>();
        for(String each : str.split("")){
            list.add(each);
        }
        String nonDup = Util.removeDup(str);
        for(String each : nonDup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.println(count);
        }
    }
}
