package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import service.UserService;
import entity.User;

@Controller
@RequestMapping("/")
public class UserController{

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/nextPage")
    public String nextPage(){
        return "nextPage";
    }

    @GetMapping("/users")
    // model = view -> controler
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.getAll());
        return "usersList";
    }

    @GetMapping("/user/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getById(id));
        return "showUser";
    }

}


