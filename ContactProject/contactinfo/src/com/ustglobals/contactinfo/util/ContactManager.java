package com.ustglobals.contactinfo.util;

import com.ustglobals.contactinfo.dao.ContactDAOimpl;
import com.ustglobals.contactinfo.dao.ContactInfo;

public class ContactManager {

		
		private ContactManager()
		{
			
		}

		public static ContactInfo getConatctIno()
		{
			return new ContactDAOimpl();
		}
}
