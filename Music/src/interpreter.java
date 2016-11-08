import java.util.ArrayList;
import java.util.Date;

public abstract class interpreter {
	private group g;
	private musician m;
	private ArrayList<album> albums = new ArrayList<album>();
	private ArrayList<song> songs = new ArrayList<>();
	
	public group getGroup(){
		return g;
	}
	
	public musician getMusician(){
		return m;
	}
	
	public ArrayList<album> getAlbums(){
		return albums;
	}
	
	public ArrayList<song> getSongs(){
		return songs;
	}
	
	public void setAlbums(String t, long id, String rn){
		album album = new album(t, id, rn);
		albums.add(album);
	}
	
	public void setSong(String n, Date d, double sd, String m){
		song song = new song(n, d, sd, m);
		songs.add(song);		
	}
	

}
