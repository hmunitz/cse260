package Lab4;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cebo4 on 9/19/2017.
 */
public class SortArrayList {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        list = arraySort(list);
    }

    private static <E extends Comparable<E>> ArrayList<E> arraySort(ArrayList<E> list){
        if(list.size() <= 1)
            return list;
        ArrayList<E> lowerList = new ArrayList<>();
        ArrayList<E> upperList = new ArrayList<>();
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        E center = list.get(index);
        for(int i = 0; i < list.size(); i++) {
            if(i != index) {
                E item = list.get(i);
                if (center.compareTo(item) > 0) {
                    lowerList.add(item);
                } else {
                    upperList.add(item);
                }
            }
        }

        lowerList = arraySort(lowerList);
        upperList = arraySort(upperList);

        lowerList.add(center);
        lowerList.addAll(upperList);

        return lowerList;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(7);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }
}
