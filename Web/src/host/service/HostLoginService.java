package host.service;

public class HostLoginService {

	public static boolean HostLogin(String id, String pass) {

		if (id.equals("admin") && pass.equals("admin")) {
			return true;

		} else if (id.equals("suga") && pass.equals("suga0114")) {
			return true;


		} else {
			return false;
		}

	}

}
