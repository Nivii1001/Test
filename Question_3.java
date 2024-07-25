import java.util.*;
public class Question_3{
	static String checklength(int num) {
		String st=String.valueOf(num);
		String c="";
		if(num==0) {
			c+="Z";
		}
		if(st.length()==6) {
			c+="C";
		}
		else {
			c+="W";
		}
		return c;
	}
	static boolean isprime(int num) {
		int count=1;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}
	static String checkPrime(int num) {
		
		String c="";
		if(num==1) {
			c+="O";
			
		}
		else if(isprime(num)) {
			c+="P";
			
		}
		else {
			c+="N";
		}
		return c;
	}
	static int sumOfdig(int num) {
		if(num<10) {
			return num;
		}
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		return sumOfdig(sum);
		
		
	}
	static int EvenOdd(int num) {
		if(num%2==0) {
			return (num/2);
		}
		else {
			return ((num-1)/2);
		}
	}

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       String s="";
       for(int i=0;i<n;i++) {
       
       System.out.println(checklength(arr[i])+checkPrime(arr[i])
       +sumOfdig(arr[i])+EvenOdd(arr[i]));

       }
       
	}

}
