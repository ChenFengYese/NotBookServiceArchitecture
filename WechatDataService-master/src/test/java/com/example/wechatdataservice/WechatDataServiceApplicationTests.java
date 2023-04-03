package com.example.wechatdataservice;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
class WechatDataServiceApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void testSendMessage()
    {
        rabbitTemplate.convertAndSend("boot_topic_exchange","message","双十二开始了！");
    }



}
