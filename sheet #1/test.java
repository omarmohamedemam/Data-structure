// this file includes only one test case for questions 1,26
import java.util.Scanner;
public class test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array:");
		int len = sc.nextInt();
		System.out.println("Enter the array:");
		int arr[]= new int [len];
		for(int i=0;i<len;i++) {
			Scanner ssc = new Scanner(System.in);
			System.out.print("element no."+i+"=");
			arr[i]= ssc.nextInt();
			//System.out.print("\n");
		}
		System.out.println("Array is :");
		System.out.print(" [");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]+" ");
		}
		System.out.print("] \n");
		 MySpecialArrayUtlis x = new MySpecialArrayUtlis() ;
		int y[]= x.sumEvenOdd(arr);
		System.out.println("sum of evens is  "+y[0]+"  and some of odds is "+y[1] );
		double z =x.average(arr);
		System.out.println("average of array is:");
		System.out.println(" "+z);
		Scanner scc = new Scanner(System.in);
		System.out.print("Enter the element to move :");
		int val = sc.nextInt();
		System.out.println("array after moving the value ("+val+") is:");
		x.moveValue(arr, val);
		System.out.print(" [");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]+" ");
		}
		System.out.print("] \n");
		
		System.out.println("reversed array is:");
		x.reverse(arr);
		System.out.print(" [");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]+" ");
		}
		System.out.print("] \n");
		Scanner smc = new Scanner(System.in);
		System.out.print("Enter the length of the 2D array:");
		int l = smc.nextInt();
		System.out.println("Enter 2D array is:");
		int w[][]= new int [l][l];
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				Scanner swc = new Scanner(System.in);
				System.out.print("Enter the element no.["+i+"]"+"["+j+"]=");
				w[i][j] = swc.nextInt();
				
			}
		}
		System.out.println("2D array is:");
		for(int i=0;i<w.length;i++) {
			for(int j=0;j<w.length;j++) {
				System.out.print(w[i][j]+" ");
			}
			System.out.print("\n");
			
		}
		System.out.println("transpose of 2D array is:");
		x.transpose(w);
		for(int i=0;i<w.length;i++) {
			for(int j=0;j<w.length;j++) {
				System.out.print(w[i][j]+" ");
			}
			System.out.print("\n");
			
		}
		System.out.println("###########################fibonaci########################");
		System.out.println("{note:counting of terms start from 1}");
		System.out.println("enter nth for fibonaci:");
		
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		Fibonacci tr = new Fibonacci();
		long ans = tr.fibo(f);
		System.out.println(f +"th term in fibonaci equals = "+ans);
		
		
		
		
	}
			
}
