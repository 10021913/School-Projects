public class Tortise implements Racer
{
private int pos;
private int speed;



public void move()
{

pos += speed;




}

public Tortise()
{
pos = 0;
speed = ((int)(Math.random()*3))+2;
}

public int getPosition()
{
return pos;
}


public static void main(String args[])
{
Tortise app = new Tortise();
}


}