package Unit7_Arrays;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5};
		int[] newArr=Arrays.copyOf(arr, 2*arr.length);
		
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}

	}

}
