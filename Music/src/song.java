import java.util.Date;

public class song {
	
	private Date datum;
	private double spieldauer;
	private String musiker;
	private String name;
	
	public song(String n, Date d, double sd, String m){
		this.datum = d;
		this.spieldauer = sd;
		this.musiker = m;
		this.name =n;
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
	
	public String getName(){
		return name;
	}

}
