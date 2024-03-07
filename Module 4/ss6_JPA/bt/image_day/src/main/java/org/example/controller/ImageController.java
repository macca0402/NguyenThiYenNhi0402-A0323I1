package org.example.controller;

import org.example.entity.Image;
import org.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;
    @GetMapping("/list")
    public String display(Model model){
        model.addAttribute("image",new Image());
        return "/list";
    }
    @PostMapping("/create")
    public String createComment(@ModelAttribute Image image,Model model){
        imageService.createComment(image);
        model.addAttribute("message","Đã comment");
        model.addAttribute("listComment",imageService.listImage());
        return "/list";
    }
    @GetMapping("/like/{like}")
    public String increaseStar(@PathVariable(value = "like") int id,Model model){
        imageService.plus(imageService.findComment(id));
        model.addAttribute("image",new Image());
        model.addAttribute("listComment",imageService.listImage());
        return "/list";
    }
}
