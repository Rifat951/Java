public class MergeSort {


    //declare the size of array into left/right
    //create left and right subarray using array

    //copy all the elements into left subarray
    //copy all the elements into right subarray


    // get a starting index of sort aka pivot
    //////// reset loop variables before performing merge


    // merge left and right subarray
    // merge the remaining left subarray elements
    // merge the remaining right subarray elements


    // sort all the arrays and merge them
    // need to use recursive function here


    void merge(int arr[], int left, int middle, int right){

        // size of the left subarray
        int low = middle - left +1;

        // size of the right subarray
        int high = right - middle;

        // create left and right subarray
        int L[] = new int[low];
        int R[] = new int[high];

        int i =0 , j =0;

        // copy elements into left subarray
        for(i = 0; i < low ; i++){
            L[i] = arr[left +i];
        }

        // copy elements into right subarray
        for(j = 0; j < high ; j ++){
            R[j] = arr[middle + 1 + j];
        }

        int k = left; // get starting index of sort
        // reset loop variables before performing merge
        i = 0;
        j = 0;

        //merge the left and right subarrays
        while( i < low && j <high){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++; // otherwise tracker will not move
        }

        // merge remaining elements from left subarray
        while(i < low){
            arr[k] = L[i];
            i++;
            k++;
        }

        //merge remaining elements from right subarray
        while( j < high){
            arr[k] = R[j];
            j++;
            k++;
        }

    }



    //helper function that creates the sub cases for sorting
    void mergesort(int arr[], int left, int right){
        int middle;
        //sort only if the left index is lesser than the right index (meaning that sorting is done)
        if(left<right){
            middle = (left+right)/2;
            //recrusive
            // sort left array
            mergesort(arr,left,middle);
            //sort right array
            mergesort(arr, middle +1, right);

            // merge both left and right arrays
            merge(arr,left,middle,right);
        }
    }


    void display(int arr[]){
        for(int i =0; i < arr.length; ++i){
            System.out.print((arr[i]+" "));
        }
    }

    public static void main(String args[])
    {
        int arr[] = { 9, 3, 1, 5, 13, 12 };
        MergeSort ob = new MergeSort();
        ob.mergesort(arr, 0, arr.length - 1);
        ob.display(arr);
    }
}
