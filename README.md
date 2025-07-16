# 🍽️ Swiggy-Style Real-Time Notification Demo

This is a basic Spring Boot + WebSocket project that demonstrates real-time notifications, similar to how food delivery apps like **Swiggy** notify users about their order status.

## 🚀 Features

- Real-time notifications using **WebSocket (SockJS + STOMP)**
- Admin panel to send order updates
- Client UI to simulate:
  - Restaurant menu 🧆
  - Cart and order placement 🛒
  - Live tracking with notifications 📦
- Notification sound 🔔 and animation ✨

## ⚙️ Tech Stack

- **Backend**: Java + Spring Boot + WebSocket (SockJS & STOMP)
- **Frontend**: HTML + JavaScript + Tailwind CSS
- **Real-Time**: STOMP over WebSocket

## 🧪 How to Run

### 1. Run Spring Boot Backend
Ensure your Spring Boot app exposes `/ws` endpoint and `/topic/notification` topic:
```bash
./mvnw spring-boot:run
