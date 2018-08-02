public class ZuoYe2{
	public static void main(String[]args){
	
	int k=sum(17);
	System.out.println(k);
	
	int ge=g(100);
	System.out.println(ge);

	int i=g1(22);
	System.out.println(i);

	}

	//2.计算从1到某个数以内所有能被3或者17整除的数的和。
	public static int sum (int x){

		int he=0;
		for(int i=1;i<=x;i++){
			if(i%3==0||i%17==0){
				he=he+i;
			}
		}
			return he;
	}

	//3.计算1到某个数以内能被7或者3整除但不能同时被这两者整除的数的个数。
	public static int g(int x){
		int count=0;
		for(int i=1;i<=x;i++){
			if((i%3==0||i%7==0)&&i%21!=0){
				count+=1;
			}
		}
				return count;
	}
	//4.计算1到某个数以内能被7整除但不是偶数的数的个数。
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