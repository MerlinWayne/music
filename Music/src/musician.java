import java.util.Date;

public class musician {
	
	String name;
	String vorname;
	Date gebDatum;
	
	public musician(String n, String v, Date gd){
		
		this.name = n;
		this.vorname = v;
		this.gebDatum = gd;
	}
	
	
	
	public String getName(){
		return name;
	}
	
	public String getVorname(String name){
		return vorname;
	}
	
	public Date getGebDatum(String name){
		return gebDatum;
	}

}
