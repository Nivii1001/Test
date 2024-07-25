	import java.util.Scanner;

public class Ques_2 {
		public static class Result {
	        String output1;
	        String output2;
	        String output3;

	        public Result(String output1, String output2, String output3) {
	            this.output1 = output1;
	            this.output2 = output2;
	            this.output3 = output3;
	        }

	        
	        public void display() {
	           System.out.println("Output 1:"+output1);
	           System.out.println("Output 2:"+output2);
	           System.out.println("Output 3:"+output3);
	        }
	    }

		 public static Result encodeStrings(String input1, String input2, String input3) {
		        String[] parts1 = splitString(input1);
		        String[] parts2 = splitString(input2);
		        String[] parts3 = splitString(input3);

		        String output1 = parts1[0] + parts2[1] + parts3[2];
		        String output2 = parts1[1] + parts2[2] + parts3[0];
		        String output3 = parts1[2] + parts2[0] + parts3[1];

		        output3 = toggleCase(output3);

		        return new Result(output1, output2, output3);
		    }

		private static String[] splitString(String input) {
	        int len = input.length();
	        int frontLen = len / 3 + (len % 3 == 1 ? 1 : 0);
	        int middleLen = len / 3 + (len % 3 == 2 ? 1 : 0);
	        int endLen = len / 3;

	        String front = input.substring(0, frontLen);
	        String middle = input.substring(frontLen, frontLen + middleLen);
	        String end = input.substring(frontLen + middleLen);

	        return new String[]{front, middle, end};
	    }


		private static String toggleCase(String input) {
	        StringBuilder toggled = new StringBuilder(input.length());
	        for (char c : input.toCharArray()) {
	            if (Character.isLowerCase(c)) {
	                toggled.append(Character.toUpperCase(c));
	            } else if (Character.isUpperCase(c)) {
	                toggled.append(Character.toLowerCase(c));
	            } else {
	                toggled.append(c);
	            }
	        }
	        return toggled.toString();
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String input1 = sc.next();
	        String input2 = sc.next();
	        String input3 = sc.next();

	        Result result = encodeStrings(input1, input2, input3);
	        result.display();

		}

	}


