package com.xyq.springcloud.mqconsumer;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/12/29 20:34
 */
public class WorkConsumer {
   /* @RabbitListener(queuesToDeclare = @Queue("work"))
    public void consumer1(String message){
        System.out.println("pay consumer1接受++++++++++++++++++"+message);
    }
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void consumer2(String message){
        System.out.println("pay consumer2接受------------------"+message);
    }*/
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void process(String message){
        System.out.println("pay3 consumer2接受------------------"+message);
    }
   /* @RabbitListener(bindings = {
            @QueueBinding(exchange = @Exchange(value = "exchangefanout",type = "fanout"),
                    value = @Queue
            )
    })
    public void process(String message){
        System.out.println("pay3++++++++++++++"+message);
    }
*/
}
