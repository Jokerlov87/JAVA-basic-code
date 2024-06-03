package 十四届;

import java.util.Scanner;

public class 试题B幸运数字 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i = 1, count = 0;
        for (i = 1; count < 2023; i++) {
            if (j2z(i) && j8z(i) && j1z(i) && j6z(i))
            {
                count++;
            }
            if(count==2023)
                System.out.println(i);

        }
    }

    static boolean j2z(int x) {
        int sum = 0, y;
        y = x;
        while (x != 0) {
            sum = sum + x % 2;
            x = x / 2;
        }
        if (y % sum == 0)
            return true;
        else
            return false;
    }

    static boolean j8z(int x) {
        int sum = 0, y = x;
        while (x != 0) {
            sum = sum + x % 8;
            x = x / 8;
        }
        if (y % sum == 0)
            return true;
        else
            return false;
    }

    static boolean j1z(int x) {
        int sum = 0, y = x;
        while (x != 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        if (y % sum == 0)
            return true;
        else
            return false;
    }

    static boolean j6z(int x) {
        int sum = 0, y = x;
        while (x != 0) {
            sum = sum + x % 16;
            x = x / 16;
        }
        if (y % sum == 0)
            return true;
        else
            return false;
    }
}
