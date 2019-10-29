/**
 * 统计在从1到n的正整数中1出现的次数
 *
 * @author 吖大哥
 * @date Jun 11, 2014 10:26:21 PM
 */
public class CountOne {

    public static void main(String[] args) {

        int n = 1000000000;


        long start2 = System.currentTimeMillis();
        int sum2 = CountOne.numOF(n);
        long end2 = System.currentTimeMillis();
        System.out.println(" sum2 历时 ：" + (end2 - start2) + " 出现 1 的次数: "
                + sum2);

    }

    /**
     * 效率稍好点
     *
     * @param n
     * @return
     */
    public static int numOF(int n) {
        int number = 0;
        for (int i = 1; i <= n; ++i) {
            number += numberOf1(i);
        }
        return number;
    }

    public static int numberOf1(int n) {
        int number = 0;
        while (n != 0) {
            if (n % 10 == 2) {
                number++;
            }
            n = n / 10;
        }
        return number;
    }



}
