package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	Processor prosob;

	public Processor getProsob() {
		return prosob;
	}

	public void setProsob(Processor prosob) {
		this.prosob = prosob;
	}
	
	public void samsungDisplay()
	{
		System.out.println("very faster and best quality camera");
		prosob.processorFunction();
	}

}
