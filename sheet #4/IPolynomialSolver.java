package eg.edu.alexu.csd.datastructure.linkedList;
import java.lang.Math; 
import java.util.concurrent.TimeUnit;
import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList.Node;
import java.awt.*;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
public class IPolynomialSolver {
	public static ILinkedList A = new ILinkedList();
	public static ILinkedList B = new ILinkedList();
	public static ILinkedList C = new ILinkedList();
	public static ILinkedList R = new ILinkedList();
	public static float a ;
	

		public static void setPolynomial(char poly,int [][] terms) {
			switch(poly) {
			case 'A':
				for(int count = 0 ; count < terms[0].length ; count++) {
					Point temp = new Point(terms[0][count],terms[1][count]);
					A.add(temp); 
					}
					break;
			case 'B':
				for(int count = 0 ; count < terms[0].length ; count++) {
					Point temp = new Point(terms[0][count],terms[1][count]);
					B.add(temp); 
					}
					
					break;
			case 'C':
				for(int count = 0 ; count < terms[0].length ; count++) {
					Point temp = new Point(terms[0][count],terms[1][count]);
					C.add(temp); 
					}
					break;
			}
			System.out.println("Polynomial " +poly+ " is set");
		}
		
		public static void print(char poly){
			
			switch(poly) {
			case 'A':
				//A=sort(A);
				Node temp = A.head;
				if(temp == null) {
					System.out.println("Variable not set");
				}
				System.out.print(poly + " Value is :");
				
				while(temp.next != null) {
					temp=temp.next;
					Point t =(Point)temp.getValue();
					if(t.x==1) {
						if(t.y!=0) {
							System.out.print("X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					else if(t.x==0) {}
					else if(t.x ==-1) {
						if(t.y!=0) {
							System.out.print("-X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					else {
						if(t.y!=0) {
							System.out.print(t.x+"X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					
					if(temp.next != null) {
						System.out.print(" + ");
					}
					
					
					
				}
				break;
			case 'B':
				//sort(B);
				Node temp2 = B.head;
				if(temp2 == null) {
					System.out.println("Variable not set");
				}
				System.out.print(poly + " Value is :");
				while(temp2.next != null) {
					temp2=temp2.next;
					Point t =(Point)temp2.getValue();
					if(t.x==1) {
						if(t.y!=0) {
							System.out.print("X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					else if(t.x==0) {}
					else if(t.x ==-1) {
						if(t.y!=0) {
							System.out.print("-X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					else {
						if(t.y!=0) {
							System.out.print(t.x+"X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					
					if(temp2.next != null) {
						System.out.print(" + ");
					}
					
					
					
				}
					break;
			case 'C':
				//sort(C);
				Node temp3= C.head;
				if(temp3 == null) {
					System.out.println("Variable not set");
				}
				System.out.print(poly + " Value is :");
				while(temp3.next != null) {
					temp3=temp3.next;
					Point t =(Point)temp3.getValue();
					if(t.x==1) {
						if(t.y!=0) {
							System.out.print("X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					else if(t.x==0) {}
					else if(t.x ==-1) {
						if(t.y!=0) {
							System.out.print("-X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					else {
						if(t.y!=0) {
							System.out.print(t.x+"X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					
					if(temp3.next != null) {
						System.out.print(" + ");
					}
					
					
					
				}
					break;
			case 'R':
				//sort(R);
				Node temp4= R.head;
				if(temp4 == null) {
					System.out.println("Variable not set");
				}
				
				System.out.print(poly + " Value is :");
				while(temp4.next != null) {
					temp4=temp4.next;
					Point t =(Point)temp4.getValue();
					if(t.x==1) {
						if(t.y!=0) {
							System.out.print("X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					else if(t.x==0) {}
					else if(t.x ==-1) {
						if(t.y!=0) {
							System.out.print("-X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
					}
					else {
						if(t.y!=0) {
							System.out.print(t.x+"X^"+t.y);
						}
						else {
							System.out.print(t.x);
						}
						
					}
					
					if(temp4.next != null) {
						System.out.print(" + ");
					}
					
					
					
					
				}
					break;
			}
			
			
			
		}

		public static void clearPolynomial(char poly) {
			switch(poly) {
			case'A':
				A.clear();
				break;
			case 'B':
				B.clear();
				break;
			case 'C':
				C.clear();
				break;
			case'R':
				R.clear();
			}
			System.out.println(poly+" was cleared");
			
		}
		public static float evaluatePolynomial(char poly, float value) {
			float ans =0;
			switch(poly) {
			case 'A':
				Node temp = A.head;
				if(temp == null) {
					System.out.print("Variable not set");
				}
				while(temp.next != null) {
					temp=temp.next;
					Point t =(Point)temp.getValue();
					ans=ans +(float) (t.x*Math.pow(value, t.y));
				}
				break;
			case 'B':
				Node temp2 = B.head;
				if(temp2 == null) {
					System.out.print("Variable not set");
				}
				while(temp2.next != null) {
					temp2=temp2.next;
					Point t =(Point)temp2.getValue();
					ans=ans +(float) (t.x*Math.pow(value, t.y));
				}
				break;
			case 'C':
				Node temp3 = C.head;
				if(temp3 == null) {
					System.out.print("Variable not set");
				}
				while(temp3.next != null) {
					temp3=temp3.next;
					Point t =(Point)temp3.getValue();
					ans=ans +(float) (t.x*Math.pow(value, t.y));
				}
				break;
				
			
		}
			return ans;
		}
		public static ILinkedList sort(ILinkedList x) {
			ILinkedList sorted = new ILinkedList();
			Node temp = x.head;
			int index;
			while(x.head != null){
				index = 0;
				Node max = x.head;
				for(int Count = 0 ; Count < x.size() ; Count++) {
					Point Temp1 = (Point)temp.value;
					Point Temp2 = (Point)max.value;
					if(Temp1.y > Temp2.y) {
						max = temp;
						index = Count;
					}
				}
				sorted.add(max.value);
				x.remove(index);
			}
			return sorted;	
		}
		public static void multiply(ILinkedList x,ILinkedList y){
			Node tempa = A.head;
			Node tempb = B.head;
			while(tempa!=null) {
				tempb = B.head;
				while (tempb!=null) {
					
					Point t = (Point)tempa.getValue();
					Point t2 = (Point)tempb.getValue();
					Point ans = new Point((t.x*t2.x),(t.y+t2.y));
					R.add(ans);
					tempb=tempb.next;
					
				}
				tempa=tempa.next;
			}
			
		}
		public static void add(ILinkedList x,ILinkedList y) {
		//	ILinkedList ans = new ILinkedList();
			Node temp1 = x.head;
			Node temp2 = y.head;
			//temp1 = temp1.next;
			//temp2 = temp2.next;
			while(temp1 != null) {
				
				int count = 0;
				temp2 = y.head;
				while(temp2 != null) 
					{
					Point p1 = (Point)temp1.getValue();
					Point p2 = (Point)temp2.getValue();
					if(p1.y == p2.y) {
						y.remove(count);
						Point add = new Point(p1.x+p2.x , p1.y);
						R.add(add);
					}
					temp2 = temp2.next;
					count++;
				}temp1 = temp1.next;
			}
				//return ans;
		}
		public static void subtract(ILinkedList x,ILinkedList y) {
			//	ILinkedList ans = new ILinkedList();
				Node temp1 = x.head;
				Node temp2 = y.head;
				//temp1 = temp1.next;
				//temp2 = temp2.next;
				while(temp1 != null) {
					
					int count = 0;
					temp2 = y.head;
					while(temp2 != null) 
						{
						Point p1 = (Point)temp1.getValue();
						Point p2 = (Point)temp2.getValue();
						if(p1.y == p2.y) {
							y.remove(count);
							Point add = new Point(p1.x-p2.x , p1.y);
							R.add(add);
						}
						temp2 = temp2.next;
						count++;
					}temp1 = temp1.next;
				}
					//return ans;
			}
	public static void main(String[] args) {
		for(int i=0 ;i<4;i++) {
		System.out.println("Please choose an action\n "
				+ "----------------------- \n"
				+"1-	Set a polynomial variable\r\n" + 
				"2-	Print the value of a polynomial variable\r\n" + 
				"3-	Add two polynomials\r\n" + 
				"4-	Subtract two polynomials\n"
				+ "5-	Multiply two polynomials\r\n" + 
				"6-	Evaluate a polynomial at some point\r\n" + 
				"7-	Clear a polynomial variable\n"
				+ " ====================================================================");
	
	Scanner input = new Scanner(System.in);
	int respond = input.nextInt();
	switch (respond) {
	case 1:
		System.out.println("Insert the variable name: A, B or C");
		String poly = input.next();
		if(poly.equals("A") || poly.equals("B") || poly.equals("C")) {
			System.out.println("Insert the polynomial terms in the form:\r\n" + 
					"(coeff1, exponent1), (coeff2, exponent2), ..");
			Scanner o = new Scanner(System.in);
			String term = new String();
			term=		o.nextLine();
			//term.replaceAll("\\D","");
			String []test = term.split(" ");
			term=String.join("", test);
			//System.out.println(term);
			String [] Term = term.split(",");
			int[][] terms=new int[2][Term.length/2];
			int count = 0;
			for (String f : Term) {
				if(f.charAt(0)=='(') {
					terms[0][count]=Integer.parseInt(f.substring(1));
					//System.out.println(terms[0][count]);
					
				}
				else if(f.charAt(f.length()-1)==')') {
					terms[1][count]=Integer.parseInt(f.substring(0, f.length()-1));
					//System.out.println(terms[1][count]);
					count++;
				}
				else {
					System.out.println("Error :( ");
				}
				
				
				
			}
			setPolynomial(poly.charAt(0),terms);	
		}
		else {
			System.out.println("Error :( ");
		}
		break;
	case 2 :
		System.out.println("Insert the variable name: A, B, C or R");
		Scanner w = new Scanner(System.in);
		String ans = w.next();
		if(ans.equals("A") || ans.equals("B") || ans.equals("C")||ans.equals("R")) {
			print(ans.charAt(0));
		}
		else {
			System.out.println("Error :(");
		}
		break;
	case 7:
		System.out.println("Insert the variable name: A, B, C or R");
		Scanner m = new Scanner(System.in);
		String ans2 = m.next();
		if(ans2.equals("A") || ans2.equals("B") || ans2.equals("C")||ans2.equals("R")) {
			clearPolynomial(ans2.charAt(0));
		}
		else {
			System.out.println("Error :(");
		}
		break;
	case 6:
		System.out.println("Insert the variable name: A, B, C ");
		Scanner q = new Scanner(System.in);
		String ans3 = q.next();
		if(ans3.equals("A") || ans3.equals("B") || ans3.equals("C")) {
			System.out.println("Enter the value to evaluate : ");
			a=(float)q.nextInt();
			float rrr=evaluatePolynomial(ans3.charAt(0),a);
			System.out.println("Value after evaluating = "+rrr);
			
		}
		else {
			System.out.println("Error :(");
		}
		break;
	case 3:
		System.out.println("Insert the First variable name: A, B, C ");
		Scanner mm = new Scanner(System.in);
		String ans4 = mm.next();
		if(ans4.equals("A") || ans4.equals("B") || ans4.equals("C")) {
			System.out.println("Insert the Second variable name: A, B, C ");
			Scanner mmm = new Scanner(System.in);
			String ans5 = mmm.next();
			if(ans5.equals("A") || ans5.equals("B") || ans5.equals("C")) {
				switch(ans4.charAt(0)) {
				case 'A':
					switch(ans5.charAt(0)) {
					case'A':
						add(A, A);
						break;
					case'B' :
						add(A, B);
						break;
					case 'C':
						add(A, C);
						break;
					}
					break;
				case 'B':
					switch(ans5.charAt(0)) {
					case'A':
						add(B, A);
						break;
					case'B' :
						add(B, B);
						break;
					case 'C':
						add(B, C);
						break;
					}
					break;
				case 'C' :
					switch(ans5.charAt(0)) {
					case'A':
						add(C, A);
						break;
					case'B' :
						add(C, B);
						break;
					case 'C':
						add(C, C);
						break;
					}
					break;
					
				}
				System.out.println(ans4+ " and "+ans5+ " has been added");
			}
			else {
				System.out.println("Error :(");
			}
			
		}
		else {
			System.out.println("Error :(");
		}
		break;
	case 5 :
		System.out.println("Insert the First variable name: A, B, C ");
		Scanner mwm = new Scanner(System.in);
		String ans6 = mwm.next();
		if(ans6.equals("A") || ans6.equals("B") || ans6.equals("C")) {
			System.out.println("Insert the Second variable name: A, B, C ");
			Scanner mmmw = new Scanner(System.in);
			String ans7 = mmmw.next();
			if(ans7.equals("A") || ans7.equals("B") || ans7.equals("C")) {
				switch(ans6.charAt(0)) {
				case 'A':
					switch(ans7.charAt(0)) {
					case'A':
						multiply(A, A);
						break;
					case'B' :
						multiply(A, B);
						break;
					case 'C':
						multiply(A, C);
						break;
					}
					break;
				case 'B':
					switch(ans7.charAt(0)) {
					case'A':
						multiply(B, A);
						break;
					case'B' :
						multiply(B, B);
						break;
					case 'C':
						multiply(B, C);
						break;
					}
					break;
				case 'C' :
					switch(ans7.charAt(0)) {
					case'A':
						multiply(C, A);
						break;
					case'B' :
						multiply(C, B);
						break;
					case 'C':
						multiply(C, C);
						break;
					}
					break;
					
				}
				System.out.println(ans6+ " and "+ans7+ " has been multiplied");
			}
			else {
				System.out.println("Error :(");
			}
			
		}
		else {
			System.out.println("Error :(");
		}
		break;
	case 4 :
		System.out.println("Insert the First variable name: A, B, C ");
		Scanner mmz = new Scanner(System.in);
		String ans8 = mmz.next();
		if(ans8.equals("A") || ans8.equals("B") || ans8.equals("C")) {
			System.out.println("Insert the Second variable name: A, B, C ");
			Scanner mmmz = new Scanner(System.in);
			String ans9 = mmmz.next();
			if(ans9.equals("A") || ans9.equals("B") || ans9.equals("C")) {
				switch(ans8.charAt(0)) {
				case 'A':
					switch(ans9.charAt(0)) {
					case'A':
						subtract(A, A);
						break;
					case'B' :
						subtract(A, B);
						break;
					case 'C':
						subtract(A, C);
						break;
					}
					break;
				case 'B':
					switch(ans9.charAt(0)) {
					case'A':
						subtract(B, A);
						break;
					case'B' :
						subtract(B, B);
						break;
					case 'C':
						subtract(B, C);
						break;
					}
					break;
				case 'C' :
					switch(ans9.charAt(0)) {
					case'A':
						subtract(C, A);
						break;
					case'B' :
						subtract(C, B);
						break;
					case 'C':
						subtract(C, C);
						break;
					}
					break;
					
				}
				System.out.println(ans8+ " and "+ans9+ " has been subtracted");
			}
			else {
				System.out.println("Error :(");
			}
			
		}
		else {
			System.out.println("Error :(");
		}
		break;
		
		
		
		
		
	}
	try {
		TimeUnit.SECONDS.sleep(1);
		}catch (InterruptedException e) {}
	
	
		
	}
	
	}	
}
