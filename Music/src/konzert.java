import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class konzert {
	
	
	private ArrayList<ticket> tickets = new ArrayList<ticket>();
	private String name;
	private Date datum;
	private Time time;
	
	public konzert(String n, Date d, Time t, ArrayList<ticket> tickets) {
		this.name =n;
		this.datum = d;
		this.time = t;
		this.tickets = tickets;  //the amount of tickets does't count, there should be at least one > no exception required!
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
	
	public void setTickets(ticket ticket){
		tickets.add(ticket);
	}
	
	
	

}
