
public class Main {

	public static void main(String[] args) {
		Zavod zavod = new Zavod();
		zavod.load();

		zavod.Usek();
		System.out.println("První úsek");
		zavod.Strelba();
		System.out.println("První střelba");

		for(int i=0; i < zavod.zavodnici.size(); i++){
			System.out.println("Na " + (i+1) + " pozici je závodník s číslem " + zavod.zavodnici.get(i).ID);
		}

		zavod.Usek();
		System.out.println("\nDruhý úsek");
		zavod.Strelba();
		System.out.println("Druhá střelba\n");

		for(int i=0; i < zavod.zavodnici.size(); i++){
			System.out.println("Na " + (i+1) + " pozici je závodník s číslem " + zavod.zavodnici.get(i).ID);
		}
		
		zavod.Usek();
		System.out.println("\nTřetí úsek");
		//zavod.Strelba();
		//System.out.println("Druhá střelba\n");

		//for(int i=0; i < zavod.zavodnici.size(); i++){
		//	System.out.println("Na " + (i+1) + " pozici je závodník s číslem " + zavod.zavodnici.get(i).ID);
		//}

		System.out.println("----------STATISTIKY ZÁVODNÍKŮ-----------");

		for (int i = 0; i<zavod.zavodnici.size();i++){
			 System.out.println("Na " + (i+1) + " pozici se umístil závodník s číslem " + zavod.zavodnici.get(i).ID);
	            System.out.println("První úsek zajel v čase " + zavod.zavodnici.get(i).Usek.get(0) + " minut.");
	            System.out.println("První střelbu na terč zvládl s počtem " + zavod.zavodnici.get(i).Terc.get(0) + " trefených terčů. (Penalizace: " + (5-zavod.zavodnici.get(i).Terc.get(0)) + " minut)");
	            System.out.println("Druhý úsek zajel v čase " + zavod.zavodnici.get(i).Usek.get(1) + " minut.");
	            System.out.println("Druhou střelbu na terč zvládl s počtem " + zavod.zavodnici.get(i).Terc.get(1) + " trefených terčů.(Penalizace: " + (5-zavod.zavodnici.get(i).Terc.get(1)) + " minut)");
	            System.out.println("Třetí úsek zajel v čase " + zavod.zavodnici.get(i).Usek.get(2) + " minut.");
	            System.out.println("Celý závod zajel v čase " + zavod.zavodnici.get(i).TIME + " minut.");
	            System.out.println("-----------------------");
	        
		}



	}

}
