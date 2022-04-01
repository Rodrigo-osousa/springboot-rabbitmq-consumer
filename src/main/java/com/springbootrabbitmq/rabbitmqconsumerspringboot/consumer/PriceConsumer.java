package com.springbootrabbitmq.rabbitmqconsumerspringboot.consumer;


import constants.RabbitmqConstants;
import dto.PriceDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PriceConsumer {


    @RabbitListener(queues = RabbitmqConstants.QUEUE_PRICE)
    private void consumer(PriceDto priceDto) {
        System.out.println("Product code: " + priceDto.productCode);
        System.out.println("Amount R$: " + priceDto.price);
        System.out.println("------------------------");
    }


}
