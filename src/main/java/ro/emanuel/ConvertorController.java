package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertorController {
	@GetMapping("/convert")
	public ModelAndView convert(@RequestParam(name = "suma", required = true, defaultValue = "100") int suma, @RequestParam(name = "from", required = true, defaultValue = "RO") String from, @RequestParam(name = "to", required = true, defaultValue = "EUR") String to, @RequestParam(name = "rate", required = true, defaultValue = "5") int rate) {
		String string = "";
		int result = 0;
		
		if(from.toUpperCase().equals("RO") && to.toUpperCase().equals("EUR")) {
			result = suma / rate;
			string = result + " EURO";
		} else {
			if(from.toUpperCase().equals("EUR") && to.toUpperCase().equals("RO")) {
				result = suma * rate;
				string = result + " RON";
			} else {
				string = "Nu stiu sa convertesc suma in parametrii pe care mi i-ai dat.";
			}
		} 
		
		ModelAndView modelAndView = new ModelAndView("convertor.jsp");
		modelAndView.addObject("c", string);
		return modelAndView;
	}
}
