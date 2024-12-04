package com.NoUniqueBeanDef;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Kantara implements Movie {

	public void story() {
		System.out.println("Movie Description... Kantara");
	}

}
