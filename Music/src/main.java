import java.util.Date;

public class main {
	
	public static void main(String args[]){
		Date date = new Date();
//		group A7X = new group("A7X", date, 6);
		album Revolver = new album("Revolver", 0777464412, "C20777464412");
		Revolver.setSong("Taxman", date, 4.5, "Harrison");
//		konzert konzert = new konzert("Elton John", date, null);
//		tournee t = new tournee("t");
//		t.setKonzerte(konzert);
		ticket ticket = new ticket("RM883", 245, "GD");
//		konzert.setTickets(ticket);
		
		
//		System.out.println(A7X.getName());
		System.out.println(Revolver.getSong());
		
	}

}
