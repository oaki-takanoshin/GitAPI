package test2;

import java.util.Scanner;

class InputNotExpected1 {
    public static void main(String[] args) {
        // Scannerオブジェクト
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Int x: ");
        // ユーザ入力を促し、変数xに代入
        int x = stdIn.nextInt();

        System.out.print("String y: ");
        // ユーザ入力を促し、変数yに代入
        String y = stdIn.next();

        System.out.print("String z: ");
        // ユーザ入力を促し、変数zに代入
        String z = stdIn.nextLine();

        System.out.println();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}