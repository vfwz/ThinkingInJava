package interfaces.exercise;

import interfaces.interfaceprocessor.Apply;
import interfaces.interfaceprocessor.Processor;

public class Exercise11Processor implements Processor {
	
	Exercise11 ex;
	
	public Exercise11Processor(Exercise11 ex){
		this.ex = ex;
	}

	@Override
	public String name() {
		return getClass().getSimpleName();
	}

	@Override
	public String process(Object input) {
		return ex.swapString((String)input);
	}
	
	public static void main(String[] args) {
		Apply.process(new Exercise11Processor(new Exercise11()), "whatever");
	}

}
