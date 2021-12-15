package com.client;

import java.util.Scanner;

import com.model.Details;
import com.service.Operations;
import com.serviceImpl.Employee;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    Employee o=new Employee();
//	    Details d=new Details();
		
		

	 while(true)
	 {
		System.out.println("****----CHOOSE FROM BELOW OPTIONS----****"); 
		System.out.println("      "+"**SELECT 1 TO CREATE DATA**"+"    ");
		System.out.println("      "+"**SELECT 2 TO RETRIEVE DATA**"+"    ");
		System.out.println("      "+"**SELECT 3 TO UPDATE DATA**"+"    ");
		System.out.println("      "+"**SELECT 4 TO DELETE DATA**"+"    ");
		System.out.println("      "+"**ENTER 5 TO EXIT**"+"    ");
		int z=sc.nextInt();
		
		switch(z)
	 {
		 case 1:o.insertdata();
		 break;
		 
		 case 2:o.retrievedata();
		 break;
		 
		 case 3:o.updatedata();
		 break;
		 
		 case 4:o.deletedata();
		 break;
		 
		 case 5:System.exit(0);
		 break;
		 
		 default:System.out.println("ENTER VALID INPUT");
	 }
		
	 }

		
	}

}
