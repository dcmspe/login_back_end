package pt.aubay.login.backend.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;
import pt.aubay.login.backend.bean.Login;

@RestController
@RequestMapping("/")
public class LoginController {

    @PostMapping(value = "", consumes = "application/json",produces = "application/json")
    public String login(@ModelAttribute Login login){
        Gson gson = new Gson();
        return gson.toJson(login);
    }

    @GetMapping(value = "test" , produces = "application/json")
    public String healthCheck(){
        return "It's running by the blessing of Budha. Om Mani Padme Hung";
    }
}
