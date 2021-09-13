public class HW2 {
    public static void main(String[] args) {
        System.out.println(task1(10,10));
        number(5);
        someTask(8, "Hello, world!");
        System.out.println(isLeap(2021));
    }
    static boolean task1(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    static void number(int x) {

        if (x >= 0) {
            System.out.println(x + " положительное число");
        } else {
            System.out.println(x + " отрицательное число");
        }
    }
    static boolean isPositive(int num) {
        return num < 0;
    }
    static void someTask(int x, String text) {
        for (int i = 0; i < x; i++) {
            System.out.println(text);
        }
    }
    static boolean isLeap( int year ){
        if(year % 100 == 0 || year % 400 == 0) return true;
        return year % 4 == 0;
    }
}
