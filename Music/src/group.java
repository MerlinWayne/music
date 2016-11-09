import java.util.ArrayList;
import java.util.Date;

public class group {
	
	private String name;
	private Date datum;
	private double aktivZeit;	
//	shouldnt the arrow show in the other direction in the picture?
	private ArrayList<musician> musicians = new ArrayList<musician>();
	
	public group(String n, Date d, double az, ArrayList<musician> musician){
		this.name = n;
		this.datum = d;
		this.aktivZeit = az;
		if(musician.size() < 2){
			throw new MyException("sructure harmed !");			
		} else {
			this.musicians = musician;
		}
	}
	
	//best to have an input here to return name
	public String getName(){
		return name;
	}
	
	public Date getDate(){
		return datum;
	}
	
	public double getAktivZeit(){
		return aktivZeit;
	}
	
	public ArrayList<musician> getMusicians(){
		return musicians;
		
	}

}
