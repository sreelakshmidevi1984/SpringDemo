package SBasic.RestAPIControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Reached  sayhello method in DemoRestController");
		return "Hello World";
	}

	@GetMapping("/SendLoginDetails")
	public String sendLoginDetails() {
		System.out.println("Reached  SendLoginDetails method in DemoRestController");
		return "Login details: UserName:xxx; Password:yyy";
	}
	
}
