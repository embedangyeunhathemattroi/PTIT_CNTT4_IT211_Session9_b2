package com.example.javawebservice_ss9_b2s;

import com.example.javawebservice_ss9_b2s.service.DemoService;

public class TestDemoService {
    public static void main(String[] args) {

        DemoService service = new DemoService();

        // INFO
        service.checkDiscount("user01", "VIP");

        // WARN
        service.checkDiscount("user02", "EXPIRED");

        // ERROR
        service.checkDiscount("user03", "DB_ERROR");
    }
}
