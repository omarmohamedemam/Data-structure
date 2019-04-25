package eg.edu.alexu.csd.datastructure.stack;
import java.io.*; 
import java.util.*;

public class ExpressionEvaluator implements IExpressionEvaluator {
	 static int Prec(char ch) 
	    { 
	        switch (ch) 
	        { 
	        case '+': 
	        case '-': 
	            return 1; 
	       
	        case '*': 
	        case '/': 
	            return 2; 
	       
	        case '^': 
	            return 3; 
	        } 
	        return -1; 
	    } 
	private static boolean isOperator(char c)
	{
	    return c == '+' || c == '-' || c == '*' || c == '/' || c == '^'
	            || c == '(' || c == ')';
	}

	private static boolean isLowerPrecedence(char op1, char op2)
	{
	    switch (op1)
	    {
	        case '+':
	        case '-':
	            return !(op2 == '+' || op2 == '-');

	        case '*':
	        case '/':
	            return op2 == '^' || op2 == '(';

	        case '^':
	            return op2 == '(';

	        case '(':
	            return true;

	        default:
	            return false;
	    }
	}
	public String infixToPostfix(String expression) {
		Stack<Character> stack = new Stack<Character>();
	    StringBuffer postfix = new StringBuffer(expression.length());
	    char c;

	    for (int i = 0; i < expression.length(); i++)
	    {
	        c = expression.charAt(i);

	        if (!isOperator(c))
	        {
	            postfix.append(c);
	        }

	        else
	        {
	            if (c == ')')
	            {

	                while (!stack.isEmpty() && stack.peek() != '(')
	                {
	                    postfix.append(stack.pop());
	                }
	                if (!stack.isEmpty())
	                {
	                    stack.pop();
	                }
	            }

	            else
	            {
	                if (!stack.isEmpty() && !isLowerPrecedence(c, stack.peek()))
	                {
	                    stack.push(c);
	                }
	                else
	                {
	                    while (!stack.isEmpty() && isLowerPrecedence(c, stack.peek()))
	                    {
	                        Character pop = stack.pop();
	                        if (c != '('  )
	                        {
	                        	if(pop!='('){
	                        		  postfix.append(pop);
	                        	}
	                          
	                        } else {
	                          c = pop;
	                        }
	                    }
	                    stack.push(c);
	                }

	            }
	        }
	    }
	    while (!stack.isEmpty()) {
	      postfix.append(stack.pop());
	    }
	    return postfix.toString();
	}
	public int evaluate(String expression) {
        Stack<Integer> stack=new Stack<>(); 
        for(int i=0;i<expression.length();i++) 
        { 
            char c=expression.charAt(i); 
            if(Character.isDigit(c)) 
            stack.push(c - '0'); 
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
              } 
            } 
        } 
        return stack.pop();     
	}
}
