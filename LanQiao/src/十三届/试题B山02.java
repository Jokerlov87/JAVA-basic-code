package 十三届;

public class 试题B山02 {
    public static void main(String[] args) {
        long count = 0;
        for (long i = 2022; i <= 2022222022; i++) {
            if (huiwen(i) && dandiao(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 判断是否为回文数
    public static boolean huiwen(long n) {
        long num = n;
        long result = 0;
        while (num != 0) {
            long ge = num % 10;
            result = result * 10 + ge;
            num /= 10;
        }
        return n == result;
    }

    // 判断一个回文数字是否单调
    public static boolean dandiao(long n) {
        long num = n;
        int len = 0;
        while (num != 0) {
            num /= 10;
            len++;
        }

        if (len % 2 == 0) {
            for (int i = 1; i <= len / 2; i++) {
                long ge = n % 10;
                long shi = (n / 10) % 10;
                n /= 10;
                if (shi < ge) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 1; i <len / 2 + 1; i++) {
                long ge = n % 10;
                long shi = (n / 10) % 10;
                n /= 10;
                if (shi < ge) {
                    return false;
                }
            }
            return true;
        }
    }
}