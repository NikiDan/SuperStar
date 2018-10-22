public class FirstNumberSum {

    public static int sum() {

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Generation.random() / 100;
        }
        return sum;
    }

}
