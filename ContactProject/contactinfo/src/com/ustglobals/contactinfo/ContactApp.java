package com.ustglobals.contactinfo;

import java.util.List;
import java.util.Scanner;

import com.ustglobals.contactinfo.dao.ContactInfo;
import com.ustglobals.contactinfo.dto.ContactsBean;
import com.ustglobals.contactinfo.util.ContactManager;


public class ContactApp {

	public static void main(String[] args) {
		while(true) {
			System.out.println("Press 1 to show all contacts");
			System.out.println("Press 2 to search for contact using name");
			System.out.println("Press 3 to Operate on contact");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:
				ContactInfo dao1 = ContactManager.getConatctIno();
				List<ContactsBean> contacts = dao1.getAllContactData();
				int size = contacts.size();
				if(size > 0)
				{
					for (ContactsBean ContactsBean : contacts) {
						System.out.println("Name   :"+ContactsBean.getName());
						System.out.println("Number :"+ContactsBean.getGroupName());
						System.out.println("group  :"+ContactsBean.getNumber());
						System.out.println("**********************");
					}

				}
				else {
					System.out.println("No contacts found");
				}


				break;
			case 2:

				System.out.println("Enter contact name");
				String name = sc.next();


				ContactInfo dao2 = ContactManager.getConatctIno();
				ContactsBean contact = dao2.searchContact(name);

				System.out.println("Contact details");
				System.out.println(contact.getName());
				System.out.println(contact.getNumber());
				System.out.println(contact.getGroupName());
				System.out.println("*****************");
				while(true)
				{
					System.out.println("Press 1 to call");
					System.out.println("Press 2 to message");
					System.out.println("Press 3 to go back to main");
					Scanner sc1 = new Scanner(System.in);
					int option1 = sc.nextInt();
					if(option1==1) {
						System.out.println("Calling "+contact.getName());
						System.out.println("Press 1 to End call");
						Scanner sc2 = new Scanner(System.in);
						int option2 = sc.nextInt();
						if(option2==1) {
							System.out.println(" Call ended Ending");

						}
					}
					else
						if(option1==2) {
							System.out.println("Enter txt msg");
							String msg = sc.next();
							System.out.println("Messege sent :"+msg);

						}
						else if(option1==3) {
							break;
						}
				}
				break;
			case 3:
				while(true) {
					System.out.println("Press 1 add contact");
					System.out.println("Press 2 to edit contact");
					System.out.println("Press 3 to delet contact");
					System.out.println("Press 4 to go back to main");

					int option1 = sc.nextInt();
					if(option1==1) {
						System.out.println("Enter contact Details");
						System.out.println("Enter name");
						String cname = sc.next();
						System.out.println("Enter number");
						Long contactnum = sc.nextLong();
						System.out.println("Enter group");
						String cgroup = sc.next();

						ContactsBean bean = new ContactsBean();
						bean.setName(cname);
						bean.setNumber(contactnum);
						bean.setGroupName(cgroup);
						ContactInfo dao3 = ContactManager.getConatctIno();
						int result = dao3.addContact(bean);
						if(result>0)
							System.out.println("Added successfully");
						else {
							System.out.println("Not added");
						}


					}

					if(option1==2) {
						System.out.println("Enter contact name to be updated ");
						String cname = sc.next();


						System.out.println("Enter new  group");
						String cgroup = sc.next();


						System.out.println("Enter number");
						Long contactnum = sc.nextLong();


						ContactsBean bean = new ContactsBean();
						bean.setName(cname);
						bean.setNumber(contactnum);
						bean.setGroupName(cgroup);
						ContactInfo dao3 = ContactManager.getConatctIno();
						int result = dao3.editContact(bean);
						if(result>0)
							System.out.println("Edited successfully");
						else {
							System.out.println("Not added");
						}

					}
					if(option1==3) {
						System.out.println("Enter contact name to be deletd ");
						String cname = sc.next();


						ContactsBean bean = new ContactsBean();
						bean.setName(cname);

						ContactInfo dao3 = ContactManager.getConatctIno();
						int result = dao3.deleteContact(bean);
						if(result>0)
							System.out.println("Deleted successfully");
						else {
							System.out.println("Not Deleted");
						}

					}
					else if (option1 == 4)
					{
						break;
					}
				}

				break;

			default:
				break;
			}
		}
	}
}
