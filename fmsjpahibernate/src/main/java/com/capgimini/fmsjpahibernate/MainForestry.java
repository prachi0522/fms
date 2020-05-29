package com.capgimini.fmsjpahibernate;

import java.util.Scanner;

import com.capgimini.fmsjpahibernate.controller.Contract;
import com.capgimini.fmsjpahibernate.controller.Customer;
import com.capgimini.fmsjpahibernate.controller.Product;

public class MainForestry {// creating a class
	public void main() {
		Scanner sc = new Scanner(System.in);
		try {
			char ch = 'y';
			while (ch == 'y' || ch == 'y') {// check value is true or not
				System.out.println("------------------ FORESTRY MANAGMENT SYSTEM----------------------");
				System.out.println("            HOME");
				System.out.println("Press 1 if you are a contractor");
				System.out.println("Press 2 if you are a customer");
				System.out.println("Press 3 if you are looking for a product");
				int choose = sc.nextInt();

				// create one switch case
				switch (choose) {
				// case 1 for contractor
				case 1:
					Contract c = new Contract();
					c.contractor();
					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);
					break;
				// case 2 for customer
				case 2:
					Customer cu = new Customer();
					cu.customer();
					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);
					break;
				// case 3 for product
				case 3:
					Product p = new Product();
					p.product();
					System.out.println("do u want to countinue(y/n) ");
					ch = sc.next().charAt(0);
					break;
				default:
					System.out.println("Insert valid input 1-3");
					MainForestry m = new MainForestry();
					m.main();
				}// end of of switch case
			} // end of while loop

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Please Enter number");
			MainForestry m1= new MainForestry();
			m1.main();
		}
	}// end of main method

}// end of class
