# Message Queue

A message queue is essentially a list that allows distributed systems to communicate with each other asynchronosouly.

Each message is stored until it is ready to be processed and is then deleted. 

In our pizza shop example we would no longer wait for the services to start making the pizza before responding. We would store this in the queue and give the customer a more generic response. Then once the queue has processed this request it could send the customer an email saying that their pizza is in the oven. etc.

![SQS example](../../images/system-design/aws-sqs-example.png)

## Benefits
- Reliable message delivery: message queues usually have a number of retries and seperate this logic from crutial bussiness logic.
- Inter-application connectivity: message queues can handle things such as encryped communication between services instead of having the servers handle this.
- Versatility: message queues can support multiple langues and handle requests to services across multiple languages and frameworks.
- Resilience: Asynch. messaging queues ensure that faults won't break the system. This logic is no encapsulated in the queue and the services can return quickly instead of making the customer wait.
- Improved Security: A message queue may be able to identify and authenticate all messages. As stated above they can be responsible for the encryption of the messages.
- Integrated file transfers: Some of them also include things such as file-transfers like FTP.

## Vs Other Messaging Models

### Vs Pub/Sub

Message queues use a point-to-point messaging pattern. One application submits a message (sender) and a different one receives it (receiver).

This creates a tightly coupled one-to-one relationship between the two instances and each message is only consumed once.

If the message is required to be sent to multiple parties then either multiple message queues or publisher/subscribers (pub/sub) should be used. For these it is possible for multiple subscribers to receive a message for an individual publisher. Every application that subs to a topic gets a copy of the message when it is sent.

Most messaging middleware services actully support both or have a products for each.

### Vs Message Bus

A message bus is a type of architecture pattern that allows a centralized software component to perform integrations between applications. 

An Enterprise Service Bus (ESB), will handle data transformation, connectivity, message routing, and converts communication protocols, and handles multiple requests.

### Vs Web Services

Applications also use traditional web services such as APIs such as HTTP and SOAP (Simple Object Access Protocol) of instead of a messaging middleware. 

Web services are the bed and butter of distributed systems. They are a viable option for simple systems but can cause issues as stated above. They cannot gurantee message delivery for example. Middleware services are generally more fault tolerant!

### Vs Databases

Databases can also be used as a form of message queue but require a greate deal of effort. It is generally better to have a service instead.

## Examples 

- Amaazon Simple Queue Service (AWS SQS).
- Note this is usually done as a 1-to-1 communication and for something like 1-to-many we would use `AWS Simple Notification Service` instead.

- IBM MQ service.

## References
- [Gaurav Sen YouTube](https://www.youtube.com/watch?v=oUJbuFMyBDk&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=5)
- [AWS](https://aws.amazon.com/message-queue/)
- [IBM](https://www.ibm.com/topics/message-queues)