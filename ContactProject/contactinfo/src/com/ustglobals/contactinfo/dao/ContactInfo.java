package com.ustglobals.contactinfo.dao;

import java.util.List;

import com.ustglobals.contactinfo.dto.ContactsBean;


public interface ContactInfo {

	public List<ContactsBean> getAllContactData();

	public ContactsBean searchContact(String name);
	public int addContact(ContactsBean bean);
	public int deleteContact(ContactsBean bean);
	public int editContact(ContactsBean bean);

}
