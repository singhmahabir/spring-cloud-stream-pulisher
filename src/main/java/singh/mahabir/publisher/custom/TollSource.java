/**
 *
 */
package singh.mahabir.publisher.custom;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

/**
 * This a custom {@link Source} class
 *
 * <p>
 * While using {@link Output} we can pass custom channel name which is as topic
 * name for broker
 * 
 * @author Mahabir Singh
 *
 */
public interface TollSource {

    /*
     * @Output("fastpassTollChannel") this defines the channel name
     */
    @Output("fastpassTollChannel")
    MessageChannel fastpassToll();

    @Output("standardTollChannel")
    MessageChannel standardToll();
}
