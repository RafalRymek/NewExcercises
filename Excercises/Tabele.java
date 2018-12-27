package Excercises;

public class Tabele {

	public static void main(String[] args) {
		
		int counter=0;
		
		String[] daysOfWeek= new String[9];
		daysOfWeek[0] = "poniedzia³ek";
		daysOfWeek[1] = "wtorek";
		daysOfWeek[2] = "œroda";
		daysOfWeek[4] = "czwartek";
		daysOfWeek[5] = "pi¹tek";
		daysOfWeek[6] = "sobota";
		daysOfWeek[7] = "niedziela";
		daysOfWeek[8] = "œroda";
		
		for(int i=0;i<daysOfWeek.length;i++){
			
			if ("œroda".equals(daysOfWeek[i])){counter++;}
		}
		
		System.out.println(counter);
		
	}

}
