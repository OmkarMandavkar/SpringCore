package com.object;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value(value = "3000")
	int cc;

	public void start() {
		System.out.println("Engine cc: " + cc);
	}
}
