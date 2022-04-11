package mvc6772;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController 
{
      @RequestMapping("/index")	
      public String display()
      {
    	  return "index";
      }
      
      
      @RequestMapping("/display")	
      public String display5()
      {
    	  return "show";
      }
}
