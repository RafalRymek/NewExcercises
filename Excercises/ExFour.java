package Excercises;

public class ExFour {

	public static void main(String[] args) {
		 
		int[] numbers = new int[]{2,4,4,3,5,7,8,10,222,9};
		System.out.println(sumArray(numbers));
		}
		
		private static int sumArray(int[] numbers){
	
		        int sum = 0;
		        for (int number : numbers) {
		            sum += number;
		        }
		        return sum;
		}
		

	}


