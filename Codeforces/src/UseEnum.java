public class UseEnum {

	public static void main(String[] args) {
		System.out.println(Planet.MERCURY.gravity());
		for (Planet p : Planet.values()) {
			p.gravity();
		}
	}
}
