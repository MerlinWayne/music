import java.util.ArrayList;
import java.util.Date;

public class album {
	private String title;
	private long id;
	private String recNummer;
	private ArrayList<song> songList = new ArrayList<song>();
	private interpreter inter;
	
	public album(String t, long i, String rn){
		this.title = t;
		this.id = i;
		this.recNummer = rn;
	}
	
	public String getTitle(){
		return title;
	}
	
	public long getId(String title){
		return id;
	}
	
	public String getRecNummer(){
		return recNummer;
	}
	
	public ArrayList<song> getSong(){
		return songList;
//		System.out.println(song.getName());
	}
	
	public interpreter getInterpreter(){
		return inter;
	}
	
	public void setSong(String n, Date d, double sd, String m){
		song song = new song(n, d, sd, m);
		songList.add(song);		
	}
	
	
}
