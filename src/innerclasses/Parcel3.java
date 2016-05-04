package innerclasses;

/**
 * @author zhenwei.liu
 * Using .new to create instances of inner classes.
 */
public class Parcel3 {
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	class Destination {
		private String label;
		//static  int i = 3; The field i cannot be declared static in a non-static inner type, unless initialized with a constant expression
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
		
	}
	
	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		// Must use instance of outer class to create an instance of the inner class:
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Tasmania");
	}
}
