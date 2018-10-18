package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/hello-world")
    public String greeting(
     @RequestParam(name="name", required=false, defaultValue="Hang Tu") String name,
     @RequestParam(name="lastName", required=false, defaultValue="Wong Ley") String lastName, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("lastName", lastName);
        return "greeting";
    }
}
