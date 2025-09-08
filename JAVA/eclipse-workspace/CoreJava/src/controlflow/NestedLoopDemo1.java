package controlflow;

import java.util.Iterator;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :4:08:21 PM  
 * project :CoreJava
*/

public class NestedLoopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i=1;i<=5;i++)     // 1     2     3     4          5 
		{
			for(int j=1;j<=i;j++) //1      1 2   1 2 3  1 2 3 4   1 2 3 4 5
			{
				System.out.print("*"+"\t");
			}
			System.out.println();
		}

	}

}
