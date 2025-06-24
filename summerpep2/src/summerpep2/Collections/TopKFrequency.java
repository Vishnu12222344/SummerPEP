package summerpep2.Collections;
import java.util.*;
public class TopKFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter space/comma-separated input (words or numbers): ");
        String input = s.nextLine().toLowerCase().trim();
        System.out.print("Enter K: ");
        int k = s.nextInt();
        String[] tokens = input.split("[,\\s]+");
        Map<String, Integer> freqMap = new HashMap<>();
        for (String token : tokens) {
            freqMap.put(token, freqMap.getOrDefault(token, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(freqMap.entrySet());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            result.add(pq.poll().getKey());
        }
        System.out.println("Top " + k + " frequent items: " + result);
    }
}
