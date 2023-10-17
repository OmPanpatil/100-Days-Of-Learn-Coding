import java.util.Arrays;

public class arrays5
{ 
	public static void main(String[] args) 
    { 
		int[] arr = {23,5,67,20,3,30,79,3,70,2};
		System.out.println("Original Array : "+ Arrays.toString(arr));  
		Arrays.sort(arr);  
		System.out.print("Sorted Array : "+ Arrays.toString(arr)); 
    } 
}