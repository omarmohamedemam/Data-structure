
public class MySpecialArrayUtlis {
	
	public static void reverse(int[] arr) {
		int swap;
		for(int i =0 ;i<arr.length/2;i++) {
			 swap = arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1] =swap;	
		}

	}
	
	public static int[] sumEvenOdd(int[] arr) {
		int even_sum = 0;
		int odd_sum = 0;
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i]%2==0) {
				 even_sum=even_sum+arr[i];
			}
			else {
				odd_sum = odd_sum + arr[i];
			}
		}
		int ans[]= new int[2];
		ans[0]=even_sum;
		ans[1]=odd_sum;
		return ans;
	}
	
	public static double average(int[] arr) {
		double avrage = 0;
		 double  sum=0;
		for(int i =0 ;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avrage=sum/(double)(arr.length);
		return avrage ; 
		
	}
	
	public static void moveValue(int[] arr, int val) {
		int x =arr.length-1;
		for(int i =0 ;i<x;i++) {
			if(arr[i]==val) {
				int k=i;
				while(k<arr.length-1) {
					int swap = arr[k];
					arr[k]=arr[k+1];
					arr[k+1] =swap;
					k++;
				}
				x--;
				if(arr[i]==val) {
					i--;
				}
			}
			
		}
	}
	
	public static void transpose(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length/2;j++) {
				int swap = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i] =swap;
			}
		}
	}
	
	
}
