import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int min = 100;
        int max = 900;
        int diff = max - min;
        Random random = new Random();
        int c = random.nextInt(diff + 1);
        c+=min;
        System.out.println(c);
    }
}