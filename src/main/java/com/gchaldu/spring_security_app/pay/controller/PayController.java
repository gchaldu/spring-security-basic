package com.gchaldu.spring_security_app.pay.controller;

import com.gchaldu.spring_security_app.pay.model.PayDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PayController {

    @GetMapping
    public List<PayDto> getAll(){
        return List.of(
                new PayDto(1L, 1200.00),
                new PayDto(2L, 1500.00)
        );
    }
}
