package com.ivy.productor;

import com.ivy.config.ChannelProcess;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author : zhangyan 2018/7/30
 */
@Component
@EnableBinding(ChannelProcess.class)
public class MessageProductor {

    private final ChannelProcess channelProcess;

    @Autowired
    public MessageProductor(ChannelProcess channelProcess) {
        this.channelProcess = channelProcess;
    }

    @SendTo(ChannelProcess.QUEUE1_OUTPUT)
    public void send(String message) {
        final boolean send = channelProcess.queue1OUtput().send(MessageBuilder.withPayload(message).build());
        System.out.println(send);

    }
}
