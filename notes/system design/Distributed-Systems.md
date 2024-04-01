# Distributed Systems

This is an introduction to dealing with distributed systems using a pizza shop.

## Vertical Scaling

If we start off with a single pizza shop and a single chef who makes pizzas we can get quickly overloaded.

To solve this problem we can essentially start with implementing a form of vertical scaling by trying to get the chef to work longer hours or by firing this chef and hiring one that works faster / harder. However this is also still very limited. We could also try stuff like upgrading the ovens. 

We can try to optimize processes like making the pizza base in the middle of the night instead.

But what happens if the chef is sick? We can hire a backup chef. This would be `master-slave architecture`

## Horizontal Scaling / Microservices

As we get more and more orders we will want to have more chefs than just a single backup. This is more like `horizontal scaling` because we now have more nodes.

Lets say we start selling more products. We can start selling Cheese bread along with the pizza. If we have chefs that are better at one thing vs the other it would make more sense to send the product creation to the chef that is better at that product. This is the essense of `micro-services`.

## Distributed System / Localization / Backup

The next level of complexity would be to open another shop. This would be like a `distributed system`. 

Now if the first shop if down we can send all that traffic to the second shop assuming it is close enough to prevent our business from going down.

We will want to send the pizza request to the shop that takes less time for the customer because this is better for them.

We can improve things better with this architecture by decupling responsibilities. We can have a call center that handles all pizza orders and a delivery service that is responsible for dealing with getting the pizza from the store to the customer. This allows each piece to be scaled and distributed better.

We will also need logging and metrics to help us optimize the system and learn more about it.

## High Level Design

This is essentially high-level design. 

1. Overload Complexity -> Recruitment
2. Complexity -> Seperation of Concerns.
3. Mishaps -> Fault Tolerance.

Low level design would be more like OOP programming where we are designing all the classes, attributes, and methods.

## Referrences
- [Gaurav Sen: System Design Primer](https://www.youtube.com/watch?v=SqcXvc3ZmRU&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=2)