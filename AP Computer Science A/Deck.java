import java.util.ArrayList;
public class Deck
{
	private ArrayList<Card> cards;

	public Deck()
	{
		cards = new ArrayList<Card>();

		for (int i = 0; i < 52; i++)
		{
			if (i/13 == 0)
				cards.add(new Card(i % 13 + 1, "Hearts"));
			else if (i/13 == 1)
				cards.add(new Card(i % 13 + 1, "Diamonds"));
			else if (i/13 == 2)
				cards.add(new Card(i % 13 + 1, "Clubs"));
			else if (i/13 == 3)
				cards.add(new Card(i % 13 + 1, "Spades"));
		}


	}
	public Card deal()
	{
		return cards.remove(0);
	}

	public void shuffle()
	{
		for (int i = 0; i < 1000; i++)
			cards.add(cards.remove((int)(Math.random()*cards.size())));
	}

	public String toString()
	{
		String s = " ";
		for (Card c: cards)
			s += c + "\n";
		return s;

	}



}
