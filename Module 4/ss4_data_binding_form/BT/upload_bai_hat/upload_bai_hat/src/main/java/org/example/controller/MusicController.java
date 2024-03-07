package org.example.controller;

import org.example.model.Music;
import org.example.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("list")
    public String display(Model model) {
        model.addAttribute("list", musicService.getAll());
        model.addAttribute("listAlbum", listAlbum);
        return "list";
    }

    @GetMapping("/create")
    public String formCreate(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Music music, Model model) {
        Pattern pattern = Pattern.compile("^\\w+\\.(mp3|wav|ogg|m4p)$");
        Matcher matcher = pattern.matcher(music.getLink());
        if (matcher.matches()) {
            musicService.create(music);
            model.addAttribute("message", "Khơi tạo thành công");
            return "redirect:/list";
        } else {
            model.addAttribute("message", "Đường liên kết không hợp lệ !!");
            return "create";
        }
    }
    private String listAlbum = "https://static.vecteezy.com/system/resources/previews/008/605/167/original/vinyl-disk-music-with-tune-and-note-of-music-cartoon-icon-illustration-recreation-object-icon-concept-isolated-premium-flat-cartoon-style-vector.jpg";
}
