package com.hendisantika.controller;

import com.hendisantika.model.ModelEnumVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/08/21
 * Time: 07.06
 */
@Controller
public class EnumController {

    @GetMapping("enum01")
    public String enumExample01(Model model) {

        ModelEnumVO modelEnumVO = new ModelEnumVO();
        model.addAttribute("modelEnumVO", modelEnumVO);

        return "enums";
    }
}
