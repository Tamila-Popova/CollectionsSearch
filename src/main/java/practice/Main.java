package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> coolNumbers = CoolNumbers.generateCoolNumbers();
        List<String> sortedCoolNumbers = new ArrayList<>(coolNumbers);
        Collections.sort(sortedCoolNumbers);
        HashSet<String> listHashSet = new HashSet<>(coolNumbers);
        TreeSet<String> listTreeSet = new TreeSet<>(coolNumbers);
        System.out.println("Длина списка: " + CoolNumbers.list.size());
        String searchNumber = sc.nextLine();
        CoolNumbers.bruteForceSearchInList(coolNumbers, searchNumber);
        CoolNumbers.binarySearchInList(coolNumbers, searchNumber);
        CoolNumbers.searchInHashSet(listHashSet, searchNumber);
        CoolNumbers.searchInTreeSet(listTreeSet, searchNumber);
    }
}
