import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        //set el in between
        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete elements 
        list.remove(3);
        System.out.println(list);

        //loops
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}