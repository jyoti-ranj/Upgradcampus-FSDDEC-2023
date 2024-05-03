import java.util.*;

public class FrequentEle {

    public static int mostFrequentElement(int[] arr) {
        if (arr.length == 0)
            return -1;

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = arr[0]; // Initialize most frequent element
        int maxFrequency = frequencyMap.get(arr[0]); // Initialize max frequency

        // Iterate through the frequency map to find the most frequent element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                mostFrequent = num;
                maxFrequency = frequency;
            }
        }

        return mostFrequent;
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mostFrequentElement(arr));
    }
}

