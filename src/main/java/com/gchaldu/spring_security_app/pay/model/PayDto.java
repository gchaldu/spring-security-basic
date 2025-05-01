package com.gchaldu.spring_security_app.pay.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PayDto {
    private Long id;
    private Double price;
}
