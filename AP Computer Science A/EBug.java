import info.gridworld.actor.Bug;
public class EBug extends Bug
{
    private int sideLength;
    private int steps;

 	public EBug()
	{
		steps = 0;
		sideLength = 3;
    }

    public void act()
    {
		while(true){
		if (steps < (sideLength))
		{
			move();
			steps++;
		}
		else
		{
			turn();
			turn();
        }
	}
}
}
