package list;

import java.util.Iterator;
import java.util.List;

public class MyListOpts {

    private MyListOpts() {
        throw new IllegalStateException("Utility class");
    }

    //普通for循环
    public static <T> void print1(List<T> list){
        list.clear();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    //增强for循环
    public static <T> void print2(List<T> list){
        list.clear();
        for(T item:list){
            System.out.println(item);
        }
    }

    //迭代器循环
    public static <T> void print3(List<T> list){
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    //forEach
    public static <T> void print4(List<T> list){
        list.forEach(System.out::println);
    }

    //普通for循环并使用List的remove()方法
    public static void removeEvensVer1(List<Integer> lst){
        int i = 0;
        while( i < lst.size()){
            if(lst.get(i) % 2 == 0){
                lst.remove(i);
            }else {
                i++;
            }
        }
    }

    //增强for循环并使用List的remove()方法
    public static void removeEvensVer2(List<Integer> lst){
        for( Integer x : lst){
            if( x % 2 == 0){
                lst.remove(x);
            }
        }
    }

    //使用Iterator迭代器的remove()方法
    public static void removeEvensVer3(List<Integer> lst){
        Iterator<Integer> itr = lst.iterator();
        while(itr.hasNext()){
            if(itr.next() % 2 == 0){
                itr.remove();
            }
        }
    }

    //从最后端添加元素
    public static void makeList1(List<Integer> lst,int n){
        lst.clear();
        for(int i = 0;i < n; i++){
            lst.add(i);
        }
    }

    //从最前端添加元素
    public static void makeList2(List<Integer> lst,int n){
        lst.clear();
        for(int i = 0;i < n; i++){
            lst.add(i,i);
        }
    }

    //普通for循环的sum
    public static int sum1(List<Integer> lst){
        int total = 0;
        for (int i = 0; i < lst.size(); i++) {
            total += lst.get(i);
        }
        return total;
    }

    //增强for循环的sum
    public static int sum2(List<Integer> lst){
        int total = 0;
        for(int i:lst){
            total += i;
        }
        return total;
    }

    //迭代器循环的sum
    public static int sum3(List<Integer> lst){
        int total = 0;
        Iterator<Integer> iterator = lst.iterator();
        while (iterator.hasNext()){
           total += iterator.next();
        }
        return total;
    }
}
