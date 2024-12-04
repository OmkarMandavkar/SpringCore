package com.NoUniqueBeanDef;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Thumbbad implements Movie {

	public void story() {
		System.out.println("Movie Description... Thumbbad");
	}

}
