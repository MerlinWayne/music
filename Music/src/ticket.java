
public class ticket {
	
	private String id;
	private int seat;
	private String row;
	
	public ticket(String i, int s, String r){
		this.id = i;
		this.seat = s;
		this.row = r;
	}
	
	public String getId(){
		return id;
	}
	
	public int getSeat(){
		return seat;
	}
	
	public String getRow(){
		return row;
	}
	

}
