package test;

public class Reigai {
    public static void main(String[] args) {
        int result;
        result = div(5, 2);
        System.out.println("戻り値 = " + result);
    }
 
    public static int div(int num1, int num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("0で割ったときの例外を発生させる");
            }
            int result = num1 / num2;
 
            return result;
 
        } catch (Exception e) {
            System.out.println("例外が発生しました。");
            System.out.println(e);
 
            return 0;
        }
    }


}
