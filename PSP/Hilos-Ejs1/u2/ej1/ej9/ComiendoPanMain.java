package u2.ej1.ej9;

public class ComiendoPanMain {

	public static void main(String[] args) {

		String[] nombres = { "Papá pitufo", "Pitufina", "Filósofo", "Pintor", "Gruñón", "Bromista", "Dormilón",
				"Tímido", "Tontín", "Bonachón", "Romántico" };

		for (String leer : nombres) {
			Pitufos p = new Pitufos(leer);
			p.start();
		}
	}
}