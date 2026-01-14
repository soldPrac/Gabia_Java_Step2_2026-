package chapter09;

public class HttpServletMain_03 {

	public static void main(String[] args) {
		method(new LoginService());
		method(new FileDonwloadService());
	}
	
	static void method(HttpServlet servlet) {
		servlet.service();
	}

}
