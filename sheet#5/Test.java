package eg.edu.alexu.csd.datastructure.queue;

import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
		 while(true) {
			 System.out.println("choose your option:\n"+"====================\n"+"1-Array based Queue\n"
		 +"2-Linked List based Queue\n"+"3-Exit");
			Scanner sc =  new Scanner(System.in);
			int x = sc.nextInt();
			if(x==3) {
				System.out.println("good bye\n"+"===================");
				break;
			}
			else if(x==1) {
				System.out.print("Array Based Trial\n"+
						"===============\n"+"Enter the size:");
				Scanner c =  new Scanner(System.in);
				int siz = c.nextInt();
				IArrayBased a = new IArrayBased(siz);
				while(true) {
				System.out.println("choose your option:\n"+"====================\n"
				+"1-Enqueue\n" +"2-Dequeue\n"+"3-Get size\n"+"4-Is Empty\n"+"5-exit");
				Scanner ccc =  new Scanner(System.in);
				int ans = ccc.nextInt();
				if(ans==5) { break;}
				switch(ans) {
				case 1:
					System.out.print("Enter the value os the element:");
					Scanner cccc =  new Scanner(System.in);
					String val = cccc.nextLine();
					a.enqueue(val);
					System.out.println(val+"is added to the queue");
					break;
				case 2:
					System.out.println(a.dequeue()+"is removed to the queue");
					break;
				case 3:
					System.out.println(a.size()+"is the size the queue");
					break;
				case 4:
					boolean w = a.isEmpty();
					if(w) {
						System.out.println("Queue is empty");
					}
					else {
						System.out.println("Queue is not empty");
					}
					break;
					
					
				}
				}
			}
			else if(x==2) {
				System.out.print("Linked list Based Trial\n"+
						"===============\n");
				ILinkedBased b = new ILinkedBased();
				while(true) {
				System.out.println("choose your option:\n"+"====================\n"
				+"1-Enqueue\n" +"2-Dequeue\n"+"3-Get size\n"+"4-Is Empty\n"+"5-exit");
				Scanner ccc =  new Scanner(System.in);
				int ans = ccc.nextInt();
				if(ans==5) { break;}
				switch(ans) {
				case 1:
					System.out.print("Enter the value os the element:");
					Scanner cccc =  new Scanner(System.in);
					String val = cccc.nextLine();
					b.enqueue(val);
					System.out.println(val+"is added to the queue");
					break;
				case 2:
					System.out.println(b.dequeue()+"is removed to the queue");
					break;
				case 3:
					System.out.println(b.size()+"is the size the queue");
					break;
				case 4:
					boolean w = b.isEmpty();
					if(w) {
						System.out.println("Queue is empty");
					}
					else {
						System.out.println("Queue is not empty");
					}
					break;
					
					
				}
				
			}
			}
			else {
				throw new IllegalStateException("Invalid input");
			}
			
		 }
		 
	        
	        
	            }
	   
	   
	}
