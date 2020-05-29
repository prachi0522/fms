package com.capgimini.fmsjpahibernate.controller;

import java.util.Scanner;

import com.capgimini.fmsjpahibernate.AdminPage;
import com.capgimini.fmsjpahibernate.MainForestry;
import com.capgimini.fmsjpahibernate.dao.ProductDAO;
import com.capgimini.fmsjpahibernate.dto.ProductBean;
import com.capgimini.fmsjpahibernate.factory.ProductDAOManagerFactory;
import com.capgimini.fmsjpahibernate.service.ProductService;
import com.capgimini.fmsjpahibernate.validation.ForesteryValidation;

public class Product {//create one class
	public void product(){//create one method
		
		ProductBean bean=new ProductBean(); //create one ProductBean object
		ProductDAO dao=ProductDAOManagerFactory.getProductDAO();//create one ProductDAO object
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {//check if the condition true enter the while loop
			System.out.println("****PRODUCT OPERATONS****");
			System.out.println("--------------");
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to get all data");
			System.out.println("Enter 4 to update the data");
			System.out.println("Enter 5 to return home");
			System.out.println("Enter 6 to Logout");
			String ch9=null;
			char c9 = 'y';
			while(c9=='y') {
				ch9= sc.next();
				if(ForesteryValidation.isNumber(ch9)) {
					c9='n';
				} else {
					System.err.println("enter only numbers");
				}
			} 
			Integer choice = Integer.parseInt(ch9);

			switch (choice) {//create one switch case
			//switch case for addition of a product
			case 1:
				ProductBean bean1=new ProductBean();//create  one ProductBean object

				boolean again;
				
				System.out.println("Add Details of product");
				System.out.println("-------------------");
				System.out.println("Enter product id");
				String id=null;
				char c1='y';
				while(c1=='y') {
					id= sc.next();
					if(ForesteryValidation.isNumber(id)) {
						c1='n';
					} else {
						System.err.println("enter only numbers");
					}
				}

				bean1.setProductid(Integer.parseInt(id));

				System.out.println("Enter product name");
				String name=null;
				char n='y';
				while(n=='y') {
					name= sc.next();
					if(ForesteryValidation.isStringAlphabet(name)) {
						n='n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				
				System.out.println("Enter product Description...");
				String desc=null;
				char n6='y';
				while(n6=='y') {
					desc= sc.next();
					if(ForesteryValidation.isStringAlphabet(desc)) {
						n6='n';
					} else {
						System.err.println("enter only alphabets");
					}
				} 
				
				bean1.setProductname(name);
				bean1.setProductdsc(desc);

				boolean check=dao.addproduct(bean1);
				//check if the product id is not present in the list then add the product details in the list
				if(check) {
					System.out.println("product details added to the list");
				}
				else
				{
					System.out.println("productid is repeated");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);//returns next token as a string
				break;
				//if the product is present in the list then using product id you can delete the product
			case 2:
				
				System.out.println("Enter product id to remove details ");
				String id1=null;
				char c2='y';
				while(c2=='y') {
					System.out.println("Enter product id");
					id1= sc.next();
					if(ForesteryValidation.isNumber(id1)) {
						c2='n';
					} else {
						System.err.println("enter only numbers");
					}
				}
			
				if(dao.deleteproduct(Integer.parseInt(id1))) {

					System.out.println("given productid details has been deleted");
				}
				else {
					System.out.println("sorry....Unable to delete. Product id not present in the list.");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
				//list all the products present in the database
			case 3:

				System.out.println(dao.getAllproducts());

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
				//if the product is present in the list then using product id you can update the product

			case 4:
				ProductService services= ProductDAOManagerFactory.instanceOfProductServiceImpl();
				services.modifyproduct(bean);
				
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;

				//this switch case use to go back to main menu
			case 5:
				MainForestry m=new MainForestry();
				m.main();

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 6:
				AdminPage a=new AdminPage();
				a.main(null);
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;

				//if we choose other then 1-6 then display one message 
			default:
				System.out.println("Your choice should be 1-6");
				Product p=new Product();
				p.product();
				break;

			}//end of switch case


		}//end of while loop
	}//end of product ()

}//end of class
