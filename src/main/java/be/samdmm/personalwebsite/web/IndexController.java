package be.samdmm.personalwebsite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class IndexController {

	private static final String INDEX = "index";

	public ModelAndView index() {

		return new ModelAndView(INDEX);
	}
}
