package Excercises;

public class Tabele {

	public static void main(String[] args) {
		
		int counter=0;
		
		String[] daysOfWeek= new String[9];
		daysOfWeek[0] = "poniedzia�ek";
		daysOfWeek[1] = "wtorek";
		daysOfWeek[2] = "�roda";
		daysOfWeek[4] = "czwartek";
		daysOfWeek[5] = "pi�tek";
		daysOfWeek[6] = "sobota";
		daysOfWeek[7] = "niedziela";
		daysOfWeek[8] = "�roda";
		
		for(int i=0;i<daysOfWeek.length;i++){
			
			if ("�roda".equals(daysOfWeek[i])){counter++;}
		}
		
		System.out.println(counter);
		
	}

}
