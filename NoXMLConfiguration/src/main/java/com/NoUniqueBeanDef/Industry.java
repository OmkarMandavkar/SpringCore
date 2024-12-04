package com.NoUniqueBeanDef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Industry {

	// VARIBLE OR FIELD INJECTION
//	@Autowired
//	@Qualifier(value = "kantara") 
	Movie movie;

	// SETTER INJECTION
//	@Autowired
//	@Qualifier(value = "kantara") 
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	// CONSTRUCTOR INJECTION
	@Autowired 	
	public Industry(@Qualifier(value = "kantara") Movie movie) {
		this.movie = movie;
	}

	public void budget() {
		System.out.println("Budget invested on movie industry");
		movie.story();
	}
}