package com.example.wechatdataservice.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//Rabbit配置类
public class RabbitConfig {
    private final String EXCHANGE_NAME = "boot_topic_exchange";
    private final String QUEUE_NAME = "boot_queue";


    //创建交换机
    @Bean("bootExchange")
    public Exchange getExchange()
    {
        return ExchangeBuilder
                .topicExchange(EXCHANGE_NAME)//交换机类型 ;参数为名字
                .durable(true)//是否持久化，true即存到磁盘,false只在内存上
                .build();
    }
    //创建队列
    @Bean("bootQueue")
    public Queue getMessageQueue()
    {
        return new Queue(QUEUE_NAME);
    }
    //交换机绑定队列
    @Bean
    //@Qualifier注解,使用名称装配进行使用
    public Binding bindMessageQueue(@Qualifier("bootExchange") Exchange exchange, @Qualifier("bootQueue") Queue queue)
    {
        return BindingBuilder
                .bind(queue)
                .to(exchange)
                .with("#.message.#")
                .noargs();
    }
    @Bean
    public MessageConverter jsonMessageConverter(ObjectMapper objectMapper) {
        return new Jackson2JsonMessageConverter(objectMapper);
    }


}
