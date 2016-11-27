class sortingAlgoBenchmark {

  
       public static int[] bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m > 0; m--) {
            for (int i = 0; i < m - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                     int temp;
                     temp = array[i];
                     array[i] = array[k];
                     array[k] = temp;
                }
	       	}
	       
		      }	return array;
             
        
	}
	
	public static void swapNumbers(int i, int j, int[] Array){
		int temp;
		temp=Array[i];
		Array[i]=Array[j];
		Array[j]=temp;
	}

     public static int[] SelectionSort(int[] Array){
        for (int i = 0; i < Array.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < Array.length; j++)
                if (Array[j] < Array[index])
      		swapNumbers(i,j,Array);
        }
        return Array;
    }
	
	
	public static int[] InsertionSort(int[] Array){
        for (int i = 1; i < Array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(Array[j] < Array[j-1]){
                  swapNumbers(j,j-1,Array);
                }
            }
        }
        return Array;
    }
	
	
	
	private int array[];
    private int length;
    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	
	
	private int[] array1;
    private int[] tempMergArr;
    public void Sort(int inputArr[]) {
        this.array1 = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
    private void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
         tempMergArr[i] = array1[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array1[k] = tempMergArr[i];
                i++;
             } 
             else {
                array1[k] = tempMergArr[j];
                j++;
             }
            k++;
        }
        while (i <= middle) {
            array1[k] = tempMergArr[i];
            k++;
            i++;
        }
		
		
		
		
		
		
    }
	
	
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;
    public static void buildheap(int []a) {
      n = a.length-1;
      for(int i=n/2; i>=0; i--){
         maxheap(a,i);
      }
   }
   public static void maxheap(int[] a, int i) { 
      left = 2*i;
      right = 2*i+1;
      if(left <= n && a[left] > a[i]){
         largest=left;
      } else {
         largest=i;
      }
      if(right <= n && a[right] > a[largest]) {
         largest=right;
      }
      if(largest!=i) {
         exchange(i, largest);
         maxheap(a, largest);
      }
   }
   public static void exchange(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t; 
   }
   public static void Sort1(int[] myarray) {
      a = myarray;
      buildheap(a);
      for(int i=n; i>0; i--) {
         exchange(0, i);
         n=n-1;
         maxheap(a, 0);
      }
    }
	
	
	
	
}

	
	
	
	
	

	
	


	
