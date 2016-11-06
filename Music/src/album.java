
public class album {
	private String title;
	private long id;
	private int recNummer;
	private song s;
	private interpreter inter;
	
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
	
	public song getSong(){
		return s;
	}
	
	public interpreter getInterpreter(){
		return inter;
	}

}
