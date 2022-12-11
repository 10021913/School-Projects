import java.util.ArrayList;
import java.util.Collections;


public class QBRunner
{
	public QBRunner()
	{
		// Making new Quarterbacks
		Quarterback q1 = new Quarterback("Tom Brady",21,109.3);
		Quarterback q2 = new Quarterback("Patrick Mahomes",22,109.4);
		Quarterback q3 = new Quarterback("Aaron Rodgers",23,109.2);
		Quarterback q4 = new Quarterback("joe burrow",24,109.1);


		// Comparing the rating and finding the difference
		System.out.println(q1.compareTo(q2));
		System.out.println(q2.compareTo(q3));
		System.out.println(q3.compareTo(q4));


		//Making a list of Quarterbacks
		ArrayList<Quarterback> QBS = new ArrayList<Quarterback>();
		QBS.add(q1);
		QBS.add(q2);
		QBS.add(q3);
		QBS.add(q4);

		// Sorting a collection
		System.out.println(QBS);
		Collections.sort(QBS);
		System.out.println(QBS);



	}

	public static void main(String args[])
	{
		QBRunner app = new QBRunner();
	}

}