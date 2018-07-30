package com.ivy.customer;

import com.ivy.config.ChannelProcess;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * @author : zhangyan 2018/7/30
 */
@EnableBinding(ChannelProcess.class)
public class MessageCustomer {

    @StreamListener(value = ChannelProcess.QUEUE1_INPUT)
    public void receive(@Payload String message) {
        System.out.println(message);
    }
}
