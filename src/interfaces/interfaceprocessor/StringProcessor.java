package interfaces.interfaceprocessor;

import java.util.Arrays;

public abstract class StringProcessor implements Processor{
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s = "If she weighs the same as a duch, she's made of wood";
	public static void main(String[] args){
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
}

class Upcase extends StringProcessor {
	public String process(Object input) { // Covariant return, this method of base class returns Object, but the overrided method returns String, which is derived from Object
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) {
		// The split() argument divides a String into pieces
		return Arrays.toString(((String)input).split(" "));
	}
}
