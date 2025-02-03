
public class Main
{
	public static void main(String[] args) {
		Pandav arjun= new Pandav("arjun","high");
		Pandav bheem= new Pandav("bheem","medium");
		Kaurav duryodhana= new Kaurav("duryodhana");
		Vikarn vikarn = new Vikarn("vikarn");


		arjun.fight();
		arjun.obey();
		arjun.kind();

		bheem.fight();
		bheem.obey();
		bheem.kind();

		duryodhana.fight();
		duryodhana.disobey();

		vikarn.fight();
		vikarn.obey();
		vikarn.kind();

	}
}
