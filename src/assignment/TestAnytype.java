package assignment;

public class TestAnytype {
    public static void main(String[] args) {
            AnyTypeMergeSort obj = new AnyTypeMergeSort();
            String[] arr={"banana","apple","orange","pineapple"};
            obj.mergeSort(arr,0,arr.length-1);
            for(String item : arr)
                System.out.print(item+" ");
        System.out.println();
    }
}
