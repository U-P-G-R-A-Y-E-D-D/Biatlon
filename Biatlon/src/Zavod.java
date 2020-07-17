import java.util.ArrayList;
import java.util.Random;

public class Zavod {

	public ArrayList<Zavodnik> zavodnici = new ArrayList<>();



	public Zavodnik zavodnik1;
	public Zavodnik zavodnik2;
	public Zavodnik zavodnik3;
	public Zavodnik zavodnik4;
	public Zavodnik zavodnik5;
	public Zavodnik zavodnik6;
	public Zavodnik zavodnik7;
	public Zavodnik zavodnik8;
	public Zavodnik zavodnik9;
	public Zavodnik zavodnik10;


	public void load(){
		zavodnik1 = new Zavodnik();
		zavodnik1.ID = 1;
		zavodnici.add(zavodnik1);

		zavodnik2 = new Zavodnik();
		zavodnik2.ID = 2;
		zavodnici.add(zavodnik2);

		zavodnik3 = new Zavodnik();
		zavodnik3.ID = 3;
		zavodnici.add(zavodnik3);

		zavodnik4 = new Zavodnik();
		zavodnik4.ID = 4;
		zavodnici.add(zavodnik4);

		zavodnik5 = new Zavodnik();
		zavodnik5.ID = 5;
		zavodnici.add(zavodnik5);

		zavodnik6 = new Zavodnik();
		zavodnik6.ID = 6;
		zavodnici.add(zavodnik6);

		zavodnik7 = new Zavodnik();
		zavodnik7.ID = 7;
		zavodnici.add(zavodnik7);


		zavodnik8 = new Zavodnik();
		zavodnik8.ID = 8;
		zavodnici.add(zavodnik8);

		zavodnik9 = new Zavodnik();
		zavodnik9.ID = 9;
		zavodnici.add(zavodnik9);

		zavodnik10 = new Zavodnik();
		zavodnik10.ID = 10;
		zavodnici.add(zavodnik10);

	}


	public void Usek(){
		for (int i = 0; i< zavodnici.size(); i++){
			int cas = random(5, 10);
			zavodnici.get(i).Usek.add(cas);
			zavodnici.get(i).TIME += cas;

		}
	}

	public void Strelba(){
		for (int i = 0; i < zavodnici.size(); i++){
			int strelbaNaTerc = random(0, 5);
			zavodnici.get(i).Terc.add(strelbaNaTerc);
			zavodnici.get(i).TIME += (5-strelbaNaTerc);
		}
		SortByTime();
	}

	public void SortByTime(){
		for (int i = 0; i < zavodnici.size(); i++) {
			for (int j = 0; j < zavodnici.size()-1; j++) {
				if(zavodnici.get(j).TIME > zavodnici.get(j+1).TIME){
					Zavodnik tmp = zavodnici.get(j);
					zavodnici.set(j, zavodnici.get(j+1));
					zavodnici.set((j+1), tmp);
				}
			}
		}
	}



	private int random(int min, int max){
		Random random = new Random();
		return random.nextInt(max - min)+min;
	}


}
