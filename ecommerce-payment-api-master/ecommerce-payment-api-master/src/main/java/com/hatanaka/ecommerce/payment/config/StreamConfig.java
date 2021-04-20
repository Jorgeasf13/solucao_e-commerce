package com.hatanaka.ecommerce.payment.config;

import com.hatanaka.ecommerce.payment.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(CheckoutProcessor.class)
public class StreamConfig {
}
