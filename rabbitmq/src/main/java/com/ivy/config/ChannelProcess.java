package com.ivy.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @author : zhangyan 2018/7/27
 */

@Component
public interface ChannelProcess {

    String QUEUE1_INPUT = "queue1-input";
    String QUEUE1_OUTPUT = "queue1-output";

    @Input(QUEUE1_INPUT)
    SubscribableChannel queue1Input();

    @Output(QUEUE1_OUTPUT)
    SubscribableChannel queue1OUtput();
}
