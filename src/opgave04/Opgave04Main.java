package opgave04;

import opgave04.models.Person;
import opgave04.testdata.TestDataGenerator;

import javax.swing.*;
import java.util.ArrayList;

public class Opgave04Main {

    public static void main(String[] args) {
        ArrayList<Person> people1 = TestDataGenerator.generatePeople();
        System.out.println(people1);
        ArrayList<Person> people2 = TestDataGenerator.generatePeople();
        System.out.println(people2);

        ArrayList<Person> mergedNames = merge(people1,people2);
        System.out.println(mergedNames);
    }

    public static ArrayList<Person> merge(ArrayList<Person> people1, ArrayList<Person> people2) {
        ArrayList<Person> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < people1.size() && i2 < people2.size()){
            if(people1.get(i1).compareTo(people2.get(i2)) <= 0){
                result.add(people1.get(i1));
                i1++;
            } else {
                result.add(people2.get(i2));
                i2++;
            }
        }
        while (i1 < people1.size()){
            result.add(people1.get(i1));
            i1++;
        }
        while (i2 < people2.size()){
            result.add(people2.get(i2));
            i2++;
        }
        return result;
    }
}
