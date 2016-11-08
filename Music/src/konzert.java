import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class konzert {
	
	
	private ArrayList<ticket> tickets = new ArrayList<ticket>();
	private String name;
	private Date datum;
	private Time time;
	
	public konzert(String n, Date d, Time t) {
		this.name =n;
		this.datum = d;
		this.time = t;
		}
	
	public String getName(){
		return name;
	}
	
	public Date getDatum(){
		return datum;
	}
	
	public Time getTime(){
		return time;
	}
	
	public ArrayList<ticket> getTickets(){
		return tickets;
	}
	
	public void setTickets(String i, int s, String r){
		ticket ticket = new ticket(i, s, r);
		tickets.add(ticket);
	}
	
	
	

}
