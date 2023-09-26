package app.utils;

public class Random {

    public static int point() {
        int min = 1;
        int max = 10;
        int diff = max - min;
        java.util.Random random = new java.util.Random();
        int num = random.nextInt(diff + 1);
        num += min;
        return num;
    }
}
