import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            numberList.add(i);
        }

        List<Integer> subList1 =  numberList.subList(0,2500);
        List<Integer> subList2 =  numberList.subList(2500,5000);
        List<Integer> subList3 =  numberList.subList(5000,7500);
        List<Integer> subList4 =  numberList.subList(7500,10000);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        OddEvenNumberFinder oddEvenNumberFinder = new OddEvenNumberFinder(subList1);
        OddEvenNumberFinder oddEvenNumberFinder2 = new OddEvenNumberFinder(subList2);
        OddEvenNumberFinder oddEvenNumberFinder3 = new OddEvenNumberFinder(subList3);
        OddEvenNumberFinder oddEvenNumberFinder4 = new OddEvenNumberFinder(subList4);

        executor.execute(oddEvenNumberFinder);
        Thread.sleep(100);
        executor.execute(oddEvenNumberFinder2);
        Thread.sleep(100);
        executor.execute(oddEvenNumberFinder3);
        Thread.sleep(100);
        executor.execute(oddEvenNumberFinder4);


        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Process Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Even Number Count: " + oddEvenNumberFinder.getEvenNumberList().size());
        System.out.println("Odd Number Count: " + oddEvenNumberFinder.getOddNumberList().size());

    }
}
