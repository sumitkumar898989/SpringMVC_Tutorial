package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	/*
	 * This is the one way we can get the data from view
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) 
	 * public String handleForm(HttpServletRequest request) 
	 * { 
	 * 		String email=request.getParameter("email");
	 * 		System.out.println("user email is"+email); return "contact"; 
	 * }
	 */
	
	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) 
	 * public String handleForm(@RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * System.out.println("user email is"+userEmail);
	 * System.out.println("user name is"+userName);
	 * System.out.println("user password is"+userPassword);
	 * model.addAttribute("name", userName); model.addAttribute("email", userEmail);
	 * model.addAttribute("password", userPassword); 
	 * return "success"; 
	 * }
	 */
	
	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) 
	 * public String handleForm(@RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * User user = new User(); 
	 * user.setEmail(userEmail); 
	 * user.setUserNmae(userName);
	 * user.setPassword(userPassword); 
	 * System.out.println(user);
	 * model.addAttribute("user", user); 
	 * return "success"; 
	 * }
	 */
	
	
	  @RequestMapping(path="/processform",method=RequestMethod.POST) 
	  public String handleForm(@ModelAttribute User user, Model model) {
		  System.out.println(user);
		  System.out.println("using modelattribute");
		  //model.addAttribute("user", user); 
		  int createUser=this.userService.createUser(user);
		  model.addAttribute("msg","User created with id"+createUser);
		  return "success"; 
	  
	  }
	 

}
