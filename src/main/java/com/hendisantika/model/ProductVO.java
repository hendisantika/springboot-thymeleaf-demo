package com.hendisantika.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/08/21
 * Time: 07.06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVO {
    private String name;
    private int price;
    private Date regDate;
}
