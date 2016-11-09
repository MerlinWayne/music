import java.util.ArrayList;
import java.util.Date;

public class musician {
	
	String name;
	String vorname;
	Date gebDatum;
	private ArrayList<song> songList = new ArrayList<song>();
	
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
	
	public void setSong(song song){
		songList.add(song);		
	}
	
	public ArrayList<song> getSong(){
		return songList;
	}

}
