package com.briedglepaz.line;

import java.util.Scanner;

public class LineComparision {
        
	public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 double x1,x2,y1,y2,x3,x4,y3,y4;
	 int line1,line2;
	 
	 // for first line
	 System.out.println("Enter the x1 &y1 value of first point");
	 x1=sc.nextDouble();
	 y1=sc.nextDouble();
	 
	 System.out.println("Enter x2 & y2 values of second point");
	 x2=sc.nextDouble();
	 y2=sc.nextDouble();
	 
	 line1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	 System.out.println("Distancee of the first line ="+line1);
	 
	 // for second line
	 System.out.println("Enter x3 & y3 values of third point");
	 x3=sc.nextDouble();
	 y3=sc.nextDouble();
	 
	 System.out.println("Enter x4 & y4 values of fourth point");
	 x4=sc.nextDouble();
	 y4=sc.nextDouble();
	 
	 line2=(int)Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y3-y3));
	 System.out.println("Distance of second line ="+line2);
	 
	 String str1=Double.toString(line1);
	 String str2=Double.toString(line2);
	 
	 int check=str1.compareTo(str2);
	 if(check ==0) {
		 System.out.println("Both the line are equal");
	 }else if(check>0) {
		 System.out.println("Line 2 less than line 1");
	 }else {
		 System.out.println("Line 2 greater than line1");
	 }
		 
}
}
