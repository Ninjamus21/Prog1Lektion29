package opgave01;

import opgave01.models.Character;
import opgave01.storage.HogwartsStorage;

import java.util.ArrayList;

public class Opgave01Main {
    public static void main(String[] args) {
        HogwartsStorage storage = new HogwartsStorage();
        ArrayList<Character> gryffindors = storage.getHouseGryffindor();
        ArrayList<Character> slytherins = storage.getHouseSlytherin();

        ArrayList<Character> flettetList = fletListes(gryffindors,slytherins);
        System.out.println(flettetList);
     }

     public static ArrayList<Character> fletListes(ArrayList<Character> list1, ArrayList<Character> list2){
        ArrayList<Character> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while(i1 < list1.size() && i2 < list2.size()){
            if (list1.get(i1).compareTo(list2.get(i2)) <= 0){
                result.add(list1.get(i1));
                i1++;
            } else {
                result.add(list2.get(i2));
                i2++;
            }
        }
        while (i1 < list1.size()){
            result.add(list1.get(i1));
            i1++;
        }
        while (i2 < list2.size()){
            result.add(list2.get(i2));
            i2++;
        }
        return result;
     }

}
