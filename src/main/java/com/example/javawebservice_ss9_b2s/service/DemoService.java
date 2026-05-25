package com.example.javawebservice_ss9_b2s.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoService {

    public void applyDiscount(
            String userId,
            String code
    ) {

        if (code.equals("VIP")) {

            // Thành công -> INFO
            log.info(
                    "Áp dụng thành công cho user: {}",
                    userId
            );

        } else if (code.equals("EXPIRED")) {

            // Lỗi nghiệp vụ -> WARN
            log.warn(
                    "Mã giảm giá đã hết hạn: {}",
                    code
            );

        } else {

            // Lỗi hệ thống -> ERROR
            log.error(
                    "Lỗi mất kết nối DB khi check mã: {}",
                    code
            );
        }
    }

    public static void main(String[] args) {

        DemoService service = new DemoService();

        // INFO
        service.applyDiscount(
                "USER01",
                "VIP"
        );

        // WARN
        service.applyDiscount(
                "USER02",
                "EXPIRED"
        );

        // ERROR
        service.applyDiscount(
                "USER03",
                "FAIL"
        );
    }
}
