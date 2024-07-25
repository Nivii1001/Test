import java.util.*;
public class Question_4 {
		    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }            
	        int cl=arr[0];
	        char ch[]=new char[cl];
	        char c='a';
	        for(int i=0;i<n;i++){
	            ch[i]=c;
	            c++;
	        }
	        
	         int arr1[]=new int[n];
	         for(int i=0;i<n;i++){
	             arr1[i]=arr[i];
	         }
	        Arrays.sort(arr1);
	        char ans[]=new char[n];
	        for(int j=0;j<n;j++){
	         for(int i=0;i<n;i++){
	             if(arr1[j]==arr[i]){
	                 ans[i]=ch[j];	             }
	             }
	         }
	         for(int i=0;i<n;i++)
	        {
	            System.out.print(ans[i]+" ");
	        }
	          
	                
	     
	        
	    }
	    
	}

