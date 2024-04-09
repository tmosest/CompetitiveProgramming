# Tinder System Design

## Guarav Example

We are going to try to cover 4 different parts.

1. Store Profile
2. Recommend Matches
3. Note Matches
4. Direct Messaging

We can either store this as a `File` or as a `Blob`

1. Store Profile - Images 5 Per Person 
2. Recommend Matches - Number of Active Users
3. Note Matches - 10 ^ -3 per Number of Active Users.
4. Direct Messaging

We make a call to a Gateway Service that will delegate calls to other services. We can use the Profile Service to determine if someone should be logged in or now. It would be better to break this into another service latter. It would also be best to store the images in another service to future proof any issues there. We could run them through a machine learning algorithm later for example.

## Exponent Example

Exponent Example

* Profile
    * Bio / Preferences
    * Images
    * Videos
* Feed Recommendations
* Matching
* Private Messaging
    * Imgaes
    * Videos
* Extra:
    * Super Like
    * System Monitoring / Logging
    * Subscription Model

Traffic Estimates:
* 50 M users
* 1 M active users
* 500 K new profiles everyday
* 1 billion matches per day

Profile Photo Storage:
* 200kb * 6 * 50 M = 300-600 TB

Messaging:
* 200 Messages exchanged
* 10 M photos uploaded

```JSON
Profile: {
    profile_id: String,
    user_id: String,
    preferences: {
        gender: String,
        lower_age: Int,
        upper_age: Int.
        ...
    },
    Bio: {
        gender: String,
        age: Int,
        lat: Float,
        long: Float,
        ...
    },
    photo_id: [Long]
}
```

## References 
- [Gaurav Sen](https://www.youtube.com/watch?v=tndzLznxq40&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=8)
- [Exponent](https://www.youtube.com/watch?v=iyLqwyFL0Zc&t=305s)