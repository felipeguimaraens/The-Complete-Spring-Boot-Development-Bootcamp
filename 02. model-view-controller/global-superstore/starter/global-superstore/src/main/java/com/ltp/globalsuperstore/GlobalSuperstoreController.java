package com.ltp.globalsuperstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GlobalSuperstoreController {
    
    private List<Item> items = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id){
        //System.out.println("id: " + id);
        
        model.addAttribute("categories", Constants.CATEGORIES);
        
        for(Item item: items){
            if (item.getId().equals(id)) {
                model.addAttribute("item", item);
                return "form";
            }
        }
        model.addAttribute("item", new Item());
        return  "form";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model){
        model.addAttribute("items", items);
        return  "inventory";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(Item item){
        for(Item product: items){
            if (item.getId().equals(product.getId())) {
                System.out.println("Index: " + items.indexOf(product));
                System.out.println("Index: " + item);
                System.out.println("Index: " + product);
                items.set(items.indexOf(product), item);
                return "redirect:/inventory";
            }
        }
        items.add(item);
        return "redirect:/inventory";
    }
}

