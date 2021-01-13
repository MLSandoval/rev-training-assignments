package ArithmeticProj;

public final class ArithClass {
	
	static int addition(int ...args) {
		int z = 0;
		for(int x: args) {
			z += x;
		}
		return z;
	}
	
	static int subtraction(int ...args) {
		int z = args[0];
		for(int x = 1; x < args.length; x++) {
			z -= args[x];
		}
		return z;
	}
	
	static int multiply(int ...args) {
		int z = args[0];
		for(int x = 1; x < args.length; x++) {
			z *= args[x];
		}
		return z;
	}
	
	static int divide(int ...args) {
		int z = args[0];
		for(int x = 1; x < args.length; x++) {
			z /= args[x];
		}
		return z;
	}
}
