package ics372groupProject1;
/**
 * Works Cited (for the whole project - everything submitted)
 * Object-Oriented Analysis, Design and Implementation: An Integrated Approach by Brahma Dathan, Sarnath Ramnath 
 * @ author John Sniadajewski, Joseph Marden, Saajine Sathappan
 */
import java.io.Serializable;
import java.util.Calendar;
//Represents a ticket purchased the day of the show
public class RegularTicket extends Ticket implements Serializable{
	
	/**
	 *	Calls superclasses constructor, then adds the value for price based on the field in
	 *	show
	 */
	public RegularTicket(Show show, Calendar date, String creditCardNum, String customerID) {
		super(show, date, creditCardNum, customerID);
		this.setPrice(show.getTicketPrice());
	}
	
	/**
	 * Returns the type of the ticket
	 */
	public int getType() {
		return Theater.REGULAR_TICKET;
	}
	/**
	 * Returns the super toString and adds a reprentation of the type to it
	 */
	public String toString() {
		String output = super.toString() + ", Type: Regular\n";
		return output;
	}
	
	
}
