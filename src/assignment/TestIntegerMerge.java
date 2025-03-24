package assignment;

public class TestIntegerMerge {
    public static void main(String[] args) {
       IntegerMergeSort obj = new IntegerMergeSort();
       int[] arr = {38,27,43,3,9,82,10};
       obj.mergeSort(arr,0,arr.length-1);
       for(int i : arr)
           System.out.print(i+" ");

       System.out.println();

    }
}
