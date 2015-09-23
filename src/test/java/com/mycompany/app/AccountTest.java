package com.mycompany.app;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

	public void testAccount (){
		
		 Account account = new Account(2);
		 assertEquals(2, account.getSaldo());
		 
	}
}
