package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ro.emanuel.pojo.Laptop;

@Controller
public class LaptopsController {
	@GetMapping("/laptops")
	public ModelAndView laptops(@RequestParam(name = "brand", required = false, defaultValue = "Dell") String brand) {
		
		int length = brand.length();
		String string = brand + ", " + length + " caractere";
		
		String parity = (length % 2 == 0) ? "par" : "impar";
		String string2 = brand + ", " + parity;
		
		ModelAndView modelAndView = new ModelAndView("laptops.jsp");
		modelAndView.addObject("c", string);
		modelAndView.addObject("p", string2);
		return modelAndView;
	}
	
	@GetMapping("/laptop")
	public ModelAndView laptop(@RequestParam(name = "brand", required = false, defaultValue = "Dell") String brand, @RequestParam(name = "pret", required = false, defaultValue = "2500") int pret, @RequestParam(name = "ram", required = false, defaultValue = "16") int ram) {
		
		Laptop lap = new Laptop(brand, pret, ram);
		String myBrand = lap.getBrand();
		
		int price = lap.getPret();
		String myPrice = String.valueOf(price);
		
		int aRam = lap.getRam();
		String myRam = String.valueOf(aRam);
		
		
		ModelAndView modelAndView = new ModelAndView("laptop.jsp");
		modelAndView.addObject("b", myBrand);
		modelAndView.addObject("p", myPrice);
		modelAndView.addObject("r", myRam);
		return modelAndView;
	}
	
}
