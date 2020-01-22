import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algoTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice==1){
            checkFirstCondition chek1 = new checkFirstCondition();
            List<Integer> numbers = checkFirstCondition.init();
            System.out.println("CheckResult: "+chek1.checkCount(numbers));}
        if (choice==2){
            checkSecondCondition chek2 =new checkSecondCondition();
            List<Integer> numbers = checkSecondCondition.init();
            System.out.println("CheckResult: "+chek2.checkCount(numbers));
        }
    }

}
