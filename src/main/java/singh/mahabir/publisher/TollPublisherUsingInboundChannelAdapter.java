/**
 *
 */
package singh.mahabir.publisher;

import org.springframework.integration.annotation.InboundChannelAdapter;

/**
 * We can publish the messages to any broker using spring integration
 * {@link InboundChannelAdapter}
 *
 * @author Mahabir Singh
 *
 */

//@EnableBinding(Source.class)
public class TollPublisherUsingInboundChannelAdapter {

//    @InboundChannelAdapter(channel = Source.OUTPUT)
    public String sendTollCharge() {
	return "{station:\"20\", customerid:\"100\", timestamp:\"2017-07-12T03:15:00\"}";
    }

}
