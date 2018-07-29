public class yuxi{
   public static void main(String[]args){
	int a=3;
	int b=4;

	int x;
	x=(a++)/3+(--b)*2-(a--)%6+(b++)*3-(b--);
	int y;
	y=(++b)*2-(a--)%4+(a++)*5-(--b)/2+(--a);
	int z;
	z=(a--)*6+(b++)/3-(--a)*2-(--b)*2+(++a);
	
	
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
	a=3;
	b=4;
	System.out.println(a++/3+--b*2-a--%6+b++*3-b--);
	System.out.println((++b)*2-(a--)%4+(a++)*5-(--b)/2+(--a));
	System.out.println((a--)*6+(b++)/3-(--a)*2-(--b)*2+(++a));
	System.out.println(a);
	System.out.println(b);

	a=3;
	b=4;
	System.out.println(b<=a|(b--)>(--a)|(++b)!=(a++)|(b--)==(a--));
	

   }
}