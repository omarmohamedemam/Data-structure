package eg.edu.alexu.csd.datastructure.stack;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StackTest {
	public static void main(String[] args) {
		Stacks test = new Stacks();
		while(true) {
		System.out.println("Stak Tester\n"+"============================================\n"+"Choose an option:\n"+"1: Push\r\n" + 
				"2: Pop\r\n" + 
				"3: Peek\r\n" + 
				"4: Get size\r\n" + 
				"5: Check if empty\n"+"6:Exit\n"+"============================================");
		Scanner Sc = new Scanner(System.in);
		int ans = Sc.nextInt();
		if(ans==6) {
			System.out.println("Good Bye\n"+"============================");
			break;
		}
		else {
		switch(ans) {
		case 1:
			System.out.println("Enter the element to push:");
			Scanner Ssc = new Scanner(System.in);
			Object x = Ssc.next();
			test.push(x);
			break;
		case 2:
			Object a= test.pop();
			System.out.println("you poped "+a);
			break;
		case 3:
			Object b= test.peek();
			System.out.println("The peek is "+b);
			break;
		case 4:
			int c= test.size();
			System.out.println("The Size is "+c);
			break;
		case 5:
			Boolean d= test.isEmpty();
			if(d) {
				System.out.println("Stack is Empty");
			}
			else {
				System.out.println("Stack isn't Empty");
			}
			break;
		
		}
		
		try {
			TimeUnit.SECONDS.sleep(1);
			}catch (InterruptedException e) {}
		}
		}
		System.out.println("Stack Application:\n"+"==========================\n"+"Enter the Infix Expression:");
		Scanner Sssc = new Scanner(System.in);
		String w = Sssc.nextLine();
		ExpressionEvaluator exp= new ExpressionEvaluator();
		String ans = exp.infixToPostfix(w);
		String[] testt = ans.split(" ");
		ans = String.join("", testt);
		System.out.println("The Postfix is : "+ans);
		int y =exp.evaluate(ans);
		System.out.println("The Evaluting of the Postfix is : "+y);
		
	}
}
