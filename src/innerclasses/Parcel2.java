package innerclasses;


/**
 * @author zhenwei.liu
 * Creating inner classes
 */
public class Parcel2 {
	
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	// Using inner classes looks just like using any other class, within Parcel1
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		// Defining references to inner classes:
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
	}
	
}
