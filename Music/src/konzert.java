import java.sql.Time;
import java.util.Date;

public class konzert {
	
	
	private ticket[] tickets;
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
	
	public ticket[] getTickets(){
		return tickets;
	}
	
	public void getTicketsList(konzert[] k){
		for(int i = 0; i < k.length; i++){
			System.out.println(k[i]);
		}
	}
	
	
	

}
