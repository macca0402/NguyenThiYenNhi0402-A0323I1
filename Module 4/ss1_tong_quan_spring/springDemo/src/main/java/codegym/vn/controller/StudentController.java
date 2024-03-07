
package codegym.vn.controller;

import codegym.vn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

@Autowired
StudentService studentService;
    @GetMapping("/list")
    public String displayList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "student/list";
    }
}
