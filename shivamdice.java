import java.util.*;
class RollingDice
{
int Dice;
int res;
public RollingDice(int Dice)
{
this.Dice= Dice;
}
public void result()
{
Random rand= new Random();
if(this.Dice==2)
{
int random_2=rand.nextInt(2);
boolean b=(random_2!=0);

System.out.println("Your rolling result is"+b);
}
else
if(Dice==4)
{
int random_4=rand.nextInt(4);
System.out.println("Your rolling result is"+random_4);
}
else
if(Dice==6)
{
int random_6=rand.nextInt(6);
System.out.println("Your rolling result is"+random_6);
}
else
{
System.out.println("Enter another dice");
}
}




public static void main(String[] str)
{
Scanner sc=new Scanner(System.in);
int TypeofDice= sc.nextInt();
RollingDice Rd= new RollingDice(TypeofDice);
Rd.result();
}
}
