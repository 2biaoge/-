package day13task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 1. 输出今天是今年中的第几天，第几周
 * 2. 把当前的时间以 2016年9月5日 18:00:00 的格式输出
 */
public class task1 {
	public static void main(String[] args) {
		//1. 输出今天是今年中的第几天，第几周
		Calendar calendar=Calendar.getInstance();
		int n=calendar.get(Calendar.DAY_OF_YEAR);
		int w=calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println(n);
		System.out.println(w);
		
		//2把当前的时间以 2016年9月5日 18:00:00 的格式输出
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(date));
		
	}
}
