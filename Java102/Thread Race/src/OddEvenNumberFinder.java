import java.util.ArrayList;
import java.util.List;

public class OddEvenNumberFinder implements Runnable{

    private static List<Integer> evenNumberList = new ArrayList<>();
    private static List<Integer> oddNumberList = new ArrayList<>();;
    private List<Integer> subList;

    private final Object LOCK = new Object();

    public OddEvenNumberFinder(List<Integer> subList) {
        this.subList = subList;
    }

    @Override
    public synchronized void run() {

        synchronized (LOCK) {
            for (Integer number : this.subList) {

                if (number % 2 == 0)
                    evenNumberList.add(number);

                if (number % 2 != 0)
                    oddNumberList.add(number);
            }
        }

    }

    public List<Integer> getEvenNumberList() {
        return evenNumberList;
    }

    public List<Integer> getOddNumberList() {
        return oddNumberList;
    }
}
