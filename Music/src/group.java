import java.util.Date;

public class group {
	
	private String name;
	private Date datum;
	private double aktivZeit;	
//	shouldnt the arrow show in the other direction in the picture?
	private musician m;
	
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
	
	public musician getMusician(){
		return m;
	}
	
	public void getMusicians(musician[] mc){
		for(int i=0 ; i < mc.length; i++){
			System.out.println(mc[i]);
		}
	}

}
