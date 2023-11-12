package br.com.microservices.orchestrated.paymentservice.core.consumer;


<<<<<<< HEAD
import br.com.microservices.orchestrated.paymentservice.core.service.PaymentService;
import br.com.microservices.orchestrated.paymentservice.core.utils.JsonUtil;
import lombok.AllArgsConstructor;
=======
import br.com.microservices.orchestrated.paymentservice.core.utils.JsonUtil;
import lombok.RequiredArgsConstructor;
>>>>>>> 3efde44 (add consumer aos microserviços)
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
<<<<<<< HEAD
@AllArgsConstructor
public class PaymentConsumer {

    private final PaymentService paymentService;
=======
@RequiredArgsConstructor
public class PaymentConsumer {

   // private final PaymentService paymentService;
>>>>>>> 3efde44 (add consumer aos microserviços)
    private final JsonUtil jsonUtil;

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}",
        topics = "${spring.kafka.topic.payment-success}"
    )
    public void consumeSuccessEvent(String payload) {
        log.info("Receiving success event {} from payment-success topic", payload);
        var event = jsonUtil.toEvent(payload);
<<<<<<< HEAD
       paymentService.realizePayment(event);

=======
       // paymentService.realizePayment(event);
        log.info(event.toString());
>>>>>>> 3efde44 (add consumer aos microserviços)
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}",
        topics = "${spring.kafka.topic.payment-fail}"
    )
    public void consumeFailEvent(String payload) {
        log.info("Receiving rollback event {} from payment-fail topic", payload);
        var event = jsonUtil.toEvent(payload);
<<<<<<< HEAD
        paymentService.realizeRefund(event);
=======
        //paymentService.realizeRefund(event);
        log.info(event.toString());
>>>>>>> 3efde44 (add consumer aos microserviços)
    }
}