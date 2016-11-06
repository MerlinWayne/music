
public class album {
	private String title;
	private long id;
	private int recNummer;
	
	public album(String t, long i, int rn){
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
	
	public int getRecNummer(String title){
		return recNummer;
	}

}
