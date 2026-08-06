package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class MaxinHugeListParallel {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }

        int max = list.parallelStream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println(max);
    }
}
