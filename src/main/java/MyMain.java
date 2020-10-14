public class MyMain {

    public static int randomNumber() {
        return (int) ((20 - 10 + 1) * Math.random()) + 10;
    }

    public static int largest(int a, int b, int c) {
        int temp = Math.max(a, b);
        return Math.max(temp, c);
    }

    public static int smallest(int a, int b, int c) {
        int temp = Math.min(a, b);
        return Math.min(temp, c);
    }

    public static void main(String[] args) {
        int a = randomNumber();
        int b = randomNumber();
        int c = randomNumber();
        System.out.println("The three random numbers are: " + a + ", " + b + ", " + c + ".");
        System.out.println("The largest number is " + largest(a, b, c));
        System.out.println("The smallest number is " + smallest(a, b, c));
    }

}


