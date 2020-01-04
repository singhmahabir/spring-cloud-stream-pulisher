/**
 *
 */
package singh.mahabir.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import singh.mahabir.publisher.custom.TollSource;

/**
 * This is a rest endpoint class.
 * <p>
 * When a post request will come
 * {@link FastPassRestController#publishMessage(String)} this will publish the
 * message to broker
 *
 * @author Mahabir Singh
 *
 */

@RestController
@Slf4j
public class FastPassRestController {

    @Autowired
    TollSource mysource;

    final Random r = new Random();

    @PostMapping(path = "/toll")
    public String publishMessage(@RequestBody String payload) {
	log.info(payload);
	mysource.fastpassToll().send(MessageBuilder.withPayload(payload).setHeader("speed", r.nextInt(8) * 10).build());
	return "success";
    }
}
