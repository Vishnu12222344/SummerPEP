package summerpep2.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Unique letters and their frequencies:");
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("Character: " + c + ", Frequency: " + map.get(c));
            }
        }
    }
}
