//Array list integre
import java.util.ArrayList;
import java.util.Arrays;

class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(al.contains(5));         
        System.out.println(al.indexOf(7));          
        System.out.println(al.lastIndexOf(5));      
    }
}
