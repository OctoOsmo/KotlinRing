# 📡 Kotlin Ring Messenger

A collaborative Kotlin workshop project where participants create a distributed message-forwarding application in a ring network.

---

## 🚀 Task Description

Each participant runs a Spring Boot service written in Kotlin. All participants are connected to the same Wi-Fi network and form a logical ring. Each service can:

- Accept a message via a POST endpoint
- Append metadata to the message
- Forward the message to the next participant in the ring
- Print the message if the participant is the intended receiver

---

## 📦 Message Format

```json
{
  "from": "alice",
  "to": "bob",
  "text": "hello",
  "hops": [
    {
      "login": "alice",
      "timestamp": "2025-04-22T14:30:00Z"
    }
  ]
}
```

Each time the message is forwarded, the service should:
- Add its own login and current timestamp to the `hops` array
- Forward the message if it is **not** the intended recipient
- Print the full message with hops if it **is** the final recipient

---

## ✅ Setup Instructions

1. **Clone the repository**  
   ```bash
   git clone https://github.com/OctoOsmo/KotlinRing.git
   cd KotlinRing
   ```

2. **Run the project**
   ```bash
   ./gradlew bootRun
   ```

3. **Send a message**
   ```bash
   curl -X POST http://localhost:8080/message      -H "Content-Type: application/json"      -d '{"from":"alice","to":"bob","text":"hello","hops":[]}'
   ```

---

## 🔗 Useful Resources

- 📘 Kotlin Language: [https://kotlinlang.org](https://kotlinlang.org)  
- 📘 Kotlin + Spring Boot Guide: [Spring Boot Kotlin Tutorial](https://spring.io/guides/tutorials/spring-boot-kotlin)  
- 🧪 Test REST API: [curl.se](https://curl.se/) or use Postman  

---

## 🙌 Contributing

Fork this repo, improve the logic, or add more features and submit a pull request. Let's build this ring together!

---

## 🧠 Workshop Reminder

- Keep the logic simple and clean
- Focus on learning Kotlin language basics and syntax differences from Java
- Collaborate and help your ring neighbors!
