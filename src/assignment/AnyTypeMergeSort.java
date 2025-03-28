package assignment;

public class AnyTypeMergeSort <T extends Comparable<T>>
{
    public void mergeSort(T[] arr, int lowerBound, int upperBound)
    {
        if(lowerBound >= upperBound)
            return;
        int mid = (int) Math.floor((upperBound+lowerBound)/2);
        mergeSort(arr,lowerBound,mid);
        mergeSort(arr,mid+1,upperBound);
        merge(arr,lowerBound,mid,upperBound);
    }
    public void merge(T[] arr, int lowerBound, int middleNumber, int upperBound)
    {
        //length of array
        int leftArrayLength = middleNumber-lowerBound+1;
        int rightArrayLength = upperBound-middleNumber;
        // arrays
        T []  rightArray=  (T[]) new Comparable[rightArrayLength];
        T [] leftArray= (T[]) new  Comparable[leftArrayLength];
        //new arrays getting filled
        for(int i=0; i < leftArrayLength; i++)
        {
            leftArray[i] =  arr[lowerBound+i];
        }
        for(int j=0; j < rightArrayLength; j++)
        {
            rightArray[j]=  arr[middleNumber+j+1];
        }
        int i = 0;
        int j = 0;
        int k = lowerBound;
        while (i < leftArrayLength && j < rightArrayLength)
        {
            if(leftArray[i].compareTo(rightArray[j]) <= 0)
            {
                arr[k] =leftArray[i];
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
            k++;
            j++;
        }
    }
}
