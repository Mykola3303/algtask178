import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class checkFirstCondition  {
    public static List<Integer> init() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter nums (NaN to end input): ");
        do {
            if (scanner.hasNextInt())
                list.add(scanner.nextInt());
            else
                break;
        } while (true);

        return list;
    }

    public int checkCount(List<Integer> nums) {
        int count = 0;

        for (int k = 1; k < nums.size() - 1; k++)
            if (nums.get(k) < (nums.get(k - 1) + nums.get(k + 1)) / 2)
                count++;

        return count;
    }
}
