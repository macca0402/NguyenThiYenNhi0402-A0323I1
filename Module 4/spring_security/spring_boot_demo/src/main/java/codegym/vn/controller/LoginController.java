package codegym.vn.controller;

import codegym.vn.entity.User;
import codegym.vn.service.UserService;
import codegym.vn.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserUtils utils;

    @GetMapping("/login")
    public String showLogin(HttpSession httpSession) {
        User user = (User)httpSession.getAttribute("user");
        if (user != null) {
            return "redirect:/product/list";
        }
        return "login/index";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          Model model,
                          HttpSession session) {
        User user = userService.getUserByUserName(username);
        if (user == null || !utils.checkPassword(user.getPassword(), password)) {
            model.addAttribute("message","User không tồn tại hoặc sai password");
            return "login/index";
        }
        session.setAttribute("user", user);
        return "redirect:/product/list";
    }

    @GetMapping("/authorize")
    public String authorize() {
        return "login/403";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
