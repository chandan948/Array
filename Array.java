import java.util.*;
public class index {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n=s.nextInt();
		int [] x=new int[n];
		System.out.println("enter the first element of array:");
		 x[0]=s.nextInt();
		
		for(int i=0;i<n;i++) {
			//System.out.println("Enter the first value of array: ");
			x[i]=x[0]*(i+1);
			//x[n]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			
			System.out.println("the value of the array: "+x[i]);
		}
	}

}

