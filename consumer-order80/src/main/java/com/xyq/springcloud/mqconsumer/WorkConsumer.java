package com.xyq.springcloud.mqconsumer;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/29 19:59
 */
@Component
public class WorkConsumer {
  /*  @RabbitListener(queuesToDeclare = @Queue("work"))
    public void consumer1(String message){
        System.out.println("oreder consumer1接受++++++++++++++++++"+message);
    }
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void consumer2(String message){
        System.out.println("order consumer2接受------------------"+message);
    }*/
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void process(String message){
        System.out.println("order3 consumer2接受------------------"+message);
    }
    /*@RabbitListener(bindings = {
            @QueueBinding(exchange = @Exchange(value = "exchangefanout",type = "fanout"),
                    value = @Queue
            )
    })
    public void process(String message){
        System.out.println("order接受1++++++++++++++"+message);
    }*/
}
