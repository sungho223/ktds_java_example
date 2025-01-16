package first_java_program;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) // 5 4 3 2 1
		{
			
			for(int j=1; j<=n; j++) // 1 2 3 4 5
			{
				if(j>=i) System.out.print("*");
				else System.out.print(" ");
			}
		}
	}
}
