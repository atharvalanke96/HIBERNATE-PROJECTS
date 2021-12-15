package com.client;

import java.util.Scanner;

import com.Impl.Student;
import com.Service.Operations;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Operations o=new Student();
		
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
