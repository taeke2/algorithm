import java.util.*;

public class SortClass<T> {
    // 삽입 정렬
    public void insertionSort(List<T> list, Comparator<T> comparator) {
        for (int i = 1; i < list.size(); i++) {
            T elt_i = list.get(i);
            int j = i;
            while (j > 0) {
                T elt_j = list.get(j - 1);
                if (comparator.compare(elt_i, elt_j) >= 0)
                    break;
                list.set(j, elt_j);
                j--;
            }
            list.set(j, elt_i);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 1, 4, 2));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer elt1, Integer elt2) {
                return elt1.compareTo(elt2);
            }
        };

        SortClass<Integer> is = new SortClass<Integer>();
        is.insertionSort(list, comparator);
        System.out.println(list);
    }
}
