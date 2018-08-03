package com.ivy;

import com.ivy.config.ChannelProcess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author : zhangyan 2018/7/27
 */
@SpringBootApplication
@EnableBinding(ChannelProcess.class)
public class RabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqApplication.class);
    }
}
