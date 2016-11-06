
public class tournee {
	
	private String name;
	private konzert[] concerts;
	private interpreter inter;
	
	public tournee (String n){
		this.name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public konzert[] getConserts(){
		return concerts;
	}
	
	public void getConcertsList(konzert[] c){
		for(int i=0; i < c.length; i++){
			System.out.println(c[i]);
		}
	}
	
	public interpreter getInterpreter(){
		return inter;
	}
}
