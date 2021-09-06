import java.util.*;
class time{
	int hr,min,sec;
	time(){
		hr=0;
		min=0;
		sec=0;
	}//Default Constructor
	time(int hr,int min, int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	void displayTime()
	{
		System.out.println("The Time is "+hr+ ":"+min+" :"+sec);
	}
	time addTime(time q)
	{
		this.sec +=q.sec;
		this.min +=q.min;
		this.hr +=q.hr;
		
		if(this.sec >= 60)
		{
			this.min +=this.sec /60;
			this.sec=this.sec % 60;
		}
		if(this.min >=60)
		{
			this.hr +=this.min / 60;
			this.min=this.min % 60;
		}
		return this;
	}
}
class TimeAdd{
	public static void main(String[] args) {
		time t1=new time(5,18,20);
		time t2=new time(3,23,23);
		t1.displayTime();
		t2.displayTime();
		t1.addTime(t2);
		t1.displayTime();

	}
}