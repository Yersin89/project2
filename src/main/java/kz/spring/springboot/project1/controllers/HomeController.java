package kz.spring.springboot.project1.controllers;

import kz.spring.springboot.project1.entities.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(Model model){
        Items item1 = new Items(1L, "Macbook Pro", "8 GB RAM 255 GB SSD Intel Core i7", 1199.99);
        Items item2 = new Items(1L, "Macbook Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99);
        Items item3 = new Items(1L, "Macbook Pro", "16 GB RAM 1 GB SSD Apple M1", 1799.99);
        Items item4 = new Items(1L, "Asus Tuf Gaming", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99);
        Items item5 = new Items(1L, "HP Lazer Pro", "8 GB RAM 500 GB SSD Intel Core i5", 999.99);
        Items item6 = new Items(1L, "Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99);
        model.addAttribute("item1", item1);
        model.addAttribute("item2", item2);
        model.addAttribute("item3", item3);
        model.addAttribute("item4", item4);
        model.addAttribute("item5", item5);
        model.addAttribute("item6", item6);

        return "index";
    }
}
