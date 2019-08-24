package command.line.arg;

public class NameAndAge {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("Comand Line Arguments are present.");
			try {
				for (int i = 0; i < args.length; i++) {
					if (i % 2 == 0) { // name argument
						if (isInvalid(args[i + 1])) { // age argument
							throw new NameAndAgeException(args[i], args[i + 1]);
						}
						System.out.println("Name :" + args[i] + " and Age : " + args[i + 1]);
					}
				}
			} catch (NameAndAgeException ex) {
				System.out.println("NameAndAgeException caught");
				System.out.println(ex.getMessage());
			}

		} else {
			System.out.println("Comand Line Arguments are not present.");
		}

	}

	private static boolean isInvalid(String inAge) {
		try {
			int age = Integer.parseInt(inAge);
			if (age < 18 || age >= 60)
				return true;
		} catch (NumberFormatException ex) {
			return true;
		}
		return false;
	}

}
