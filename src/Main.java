import java.util.*;

public class Main {

    private final static Random random = new Random();

    public static void main(String[] args) {


        Set<Integer> number = new HashSet<>();
        Set<Integer> numberRemuve = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            number.add(random.nextInt(1000));
        }
        for (Integer number1 : number) {
            if (!(number1 % 2 == 0)) {
                numberRemuve.add(number1);
            } else {
                System.out.print(number1 + " ");
            }
        }
        for (Integer number1 : numberRemuve) {
            number.remove(number1);
        }
    }
}




