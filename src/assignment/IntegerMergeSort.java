package assignment;

public class IntegerMergeSort {
    public void mergeSort(int [] A, int num1, int num2)
    {
        if (num1 >= num2)
            return;
        int midNum= (num1+num2)/2;// return so you can implement a floor
        mergeSort(A,num1,midNum);
        mergeSort(A,midNum+1,num2);
        merge(A,num1,midNum,num2);
    }
    public int merge(int [] A, int num1,int mid,int num2)
    {
        //length of array
        int n= mid-num1+num2;
    }
}
