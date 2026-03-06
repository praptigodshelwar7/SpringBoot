package com.example.InternalWorkingOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider",havingValue="razorpay")
public class RazorpayPaymentService implements PaymentService {
    @Override
    public String pay(){
        String payment="RazorPay Payment";
        System.out.println("payment from: "+payment);
        return payment;
    }
}
