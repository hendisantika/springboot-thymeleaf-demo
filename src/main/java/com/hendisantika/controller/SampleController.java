package com.hendisantika.controller;

import com.hendisantika.model.ProductVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/08/21
 * Time: 07.08
 */
@Controller
public class SampleController {
    @GetMapping("/ex01")
    public String ex01(Model model) {
        ProductVO productVO = new ProductVO();
        productVO.setName("Uzumaki Naruto");
        productVO.setPrice(10000);
        productVO.setRegDate(new Date());

        model.addAttribute("productVO", productVO);

        return "thymeleaf/object_view";
    }

    @GetMapping("/ex02")
    public String ex02(Model model) {

        List<ProductVO> productList = new ArrayList<>();
        IntStream.range(0, 10).forEach(i -> {
            productList.add(new ProductVO("Goods" + i, i * 1000, new Date()));
        });
        model.addAttribute("productList", productList);

        return "thymeleaf/list_view";
    }
}
