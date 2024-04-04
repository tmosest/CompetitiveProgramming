# Database Sharding

Database sharding is a type of horizontal partitioning that splits large databases into smaller components, which are faster and easier to manage. A shard is an individual partition that exists on separate database server instance to spread load. Auto sharding or data sharding is needed when a dataset is too big to be stored in a single database.

As both the database size and number of transactions increase, so does the response time for querying the database. Costs associated with maintaining a huge database can also skyrocket due to the number and quality of computers you need to manage your workload. Data shards, on the other hand, have fewer hardware and software requirements and can be managed on less expensive servers.

## Benefits of Sharding

- Allows for Horizontal Scaling.
- Simple for simple machines that are less expensive.
- More flexible.
- Speeds up query time.
- Can make an application more reliable.

## Drawbacks of Sharding

- More complex than having a sinlge database.
- Shards can become unbalanced. Database Hotspots.
- Difficult to return to unsharded architecture.
- Isn't natively supported by every database.

## Sharding Architectures

### Key Based

Key based sharding, also known as hash based sharding, involves using a value taken from newly written data — such as a customer’s ID number, a client application’s IP address, a ZIP code, etc. — and plugging it into a hash function to determine which shard the data should go to. A hash function is a function that takes as input a piece of data (for example, a customer email) and outputs a discrete value, known as a hash value. In the case of sharding, the hash value is a shard ID used to determine which shard the incoming data will be stored on.

To ensure that entries are placed in the correct shards and in a consistent manner, the values entered into the hash function should all come from the same column. This column is known as a shard key. In simple terms, shard keys are similar to primary keys in that both are columns which are used to establish a unique identifier for individual rows. Broadly speaking, a shard key should be static, meaning it shouldn’t contain values that might change over time. Otherwise, it would increase the amount of work that goes into update operations, and could slow down performance.

While key based sharding is a fairly common sharding architecture, it can make things tricky when trying to dynamically add or remove additional servers to a database. As you add servers, each one will need a corresponding hash value and many of your existing entries, if not all of them, will need to be remapped to their new, correct hash value and then migrated to the appropriate server. As you begin rebalancing the data, neither the new nor the old hashing functions will be valid. Consequently, your server won’t be able to write any new data during the migration and your application could be subject to downtime.

The main appeal of this strategy is that it can be used to evenly distribute data so as to prevent hotspots. Also, because it distributes data algorithmically, there’s no need to maintain a map of where all the data is located, as is necessary with other strategies like range or directory based sharding.

### Range Based

Range based sharding involves sharding data based on ranges of a given value. To illustrate, let’s say you have a database that stores information about all the products within a retailer’s catalog. You could create a few different shards and divvy up each products’ information based on which price range they fall into.

The main benefit of range based sharding is that it’s relatively simple to implement. Every shard holds a different set of data but they all have an identical schema as one another, as well as the original database. The application code reads which range the data falls into and writes it to the corresponding shard.

On the other hand, range based sharding doesn’t protect data from being unevenly distributed, leading to the aforementioned database hotspots. Looking at the example diagram, even if each shard holds an equal amount of data the odds are that specific products will receive more attention than others. Their respective shards will, in turn, receive a disproportionate number of reads.

### Directory Based

To implement directory based sharding, one must create and maintain a lookup table that uses a shard key to keep track of which shard holds which data. A lookup table is a table that holds a static set of information about where specific data can be found.

Here, the Delivery Zone column is defined as a shard key. Data from the shard key is written to the lookup table along with whatever shard each respective row should be written to. This is similar to range based sharding, but instead of determining which range the shard key’s data falls into, each key is tied to its own specific shard. Directory based sharding is a good choice over range based sharding in cases where the shard key has a low cardinality — meaning, it has a low number of possible values — and it doesn’t make sense for a shard to store a range of keys. Note that it’s also distinct from key based sharding in that it doesn’t process the shard key through a hash function; it just checks the key against a lookup table to see where the data needs to be written.

The main appeal of directory based sharding is its flexibility. Range based sharding architectures limit you to specifying ranges of values, while key based ones limit you to using a fixed hash function which, as mentioned previously, can be exceedingly difficult to change later on. Directory based sharding, on the other hand, allows you to use whatever system or algorithm you want to assign data entries to shards, and it’s relatively easy to dynamically add shards using this approach.

While directory based sharding is the most flexible of the sharding methods discussed here, the need to connect to the lookup table before every query or write can have a detrimental impact on an application’s performance. Furthermore, the lookup table can become a single point of failure: if it becomes corrupted or otherwise fails, it can impact one’s ability to write new data or access their existing data.

### Should I Shard

Some see sharding as an inevitable outcome for databases that reach a certain size, while others see it as a headache that should be avoided unless it’s absolutely necessary, due to the operational complexity that sharding adds.

Because of this added complexity, sharding is usually only performed when dealing with very large amounts of data. Here are some common scenarios where it may be beneficial to shard a database:

- The amount of application data grows to exceed the storage capacity of a single database node.
- The volume of writes or reads to the database surpasses what a single node or its read replicas can handle, resulting in slowed response times or timeouts.
- The network bandwidth required by the application outpaces the bandwidth available to a single database node and any read replicas, resulting in slowed response times or timeouts.

Before sharding, you should exhaust all other options for optimizing your database. Some optimizations you might want to consider include:

- Setting up a remote database. If you’re working with a monolithic application in which all of its components reside on the same server, you can improve your database’s performance by moving it over to its own machine. This doesn’t add as much complexity as sharding since the database’s tables remain intact. However, it still allows you to vertically scale your database apart from the rest of your infrastructure.
- Implementing caching. If your application’s read performance is what’s causing you trouble, caching is one strategy that can help to improve it. Caching involves temporarily storing data that has already been requested in memory, allowing you to access it much more quickly later on.
- Creating one or more read replicas. Another strategy that can help to improve read performance, this involves copying the data from one database server (the primary server) over to one or more secondary servers. Following this, every new write goes to the primary before being copied over to the secondaries, while reads are made exclusively to the secondary servers. Distributing reads and writes like this keeps any one machine from taking on too much of the load, helping to prevent slowdowns and crashes. Note that creating read replicas involves more computing resources and thus costs more money, which could be a significant constraint for some.
- Upgrading to a larger server. In most cases, scaling up one’s database server to a machine with more resources requires less effort than sharding. As with creating read replicas, an upgraded server with more resources will likely cost more money. Accordingly, you should only go through with resizing if it truly ends up being your best option.

Bear in mind that if your application or website grows past a certain point, none of these strategies will be enough to improve performance on their own. In such cases, sharding may indeed be the best option for you.

## References
- [Azure](https://azure.microsoft.com/en-us/resources/cloud-computing-dictionary/what-is-database-sharding/?ef_id=_k_Cj0KCQjw2a6wBhCVARIsABPeH1tkr73EitpAq33rJT6KVNNb9-ygQ72vgClmElj6cctOARjmASnz_qEaAhf-EALw_wcB_k_&OCID=AIDcmme9zx2qiz_SEM__k_Cj0KCQjw2a6wBhCVARIsABPeH1tkr73EitpAq33rJT6KVNNb9-ygQ72vgClmElj6cctOARjmASnz_qEaAhf-EALw_wcB_k_&gad_source=1&gclid=Cj0KCQjw2a6wBhCVARIsABPeH1tkr73EitpAq33rJT6KVNNb9-ygQ72vgClmElj6cctOARjmASnz_qEaAhf-EALw_wcB)
- [Digital Ocean](https://www.digitalocean.com/community/tutorials/understanding-database-sharding)
