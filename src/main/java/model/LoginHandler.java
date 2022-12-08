package model;

public class LoginHandler {
	private static String username = "tarek";
	private static String username2 = "masterchief";
	private static String pass1 = "12345";
	private static String pass2 = "pelican";

	public static boolean checkCredentials(String user, String password) {

		if (user.equals(username)&& password.equals(pass1)) {
			return true;
		} else if (user.equals(username2)&& password.equals(pass2)) {
			return true;
		}else {
			return false;
			}
	}
}
