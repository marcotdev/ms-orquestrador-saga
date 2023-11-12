package br.com.microservices.orchestrated.productvalidationservice.core.consumer;


<<<<<<< HEAD
import br.com.microservices.orchestrated.productvalidationservice.core.service.ProductValidationService;
=======
>>>>>>> 3efde44 (add consumer aos microserviços)
import br.com.microservices.orchestrated.productvalidationservice.core.utils.JsonUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProductValidationConsumer {

<<<<<<< HEAD
    private final ProductValidationService productValidationService;
=======
    //private final ProductValidationService productValidationService;
>>>>>>> 3efde44 (add consumer aos microserviços)
    private final JsonUtil jsonUtil;

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}",
        topics = "${spring.kafka.topic.product-validation-success}"
    )
    public void consumeSuccessEvent(String payload) {
        log.info("Receiving success event {} from product-validation-success topic", payload);
        var event = jsonUtil.toEvent(payload);
<<<<<<< HEAD
        productValidationService.validateExistingProducts(event);

=======
        //productValidationService.validateExistingProducts(event);
        log.info(event.toString());
>>>>>>> 3efde44 (add consumer aos microserviços)
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}",
        topics = "${spring.kafka.topic.product-validation-fail}"
    )
    public void consumeFailEvent(String payload) {
        log.info("Receiving rollback event {} from product-validation-fail topic", payload);
        var event = jsonUtil.toEvent(payload);
<<<<<<< HEAD
        productValidationService.rollbackEvent(event);
=======
        //productValidationService.rollbackEvent(event);
        log.info(event.toString());
>>>>>>> 3efde44 (add consumer aos microserviços)
    }
}