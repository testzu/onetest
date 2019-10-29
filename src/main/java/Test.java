import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] i = new int[]{1,5,2,8,6};
        Arrays.sort(i);
        System.out.println(i.length);
        for (int p = i.length-1;p>=0;p--)
        System.out.print(i[p]+" ");
        System.out.println("ssk");
    }
}
