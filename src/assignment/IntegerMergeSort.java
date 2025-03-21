package assignment;

public class IntegerMergeSort
{
    public void mergeSort(int [] arr, int lowerBound, int upperBound)
    {
        // if the lower-bound is less than the upper-bound there is nothing in the array
        if (lowerBound >= upperBound)
            return;
        int midNum= (int) Math.floor((lowerBound+upperBound)/2);
        //sort the first half
        mergeSort(arr,lowerBound,midNum);
        //sort the second half
        mergeSort(arr,midNum+1,upperBound);
        // merges the separate and sorted arrays back together
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
            if(leftArray[i] < rightArray[j])
            {
                arr[k] = leftArray[i];
                i +=1;
            }else
            {
                arr[k] = rightArray[j];
                j+=1;
            }
            k+=1;
        }
        //if i is less than left array length the loop will execute
        while (i< leftArrayLength)
        {
            arr[k]= leftArray[i];
            i+=1;
            k+=1;
        }
        // if j is less than right array length the loop will execute
        while(j < rightArrayLength)
        {
            arr[k]= rightArray[j];
        }
    }
}
