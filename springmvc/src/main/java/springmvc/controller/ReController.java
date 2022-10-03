package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	
	/* one way to redirect by redirect prefix********
	 * @RequestMapping("/one") 
	 * public String one() 
	 * {
	 * System.out.println("This is one handler"); 
	 * return "redirect:/enjoy";
	 * 
	 * }
	 */
	
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("This is one handler");
		RedirectView r= new RedirectView();
		//r.setUrl("enjoy");
		r.setUrl("https://www.google.com");
		return r;
		
	}
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("This is second handler[enjoy]");
		return "contact";
		
	}
}
