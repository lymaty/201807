package bao.java.test20180717.copy;

import java.util.*;

public class ClassA implements Course{
	private double S;

	@Override
	public double grade() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		double gradeA=input.nextDouble();
		return gradeA;
	}

	
	

}
