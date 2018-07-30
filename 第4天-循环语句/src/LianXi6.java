public class LianXi6{
	public static void main(String[]args){
		out:for(int a =1;a<=10;a++){
			for(int b =1;b<=10;b++){
				if(b==5){
					continue out;//Ö´ÐÐÍâ²ãa++
				}
			System.out.println(a+"\t"+b);
			}
		}
	}
}