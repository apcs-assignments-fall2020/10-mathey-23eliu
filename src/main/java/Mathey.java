public class Mathey {

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static String max(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b, int c) {
        int temp = Math.max(a, b);
        return Math.max(temp, c);
    }

    public static double max(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public static int randomInteger(int a, int b) { 
        return (int) ((b - a + 1) * Math.random()) + a;
    }

    public static int randomInteger(int b) { 
        return (int) ((b - 0 + 1) * Math.random()) + 0;
    }

    //just to check if the randomInteger methods work
    public static void main(String[] args) {
        System.out.println(randomInteger(1, 10));
        System.out.println(randomInteger(8));
    }
}