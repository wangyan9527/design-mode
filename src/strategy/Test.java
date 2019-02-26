package strategy;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        /**
         * 以下是jdk中使用到的策略模式的地方
         * @param args
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        /**
         * TreeSet并不关心传入的comparator对象中的方法的具体实现是什么
         */
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);


        /**
         * 使用策略模式实现加减乘除运算
         */
    }

}
