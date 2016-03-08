public enum Planet {
	MERCURY(0.3, 1), EARTH(4.8, 6.6), VENUS(9.2, 10.1);

	private final double mass;
	private final double radius;
	private final double gravity;

	Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		gravity = mass / radius;
	}

	public double mass() {
		return mass;
	}

	public double radius() {
		return radius;
	}

	public double gravity() {
		return gravity;
	}

}
