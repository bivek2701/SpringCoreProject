package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is home url");
		model.addAttribute("name", "Bivek Jha");
		model.addAttribute("Id",100);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Aarti");
		friends.add("Varyika");
		friends.add("Vikash");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
	
	//Creating model and view object
	 ModelAndView modelAndView=new ModelAndView();
	 
	 //setting the data
	 modelAndView.addObject("name","Vimal Jha");
	 modelAndView.addObject("rollnumber",101);
	 modelAndView.setViewName("help");
		return modelAndView;
	}
}
