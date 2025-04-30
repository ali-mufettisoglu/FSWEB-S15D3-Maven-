package org.example;


import org.example.entity.Employee;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Main {

    public static List<Employee> findDuplicates(List<Employee> list) {
        List<Employee> duplicatesList = new LinkedList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    duplicatesList.add(list.get(i));
                }
            }
        }

        return duplicatesList;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> list) {
        Map<Integer, Employee> uniquesMap = new HashMap<>();
        for (Employee e : list) {
            if (e == null) {
                continue;
            }
            uniquesMap.put(e.getId(), e);
        }
        return uniquesMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> list) {
        list.removeAll(findDuplicates(list));
        list.remove(null);

        return list;
    }

    public static void main(String[] args) {
    }
}