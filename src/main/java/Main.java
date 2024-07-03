import leasson9.Phonebook;

import java.util.HashMap;
import java.util.Map;

import static leasson9.Array.createFreqMap;

public class Main {

    public static void main(String[] args) {
        String[] inputFruits = {"яблоко", "вишня", "персик", "яблоко", "виноград", "груша", "вишня", "ананас", "чернослив", "черемуха", "виноград", "слива", "ананас", "яблоко", "персик"};
        Map<String, Integer> freqMap = new HashMap<>(createFreqMap(inputFruits));
        System.out.print("Список уникальных слов: \n ");

        freqMap.forEach((k, v) -> System.out.print("\'" + k + "\' "));
        System.out.println();

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println("Слово: \'" + k + "\' Повторений: " + v);
        }


        Phonebook.add("Иванов", "89576543214");
        Phonebook.add("Петров", "89652347898");
        Phonebook.add("Сидоров", "89063248796");
        Phonebook.add("Филимонов", "897436549874");
        Phonebook.get("Иванов");
        Phonebook.get("Петров");
        Phonebook.get("Попов");


    }

}