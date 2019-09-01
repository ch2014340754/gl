import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @creatdate 2019-06-08 15:36
 */
public class DomeClass4 {

    public static void main(String[] args) {
        String[] arr = of("1","2","3","4","5");
        Integer indext = listArr(Arrays.asList(arr),"A",0);
        System.out.println(indext);
    }

    public static  Integer  listArr(List date ,String  pre,int index){
        if (date.isEmpty()){
            ++index;
            System.out.println(pre);
        }
        for (int i = 0; i < date.size(); i++) {
           List temp = new LinkedList(date);
           listArr(temp, pre+temp.remove(i),index);
        }
        return index;
    }
    private static <T> T[] of(T... values){
        return values;
    }
}
