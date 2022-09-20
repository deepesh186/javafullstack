package com.yash.oops;


/**
 * @author deepesh.a
 * class is created to show encapsulation and polymorphism
 *
 */
public class JavaTrng {
	int noOfTrainee;//number of trainee
	static int duration=30;//time span for taining
	String trainingName;//name of the training
	
	//empty constructor to intilize the object
	JavaTrng()
	{
		System.out.println("empty construtor called");
	}
	//construtor overloading
	JavaTrng(int noOfTrainee)
	{
		System.out.println("no of traine are"+noOfTrainee);
	}
	
	//method is used to display training details
	public void useTrng()
	{
		System.out.println("java full stack training");
	}
	//method overloading with respect to get number of trainee and time duration
	public void useTrng(int noOfTrainee,int duration )
	{
		System.out.println("java trng"+noOfTrainee+"duration of training"+duration);
	}
	//keyboard method is used to display keyboard usage
	public void useKeyboard()
	{
		System.out.println("keyboard method is invoked");
		
	}
	//keyboard method is used to display number of trainee use keyboard in desktop
	public	void useKeyboard(int noOfTrainee)
		{
			System.out.println("keyboard method is invoked"+noOfTrainee);
			
		}
	//method is used to give information about class room
	public void useClassRoom()
	{
		System.out.println("useClassRoom method  is invoked");
	}
	//method overloading with respect to get number of trainee and time duration use classroom for taining
		public void useClassRoom(int noOfTrainee,int duration )
		{
			System.out.println("tainee use class room are  "+noOfTrainee+" "+"duration in days use class room are  "+" "+duration);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTrng trn=new JavaTrng();//Object is creating for class all methods
		trn.useTrng();
		trn.useTrng(25, duration);
		trn.useClassRoom();
		trn.useClassRoom(30, duration);
		
		trn.useKeyboard();
		trn.useKeyboard(40);
		

	}

}
