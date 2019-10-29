import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public void iteratorDelete(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer integer = it.next();
            if (integer < 20) {
                  //可以删除
//                it.remove();
                   //运行时异常
                list.remove(integer);
            }
        }
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(20);
        list.add(30);
        list.add(40);
        TestIterator testIterator = new TestIterator();
        testIterator.iteratorDelete(list);
    }
}