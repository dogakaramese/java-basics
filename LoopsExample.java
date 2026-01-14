public class LoopsExample {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop i = " + i);
        }

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While loop j = " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("Do-while loop k = " + k);
            k++;
        } while (k <= 5);
    }
}
