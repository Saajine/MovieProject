package ics372groupProject1;
/**
 * Works Cited (for the whole project - everything submitted)
 * Object-Oriented Analysis, Design and Implementation: An Integrated Approach by Brahma Dathan, Sarnath Ramnath 
 * @ author John Sniadajewski, Joseph Marden, Saajine Sathappan
 */
import java.io.Serializable;
import java.util.Calendar;
//A class that handles instantiation of tickets
public class TicketFactory implements Serializable{
	private static TicketFactory factory;
	/*
	 * Private constructor for singleton pattern
	 * 
	 */
	private TicketFactory() {
		
	}
	/**
	 * Supports the singleton pattern
	 * 
	 * @return the singleton object
	 */
	public static TicketFactory instance() {
		if (factory == null) {
			factory = new TicketFactory();
		}
		return factory;
	}
	/**
	 * Creates a Ticket object and returns it.
	 * 
	 * @param type
	 *            the type of the ticket
	 * @param show
	 *            the show the ticket is for
	 * @param date
	 *            the date of the show
	 * @param customerID
	 *            the ID of the customer purchasing the ticket
	 * @param creditCardNumber
	 * 			  the credit card number used to purchase the ticket
	 * @return the item that was created
	 */
	public Ticket createTicket(Show show, Calendar date, String customerID, String creditCardNumber, int type) {
		Ticket ticket;
		
		switch(type) {
			case Theater.REGULAR_TICKET:
				ticket = new RegularTicket(show, date, creditCardNumber, customerID);
				return ticket;
			case Theater.ADVANCE_TICKET:
				ticket = new AdvanceTicket(show, date, creditCardNumber, customerID);
				return ticket;
			case Theater.STUDENT_TICKET:
				ticket = new StudentTicket(show, date, creditCardNumber, customerID);
				return ticket;
			default:
				return null;
		}
	}
	
	
}
