package outside;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmbulanceController {


    @GetMapping(value = "/")
    public String ping(){

       // System.out.println("Outside");
        return "success";
    }
}
