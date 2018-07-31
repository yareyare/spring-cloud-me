package com.ivy.controller;

import com.ivy.productor.MessageProductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhangyan 2018/7/30
 */
@RestController
@RequestMapping(value = "/api")
public class ProductorController {

    private final MessageProductor productor;

    @Autowired
    public ProductorController(MessageProductor productor) {
        this.productor = productor;
    }

    @PostMapping(value = "/send")
    public void send(String message) {
        System.out.println(message);
        productor.send(message);
    }
}
