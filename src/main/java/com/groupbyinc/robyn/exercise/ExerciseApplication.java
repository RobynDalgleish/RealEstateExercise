package com.groupbyinc.robyn.exercise;

public class ExerciseApplication {

	public static void main(String[] args) {
        Listing listing1 = new Listing(MlsNumber.of("E999999"), "New Shiny Apartment!");
        Listing listing2 = new Listing(MlsNumber.of("E999999"), "New Shiny Apartment!");
        System.out.println(listing1.equals(listing2));
	}
}
