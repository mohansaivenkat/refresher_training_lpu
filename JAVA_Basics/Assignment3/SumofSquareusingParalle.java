package Assignment3;
import java.util.ArrayList;
import java.util.List;

public class SumofSquareusingParalle {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }

        long sum = list.parallelStream()
                .mapToLong(n -> n * n)
                .sum();

        System.out.println(sum);
    }
}
