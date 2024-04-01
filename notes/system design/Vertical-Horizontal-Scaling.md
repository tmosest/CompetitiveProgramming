# Scaling 

If we have a service like an API there are essentially two ways to scale that system.

1. Buy Biggers Machines (Vertical Scaling)
2. Buy More Machines (Horizontal Scaling)

## Horizontal Scaling
- Increase or decrease the number of nodes in a cluster or system to handle an increase or decrease in workload
- Add or reduce the number of virtual machines (VM) in a cluster of VMs
- Scale in/out
- Workload is distributed across multiple nodes.
- Distributes multiple jobs across multiple machines over the network, at a go. This reduces the workload on each machine
- Distributed
- Takes more time, expertise, and effort
- Higher Complexity
- Configuration requires modifying a sequential piece of logic in order to run workloads concurrently on multiple machines.
- No downtime to add or subtract nodes.
- Needs a loadbalancer to work.
- Not likely to fail because we have other machines in the system.
- Higher costs initially but optimized over time.
- Can be slower at times because parts of the code might live on another machine.
- Limited by the number of machines you can add.

## Vertical Scaling
- Increase or decrease the power of a system to handle increased or reduced workload.
- Add or reduce the CPU or memory capacity of the existing VM.
- Scale up/down.
- A single node handles the entire workload.
- Relies on multi-threading on the existing machine to handle multiple requests at the same time.
- Works with any architecture.
- Takes less time and expertise to implement.
- Lower complexity in the system but mayber higher complexity in the code base.
- Configuration logic doesn't need to change.
- There is downtime when upgrading the system.
- Doesn't need a load balancer.
- Higher chance of failure since we have a single point.
- Low cost initially. Can be less cost effective over time.
- Slower machine-to-machine communication but most functions are running on the same machine.
- Performance is generally slower because the single computer is a bottle-neck.
- Limited by what the single machine can handle.

## References
- [CloudZero](https://www.cloudzero.com/blog/horizontal-vs-vertical-scaling/#:~:text=While%20horizontal%20scaling%20refers%20to,%2C%20storage%2C%20or%20network%20speed)
- [Gaurav Sen (Youtube)](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)