package bhavya.JokesApp.jokesApp.controller;

import bhavya.JokesApp.jokesApp.Service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by barora on 1/1/2018.
 */
@Controller
public class JokesController {
	
	JokesService jokesService;
	
	@Autowired
	JokesController(JokesService jokesService){
		this.jokesService = jokesService;
	}
	
	@RequestMapping({"/",""})
	public String showJokes(Model model){
		model.addAttribute("joke",jokesService.getJoke());
		//String jokes = jokesService.getJoke();
		return "chucknorris";
	}
}
