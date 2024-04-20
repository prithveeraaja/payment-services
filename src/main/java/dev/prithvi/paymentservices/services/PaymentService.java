package dev.prithvi.paymentservices.services;

import com.razorpay.RazorpayException;

public interface PaymentService {


    String createPaymentLink(String orderId) throws RazorpayException;

    String getPaymentStatus(String paymentId);


}
