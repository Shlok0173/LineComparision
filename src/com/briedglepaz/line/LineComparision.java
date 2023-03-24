package com.briedglepaz.line;

import java.util.Scanner;

public class LineComparision {
        
	   public static void main(String args[]) {
		   Scanner sc=new Scanner(System.in);
		   double x1,x2,y1,y2;
		   int line1,line2;
		   
		   System.out.println("Enter x1 & y1 values of first point");
		   x1=sc.nextDouble();
		   y1=sc.nextDouble();
		   
		   System.out.println("Enter x2 & y2 value of second point");
		   x2=sc.nextDouble();
		   y2=sc.nextDouble();
		   
		   
		   line1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		   System.out.println("Distance of the first line="+line1);
	   }
}
