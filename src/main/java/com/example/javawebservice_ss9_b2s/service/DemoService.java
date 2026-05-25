package com.example.javawebservice_ss9_b2s.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    // Tạo logger cho class
    private static final Logger logger =
            LoggerFactory.getLogger(DemoService.class);

    public void checkDiscount(String userId, String code) {

        // INFO -> xử lý thành công
        if (code.equals("VIP")) {

            logger.info(
                    "Áp dụng thành công cho user: {}",
                    userId
            );

            // WARN -> lỗi nghiệp vụ do người dùng
        } else if (code.equals("EXPIRED")) {

            logger.warn(
                    "Mã giảm giá đã hết hạn: {}",
                    code
            );

            // ERROR -> lỗi hệ thống
        } else {

            logger.error(
                    "Lỗi mất kết nối DB khi check mã: {}",
                    code
            );
        }
    }
}