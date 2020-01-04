# spring-cloud-stream-pulisher
spring-cloud-stream-pulisher uses rabbitmq and kafka for message driven model

> More options for producing Messages

    -   Customize behavior of InboundChannel Adapter
    -   Create custom interface for channel definitions
    -   push message by injecting bound interface or channel directly
    
> Stateful processing  with partitions

    -   spring.cloud.stream.bindings.<channelname>.producer.partitioned=true
    -   spring.cloud.stream.bindings.fastpasstollchannel.producer.partitionKeyExpression=payload.stationId
    -   spring.cloud.stream.bindings.fastpasstollchannel.producer.partitionCount=3
    -   spring.cloud.stream.instanceCount=3
    
> content type

    -   spring.cloud.stream.default.contentType=application/json
    -   from version 2.0.0 this is not required it happened automatically 

#### Some useful url

> -   https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/
> -   https://github.com/spring-cloud/spring-cloud-stream-samples   