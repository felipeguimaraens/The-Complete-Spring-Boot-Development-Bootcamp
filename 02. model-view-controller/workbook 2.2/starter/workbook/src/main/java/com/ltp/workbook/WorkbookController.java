package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {
    
    @GetMapping("/")
    /*TASK 4 code:
        public String getShows(Model model) {
            Show show = new Show("Breaking Bad", "Ozymandias", 10.0);
            model.addAttribute("show", show);
            Show show1 = new Show("Attack on Titan", "Hero", 9.9);
            model.addAttribute("show1", show1);
            Show show2 = new Show("Attack on Titan", "Perfect Game", 9.9);
            model.addAttribute("show2", show2);
            Show show3 = new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9);
            model.addAttribute("show3", show3);
            Show show4 = new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9);
            model.addAttribute("show4", show4);
        }*/
    public String getShows(Model model) {
        Show show = new Show("Breaking Bad", "Ozymandias", 10.0);
        model.addAttribute("show", show);
        Show show1 = new Show("Attack on Titan", "Hero", 9.9);
        model.addAttribute("show1", show1);
        Show show2 = new Show("Attack on Titan", "Perfect Game", 9.9);
        model.addAttribute("show2", show2);
        Show show3 = new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9);
        model.addAttribute("show3", show3);
        Show show4 = new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9);
        model.addAttribute("show4", show4);
        return "shows";
    }

}
