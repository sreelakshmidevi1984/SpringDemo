package SBasic.SpringMVC;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloworldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "showForm";
	}
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "processForm";
	}
	@RequestMapping("/testRestService")
	public String testRestService() {
		return "testRestService";
	}
	
	@RequestMapping("/processFormversion2")
	public String processForm(HttpServletRequest  request, Model modeData) {
		Map<String,String> userMap = new HashMap<>();
		userMap.put("balu", "abcd");
		userMap.put("Lakshmi", "efgh");
		userMap.put("tanwija", "ijkl");
		userMap.put("tanusree", "mnop");
		String data = request.getParameter("username");
		if(userMap.containsKey(data)) {
			String password = userMap.get(data);
			if(password.equals(request.getParameter("password"))){
				modeData.addAttribute("usernameU",data.toUpperCase());
				return "SuccessPage";
			}else
				modeData.addAttribute("usernameU",data.toUpperCase());
				return "LoginFailed";
		}else {
			modeData.addAttribute("usernameU",data.toUpperCase());
			return "LoginFailed";
		}
		
	}
}
