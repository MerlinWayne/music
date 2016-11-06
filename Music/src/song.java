import java.util.Date;

public class song {
	
	private Date datum;
	private double spieldauer;
	private String musiker;
	
	public song(Date d, double sd, String m){
		this.datum = d;
		this.spieldauer = sd;
		this.musiker = m;
	}
	
	public Date getDatum(){
		return datum;
	}
	
	public double getSpieldauer(){
		return spieldauer;
	}
	
	public String getMusiker(){
		return musiker;
	}

}
