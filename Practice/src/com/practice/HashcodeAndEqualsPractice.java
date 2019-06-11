package com.practice;

public class HashcodeAndEqualsPractice {

	public static void main(String[] args) {
		
		Bike cbr = new Bike("Honda","cbr250","Racing");
		Bike duke = new Bike("KTM","Duke250","Nacked");
		Bike ktm = new Bike("KTM","Duke250","Nacked");
		
		System.out.println("Hashcode of cbr:"+ cbr.hashCode());
		System.out.println("Hashcode of duke:"+ duke.hashCode());
		System.out.println("Hashcode of ktm:"+ ktm.hashCode());
		System.out.println("ktm.equals(duke):"+ktm.equals(duke));
		System.out.println("cbr.equals(duke):"+ktm.equals(duke));
	}

}
