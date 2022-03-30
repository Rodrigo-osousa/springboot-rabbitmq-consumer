package com.springbootrabbitmq.rabbitmqconsumerspringboot.consumer;

import com.springbootrabbitmq.rabbitmqconsumerspringboot.constants.RabbitmqConstants;
import com.springbootrabbitmq.rabbitmqconsumerspringboot.dto.IventaryDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class IventaryConsumer {



    @RabbitListener(queues = RabbitmqConstants.QUEUE_INVENTORY)
    private void consumer(IventaryDto iventaryDto) {
    System.out.println(iventaryDto.productCode);
    System.out.println(iventaryDto.quantity);
    System.out.println("------------------------");
    }


}
