package interfaces;
import static util.Print.print;

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly{
	void fly();
}

abstract class ActionCharacter {
	public void fight() {print("ActionCharcter fight");};
	static void haha() {print("11");}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim() {print("Hero fight");}
	public void fly() {print("Hero fly");}
}

public class Adventure {
	public static void t(CanFight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly();; }
	public static void w(ActionCharacter x) { x.fight(); }
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		ActionCharacter.haha();
	}
}
