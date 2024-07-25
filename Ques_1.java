import java.util.*;
public class Ques_1 {
		    public int fixTheFormula(String input1) {
		        List<Integer> digits = new ArrayList<>();
		        List<Character> operators = new ArrayList<>();
		        
		        for (char ch : input1.toCharArray()) {
		            if (ch >= '0' && ch <= '9') {
		                digits.add(ch - '0'); 
		                } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
		                operators.add(ch);
		            }
		        } 
		        int result = digits.get(0);  
		       for (int i = 0; i < operators.size(); i++) {
		            char op = operators.get(i);
		            int nextDigit = digits.get(i + 1);
		            
		            switch (op) {
		                case '+':
		                    result += nextDigit;
		                    break;
		                case '-':
		                    result -= nextDigit;
		                    break;
		                case '*':
		                    result *= nextDigit;
		                    break;
		                case '/':
		                    result /= nextDigit;
		                    break;
		            }
		        }
		        
		        return result;
		    }
		    
		    public static void main(String[] args) {
		    	Scanner sc=new Scanner(System.in);
		    	String s=sc.next();
		        FixTheFormula solution = new FixTheFormula();
		        
		        System.out.println(solution.fixTheFormula(s)); 
		    }
		

	}


