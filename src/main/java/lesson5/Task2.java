package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> dataList = new ArrayList<>(List.of("Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));

        Map<String, Integer> dataMap = getDictFromArList(dataList);
        System.out.println(dataMap);
        System.out.println();
        sortMap(dataMap);
    }

    static Map<String, Integer> getDictFromArList(ArrayList<String> someList){
        Map<String, Integer> someMap = new HashMap<>();
        for (String el : someList) {
            String name = el.split(" ")[0];
            if (someMap.containsKey(name)) someMap.put(name, someMap.get(name) + 1);
            else someMap.put(name, 1);
        }
        return someMap;
    }

    static void sortMap(Map<String, Integer> someMap) {
        TreeMap<String, String> sometMap = new TreeMap<>();
        for (Map.Entry<String, Integer> ent : someMap.entrySet()) {
            sometMap.put(ent.getValue()+ent.getKey(), ent.getKey());
        }
        System.out.println(sometMap.descendingMap());
    }

}