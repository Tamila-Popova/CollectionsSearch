package practice;

import java.util.*;

public class CoolNumbers {
    public static ArrayList<String> list = new ArrayList<>();

    public static List<String> generateCoolNumbers() {
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i1 = 0; i1 < letters.length; i1++) {
            for (int i2 = 0; i2 < letters.length; i2++) {
                for (int i3 = 0; i3 < letters.length; i3++) {
                    for (int j = 0; j < 10; j++) {
                        for (int j1 = 0; j1 < 199; j1++) {
                            String letter1 = letters[i1];
                            String letter2 = letters[i2];
                            String letter3 = letters[i3];
                            String region = String.valueOf(j1);
                            if (j1 < 10) {
                                region = "0" + region;
                            }
                            String number = String.format("%s%d%d%d%s%s%s", letter1, j, j, j, letter2, letter3, region);
                            list.add(number);
                            System.out.println(number);
                        }
                    }
                }
            }
        }
        return list;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long before = System.nanoTime();
        boolean num = list.contains(number);
        long after = System.nanoTime();
        long time = after - before;
        System.out.println("номер " + (num ? "" : "не") + " найден, поиск занял: " + time + "нс");
        return num;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        long before = System.nanoTime();
        int index = Collections.binarySearch(sortedList, number);
        boolean num = index >= 0;
        long after = System.nanoTime();
        long time = after - before;
        System.out.println("номер " + (num ? "" : "не") + " найден, поиск занял: " + time + "нс");
        return num;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        long before = System.nanoTime();
        boolean num = hashSet.contains(number);
        long after = System.nanoTime();
        long time = after - before;
        System.out.println("номер " + (num ? "" : "не") + " найден, поиск занял: " + time + "нс");
        return num;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long before = System.nanoTime();
        boolean num = treeSet.contains(number);
        long after = System.nanoTime();
        long time = after - before;
        System.out.println("номер " + (num ? "" : "не") + " найден, поиск занял: " + time + "нс");
        return num;
    }
}
