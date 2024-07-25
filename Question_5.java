import java.util.*;

public class Question_5 {
	    static boolean isprime(int num){
	        int count=1;
	        for(int i=2;i<=num;i++){
	            if(num%i==0){
	                count++;
	            }
	        }
	        if(count==2){
	            return true;
	        }
	        else{
	            return false;
	        }
	       
	    }

	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        int arr1[]=new int[n];
	        int j=0;
	        for(int i=0;i<n;i++){
	            if(isprime(arr[i])){
	                arr1[j]=arr[i];
	               j++;
	            }
	        }    
	        int sum=0;
	        int small=arr1[0];
	        for(int i=0;i<arr1.length;i++){
	          if(arr1[i]!=0)
	              if(arr1[i]<small){
	              small=arr1[i];
	          }
	        }
	        for(int i=0;i<n;i++){
	            sum+=arr1[i];
	        }
	        System.out.println((sum-small));
	        }
	}



