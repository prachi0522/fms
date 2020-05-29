package com.capgimini.fmsjpahibernate.controller;

import java.util.Scanner;

import com.capgimini.fmsjpahibernate.MainForestry;
import com.capgimini.fmsjpahibernate.dao.ContractDAO;
import com.capgimini.fmsjpahibernate.dto.ContractBean;
import com.capgimini.fmsjpahibernate.factory.ContractDAOManagerFactory;
import com.capgimini.fmsjpahibernate.service.ContractService;
import com.capgimini.fmsjpahibernate.validation.ForesteryValidation;

//create one class
public class Contract {
	//create one method
	public void contractor() {
		//Create one ContractDAO Object
		ContractDAO dao=ContractDAOManagerFactory.getContractDAO();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {//create one while loop
			System.out.println("****CONTRACT OPERATONS*****");
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to get all data");
			System.out.println("Enter 4 to Update data");
			System.out.println("Enter 5 to return home");
			String ch6=null;
			char c6 = 'y';
			while(c6=='y') {
				ch6= sc.next();
				if(ForesteryValidation.isNumber(ch6)) {
					c6='n';
				} else {
					System.err.println("Enter numbers only.....");
				}
			} 
			Integer choice = Integer.parseInt(ch6);
			switch (choice) {//create one switch case
			//case 1 for insert contract details
			case 1:
				ContractBean bean1=new ContractBean();

				System.out.println("Add Contract Details of contract");
				System.out.println("-------------------");
				System.out.println("Enter contract id");
				String ch1=null;
				char c1 = 'y';
				while(c1=='y') {
					ch1= sc.next();
					if(ForesteryValidation.isNumber(ch1)) {
						c1='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Long id = Long.parseLong(ch1);

				bean1.setContractid(id);
				boolean again;

				System.out.println("Enter Customer id");
				String ch2=null;
				char c2 = 'y';
				while(c2=='y') {
					ch2= sc.next();
					if(ForesteryValidation.isNumber(ch2)) {
						c2='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Integer id1 = Integer.parseInt(ch2);
				bean1.setCustomerid(id1);


				System.out.println("Enter Haulier id");
				String ch3=null;
				char c3 = 'y';
				while(c3=='y') {
					ch3= sc.next();
					if(ForesteryValidation.isNumber(ch3)) {
						c3='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Integer id2 = Integer.parseInt(ch3);
				bean1.setHaulierid(id2);

				System.out.println("Enter Product id");
				String ch4=null;
				char c4 = 'y';
				while(c4=='y') {
					ch4= sc.next();
					if(ForesteryValidation.isNumber(ch4)) {
						c4='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Integer id4 = Integer.parseInt(ch4);
				bean1.setProductid(id4);

				System.out.println("Enter quantity");
				String quantity=null;
				char q1 = 'y';
				while(q1=='y') {
					quantity= sc.next();
					if(ForesteryValidation.isNumber(quantity)) {
						q1='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				bean1.setQuantity(Integer.parseInt(quantity));
				try {
					System.out.println("Enter Delivery Date  (dd-mm-yyyy).........");
					String date=sc.next();
					bean1.setDeleveryDate(date);
				}

				catch(Exception e){
					System.out.println("Invalid Delivery Date try again........");
					again=false;

				}      

				do {
					System.out.println("Enter Delivery Day like Sunday/Monday.........");
					String deliveryday=sc.next();
					if(deliveryday.matches("Sunday||Monday||Tuesday||Wednesday||Thursday||Friday||Saturday")){
						bean1.setDeleveryDay(deliveryday);
						again=true;
					}

					else{
						System.out.println("Invalid Delivery day try again........");
						again=false;

					}      
				}while(!again);

				boolean check=dao.addContract(bean1);
				if(check) {
					System.out.println("contract details added to the list");
				}
				else
				{
					System.out.println("contractno is repeated");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
				//case 1 for delete the contract details
			case 2:
				System.out.println("Enter Contract id to delete..........");

				String ch8=null;
				char c8 = 'y';
				while(c8=='y') {
					ch8= sc.next();
					if(ForesteryValidation.isNumber(ch8)) {
						c8='n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer id8= Integer.parseInt(ch8);

				if (dao.deleteContract(id8)) {
					System.out.println("given Contract id details has been deleted");
				} else {
					System.out.println("sorry....Unable to delete. Contract id is not present in the list");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch = sc.next().charAt(0);

				break;
				//case 3 for get all details of contract 
			case 3:
				System.out.println(dao.getAllContracts());

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 4:

				ContractService service=ContractDAOManagerFactory.instanceOfContactServiceImpl();
				ContractBean bean2 = new ContractBean();
				System.out.println("Enter Contract Id for Update.........");
				String ch7=null;
				char c7 = 'y';
				while(c7=='y') {
					ch7= sc.next();
					if(ForesteryValidation.isNumber(ch7)) {
						c7='n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer id3= Integer.parseInt(ch7);

				bean2.setContractid(id3);
				System.out.println("Enter Product id");
				String ch9=null;
				char c9 = 'y';
				while(c9=='y') {
					ch9= sc.next();
					if(ForesteryValidation.isNumber(ch9)) {
						c9='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Integer id9 = Integer.parseInt(ch9);
				bean2.setProductid(id9);
				if(service.modifyContract(id3)) {

					System.out.println("Contract details updated successfully....");
				}
				else {
					System.out.println("Unable to update the Contract details...!!! Contract id doesnot match");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;

			case 5:
				MainForestry m=new MainForestry();
				m.main();
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			default:
				Contract c= new Contract();
				c.contractor();
			}

		}//end of while loop
	}//end of method contractor()

}//end of class
