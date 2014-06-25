package src.main.java.generics.queue;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.junit.Test;

import src.main.java.generics.domain.Account;
import src.main.java.generics.domain.Person;

public class GenericQueueTest {

	private GenericQueue<Person> personQueue = new GenericQueue<Person>(10);
	private GenericQueue<Account>accountQueue = new GenericQueue<Account>(3);
	
	private DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	
	@Test
	public void testPersonQueue() throws ParseException {	
		personQueue.addToQueue(new Person("Paul", "Forde", format.parse("25/11/1975")));
		personQueue.addToQueue(new Person("Eddie", "Mackey",format.parse("16/01/1984")));
		
		assertNotNull(personQueue);	
		assertEquals(2, personQueue.getLength());
		assertEquals(false, personQueue.isEmpty());
		assertEquals("Paul", personQueue.peek().getFirstName());
		
		personQueue.removeFromQueue();
		assertEquals("Eddie", personQueue.peek().getFirstName());
		
	}
	
	@Test
	public void testAccountQueue() {	
		accountQueue.addToQueue(new Account("930350", "12345678", 100.00));
		accountQueue.addToQueue(new Account("930350", "12789678", 1000.00));
		accountQueue.addToQueue(new Account("930350", "12345008", 500.00));
		accountQueue.addToQueue(new Account("930350", "12378978", 400.00));
		
		assertNotNull(accountQueue);
		assertEquals(3, accountQueue.getLength());
		assertEquals("12345678", accountQueue.peek().getAccountNmbr());
		assertEquals(false, accountQueue.isEmpty());
		
		//nice for loop need :-) implement iterable
		for(Account account:accountQueue){
			System.out.println(account.getAccountNmbr());
		}
		
		
		//not as nice
		Iterator<Account> accountsIter = accountQueue.iterator();
		while (accountsIter.hasNext()){
			Account acc = accountsIter.next();
			System.out.println(acc.getAccountNmbr());
			
		}
		
		
	}
	

}
