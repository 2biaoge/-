public class ZuoYe2{
	public static void main(String[]args){
	
	int k=sum(17);
	System.out.println(k);
	
	int ge=g(100);
	System.out.println(ge);

	int i=g1(22);
	System.out.println(i);

	}

	//2.�����1��ĳ�������������ܱ�3����17���������ĺ͡�
	public static int sum (int x){

		int he=0;
		for(int i=1;i<=x;i++){
			if(i%3==0||i%17==0){
				he=he+i;
			}
		}
			return he;
	}

	//3.����1��ĳ���������ܱ�7����3����������ͬʱ�����������������ĸ�����
	public static int g(int x){
		int count=0;
		for(int i=1;i<=x;i++){
			if((i%3==0||i%7==0)&&i%21!=0){
				count+=1;
			}
		}
				return count;
	}
	//4.����1��ĳ���������ܱ�7����������ż�������ĸ�����
	public static int g1(int x){
		int count1=0;
		for(int i=1;i<=x;i++){
			if(i%7==0&&i%2!=0){
				count++;
			}
		}
		return count;
	}
}