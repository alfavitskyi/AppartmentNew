package com.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    public @ResponseBody String addNewUser (@RequestParam int apartNum, @RequestParam Double apartSquare,
                                            @RequestParam Double debt, @RequestParam Double paySumm,
                                            @RequestParam String apartEmail, @RequestParam int quantityPeople){
        User u = new User();
        u.setApartNum(apartNum);
        u.setApartSquare(apartSquare);
        u.setDebt(debt);
        u.setPaySumm(paySumm);
        u.setApartEmail(apartEmail);
        u.setquantityPeople(quantityPeople);

        return "Saved";
    }
    @GetMapping (path = "/all")
    public @ResponseBody Iterable<User> showAllUsers(){
        return userRepository.findAll();
    }
}
