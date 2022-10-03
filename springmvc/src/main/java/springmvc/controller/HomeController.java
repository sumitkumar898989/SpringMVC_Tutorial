package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	/*
	 * @RequestMapping("/home") 
	 * public String home() {
	 * System.out.println("This is home url"); 
	 * return "index"; 
	 * }
	 */
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is home url");
		model.addAttribute("namePerson", "Amit Kumar");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about controller");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		ModelAndView m = new ModelAndView();
		m.addObject("Name", "Raju Khan");
		m.addObject("rollNo", 12345);
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		m.addObject("marks", list);
		m.setViewName("help");
		return m;
	}
}
