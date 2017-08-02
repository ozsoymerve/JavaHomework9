package com.trello.pointing;

public class Road {

	public static void main(String[] args) {
		
	TrafficSign s1= new TrafficSign(40);
	TrafficSign s2= new TrafficSign(20);
	TrafficSign s3= new TrafficSign(50);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	alterSignValue(s2,35);
	System.out.println("call alterSignValue S2-35");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	alterSignValue(s1,45);
	System.out.println("call alterSignValue S1-45");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	alterSignValue(s1,65);
	System.out.println("call alterSignValue S1-65");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	}
public static void alterSignValue(TrafficSign sign, int signValue){
	sign.setValue(signValue);
}
	
	

}
