package be.samdmm.personalwebsite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/personalinfo")
public class PersonalInfoController {

	private static final String VIEW = "personalinfo";

	@GetMapping
	public ModelAndView personalInfo() {

		return new ModelAndView(VIEW);
	}
}
