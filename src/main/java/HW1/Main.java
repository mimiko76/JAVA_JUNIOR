package HW1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rand.nextInt(0,10));
        }
        System.out.println(arr);
        double result = arr.stream()
                .mapToDouble(Integer::intValue)
                .filter(num -> num %2 ==0)
                .average()
                .orElse(0.0);

        System.out.println(result);
    }
}
