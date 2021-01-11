import java.io.*;
import java.util.*;
public class ProgrammingTest_Pattern{
	public static void main(String arr[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=n;j>i;j--)
				System.out.print(j+" ");
			for(int k=i;k>=1;k--)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}