package assignment;

public class IntegerMergeSort {
    public void mergeSort(int [] arr, int lowerBound, int upperBound)
    {
        if (lowerBound >= upperBound)
            return;
        int midNum= (lowerBound+upperBound)/2;// return so you can implement a floor
        mergeSort(arr,lowerBound,midNum);
        mergeSort(arr,midNum+1,upperBound);
        merge(arr,lowerBound,midNum,upperBound);
    }
    public void merge(int [] arr, int lowerBound,int mid,int upperBound)
    {
        //length of array
        int leftArrayLength = mid-lowerBound+1;
        int rightArrayLength = upperBound-mid;
        // arrays
        int []  rightArray= new int[rightArrayLength];
        int [] leftArray= new int[leftArrayLength];
        //new arrays getting filled
        for(int i :  leftArray)
        {
            leftArray[i] = arr[lowerBound+i];
        }
        for(int j : rightArray)
        {
            rightArray[j]= arr[mid+j+1];
        }
        int i = 0;
        int j = 0;
        int k = lowerBound;
        while (i < leftArrayLength && j < rightArrayLength)
        {
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i +=1;
            }else{
                arr[k] = rightArray[j];
                j+=1;
            }
            k+=1;
        }
        while (i< leftArrayLength)
        {
            arr[k]= leftArray[i];
            i+=1;
            k+=1;
        }
        while(j < rightArrayLength)
        {
            arr[k]= rightArray[j];
        }
    }
}
