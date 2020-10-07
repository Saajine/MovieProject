package ics372groupProject1;
/**
 * Works Cited (for the whole project - everything submitted)
 * Object-Oriented Analysis, Design and Implementation: An Integrated Approach by Brahma Dathan, Sarnath Ramnath 
 * @ author John Sniadajewski, Joseph Marden, Saajine Sathappan
 */
import java.io.Serializable;
import java.util.Calendar;
//The abstract class that all types of tickets will be based on
public abstract class Ticket implements Serializable, Matchable<String>{
	private Show show;
	private Calendar date;
	private static final long serialVersionUID = 1L;
	private String creditCardNum;
	private String customerID;
	private String ticketID;
	private static final String TICKET_STRING = "T";
	private double price;
	
	public Ticket(Show show, Calendar date, String creditCardNum, String customerID) {
		this.show = show;
		this.date = date;
		this.creditCardNum = creditCardNum;
		this.customerID = customerID;
		this.ticketID = TICKET_STRING +  (MemberIdServer.instance()).getId();
	}
	
	/**
	 *	Getters and setters for the appropriate fields
	 */
	public Show getShow() {
		return show;
	}
	public Calendar getDate() {
		return date;
	}
	public String getCreditCardNum() {
		return creditCardNum;
	}
	public String getCustomerID() {
		return customerID;
	}
	public String getTicketID() {
		return ticketID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 *	Getter for type to be defined in subclasses
	 */
	public String getType;
	/**
	 *	Getter for date that formats date for toString
	 */
	public String getDate(Calendar targetDate) {
		  int month = targetDate.get(Calendar.MONTH) + 1;
		    return month + "/" + targetDate.get(Calendar.DATE) + "/" + targetDate.get(Calendar.YEAR);
		  }
	/**
	 * Returns true if and only if the supplied id is the same as the id of the
	 * item.
	 */
	public boolean matches(String ticketID) {
		if(this.ticketID.equals(ticketID))
			return true;
		return false;
	}
	/**
	 * RReturns a string representation of the ticket object
	 */
	public String toString() {
		String output = "";
		output += "Show: " + show.getName() + ", Date: " + getDate(date) + ", Customer ID: " + customerID + ", Credit Card used to Purchase: " + creditCardNum + ", Price: " + price;
		return output;
	}
}
