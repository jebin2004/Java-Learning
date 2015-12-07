package sample;

public class Arrays {
	public static void main(String[] args){
		//int[] arr;
		int[] arr = new int[5];			//declares an array of 5 integers
		arr[2]=42;
		String[] names = {"A","B","C","D","E"};			//array literal
		System.out.println(arr[2] + names[2]);
		names[4] = "F";
		System.out.println(arr[2] + names[4]);
		System.out.println(arr.length);				// array length
		
		int[] myArr = {6,42,3,7};
		int sum = 0;
		for(int i=0;i<myArr.length;i++){		//sum of the array
			sum += myArr[i];
		}
		System.out.println(sum);
		
		int sum2=0;
		for(int i: myArr){			//for each loop (enhanced for loop)
			sum2 += i;
			System.out.println(i);
			System.out.println(sum2);
		}
		//Multidimensional Arrays 
		int[][] sample = {{1,2,3},{4,5,6}};		//declares an array with two arrays as its elements	 
		int x = sample[0][1];
		System.out.println(x);
		
		int[][] sample1 = {{1,2,3},{4},{5,6,7}};	//declares an array with three arrays as its elements	 
		System.out.println(sample1[2][2]);

	}
	

}
