import java.util.Arrays;
public class Sorts{
    public static void InsertionSort(int[]array){
	int currentval = array[0];
	for (int i = 0;i<array.length;i++){
	    currentval = array[i];
	    int j;
	    for (j = i - 1; j >= 0 && currentval < array[j]; j--){
		array[j+1] = array[j];
	    }
	    array[j+1] = currentval;
	    //System.out.println(Arrays.toString(array));
			      
	}
	    
    }

    public static void SelectionSort(int[]array){
	for (int i = 0;i<array.length - 1;i++){
	    int indexmin = i;
	    for (int j = i+1; j < array.length; j++){
		if (array[j] < array[indexmin]){
		    indexmin = j;
		}
	    }
	    int minimum = array[indexmin];
	    array[indexmin] = array[i];
	    array[i] = minimum;
	    
	    //System.out.println(Arrays.toString(array));
	}
    }
    public static void BubbleSort(int[]array){
	boolean marker = true;
	int z = 1;
	while (marker){
	    marker = false;
	    for (int i = 0;i<array.length-z;i++){
		if (array[i] > array[i+1]){
		    int x = array[i+1];
		    array[i+1] = array[i];
		    array[i] = x;
		    marker = true;
		}
		System.out.println(Arrays.toString(array));
	    }
	    z++;
	    
	    
	}
    }
    public static void main(String[]args){
	int[] x = {3,5,1,2,6,7,4};
	InsertionSort(x);
        //SelectionSort(x);
	BubbleSort(x);
    }
}
