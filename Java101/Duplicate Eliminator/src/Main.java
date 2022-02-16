import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[]{1, 1, 3, 7, 7, 8, 8, 9, 9, 9, 10,10,10};
        int[] duplicate = new  int[list.length];

        int startIndex = 0;
        boolean isInDuplicate = false;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j] && list[i] % 2 == 0) {
                    isInDuplicate = false;
                    for (int value : duplicate) {
                        if (value == list[i]) {
                            isInDuplicate = true;
                            break;
                        }
                    }
                    if (!isInDuplicate) {
                        duplicate[startIndex] = list[i];
                        startIndex+=1;
                    }
                }

            }
            
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + ", ");
            }
        }

    }
}
