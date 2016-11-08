import java.util.ArrayList;
import java.util.Date;

public class group {
	
	private String name;
	private Date datum;
	private double aktivZeit;	
//	shouldnt the arrow show in the other direction in the picture?
	private ArrayList<musician> musicians = new ArrayList<musician>();
	
	public group(String n, Date d, double az){
		this.name = n;
		this.datum = d;
		this.aktivZeit = az;
	}
	
	//best to have an input here to return name
	public String getName(){
		return name;
	}
	
	public Date getDate(String name){
		return datum;
	}
	
	public double getAktivZeit(String name){
		return aktivZeit;
	}
	
	public void setMusicians(String n, String v, Date gd){
		musician musician = new musician(n, v, gd);
		musicians.add(musician);
	}
	
	public ArrayList<musician> getMusicians(){
		return musicians;
		
	}

}
