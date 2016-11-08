import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class tournee {
	
	private String name;
	private ArrayList<konzert> konzerte = new ArrayList<konzert>();
	private interpreter inter;
	
	public tournee (String n){
		this.name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<konzert> getKonzerte(){
		return konzerte;
	}
	
	public void setKonzerte(konzert k){
		konzerte.add(k);
	}
	
	public interpreter getInterpreter(){
		return inter;
	}
}
