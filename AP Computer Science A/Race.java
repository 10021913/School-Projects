import java.util.ArrayList;

public class Race
{
	public boolean winner(ArrayList<Racer> racers)
	{
		for(Racer r:racers)
			if(r.getPosition() >= 100)
				return true;
			return false;
	}
	public Race()
	{
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(new Tortise());
		racers.add(new Hare());
		racers.add(new Hare());

		while(!winner(racers))
		{
			for(Racer r : racers)
			{
				System.out.println(r.getClass().getName() + ": ");
				System.out.println(r.getPosition());
			}
		System.out.println();
		}
	}
	public static void main(String args[])
	{
		Race	 app = new Race();
	}
}
