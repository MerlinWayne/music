
public class ticket {
	
	private long id;
	private int seat;
	private int row;
	
	public ticket(long i, int s, int r){
		this.id = i;
		this.seat = s;
		this.row = r;
	}
	
	public long getId(){
		return id;
	}
	
	public int getSeat(){
		return seat;
	}
	
	public int getRow(){
		return row;
	}
	

}
