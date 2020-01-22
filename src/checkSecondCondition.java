import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class checkSecondCondition  {
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
        for (int k = 1; k < nums.size() - 1; k++) {
            int element = nums.get(k);
            if (Math.pow(2, k)< nums.get(k) &  nums.get(k)>calculateFactorial(k))
                count++;
        }
        return count;
    }

    int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}
