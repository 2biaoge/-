public class LianXi5{
	public static void main(String[]args){
		out:for(int a =1;a<=5;a++){

			for(int b=1;b<5;b++){
				if(b==3){
					break out;//ֱ��������ִ�����a++
				}

				System.out.println(a+" "+b);
			}
			
		}
	}
}