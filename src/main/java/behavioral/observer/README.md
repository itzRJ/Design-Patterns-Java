# 👀 Observer Design Pattern

## 📌 Overview
The **Observer Pattern** is a **behavioral design pattern** where an object, called the **Subject**, maintains a list of dependents, called **Observers**, and automatically notifies them of any state changes.

This creates a **one-to-many dependency** between objects.

---

## 🔹 Definition
- **Intent:** Define a one-to-many dependency between objects so that when one object (subject) changes state, all its dependents (observers) are notified and updated automatically.
- **Also Known As:** Publish–Subscribe (in simpler forms)

---

## 📊 When to Use
- When changes in one object require updates in others, and you don’t want them tightly coupled.
- For event-driven systems (GUI listeners, messaging systems).
- To implement publish/subscribe or event notification mechanisms.

---

## 🍕 Real-World Analogy
Think of a **YouTube Channel**:
- The **Channel** is the **Subject**.
- The **Subscribers** are the **Observers**.
- When the channel uploads a new video, all subscribers **automatically get notified**.

## In this implementation:
- `BitcoinTracker` is the subject that tracks Bitcoin price changes.
- `EmailService` is an observer that gets notified when the price changes.
- `Bitcoin` is a model representing the Bitcoin entity.

## Structure

- `behavioral.observer.BitcoinTracker` - Subject that manages observers and notifies them of price changes.
- `behavioral.observer.EmailService` - Observer that reacts to price updates.
- `behavioral.observer.models.Bitcoin` - Data model for Bitcoin.

## Usage

1. Create a `Bitcoin` instance.
2. Instantiate `BitcoinTracker` with the Bitcoin object.
3. Subscribe observers (e.g., `EmailService`) to the tracker.
4. Change the price using `setPrice()`. Observers are notified automatically.

## Example

```java
BitcoinTracker tracker = new BitcoinTracker(Bitcoin.builder().price(50000.0).build());
tracker.subscribe(new EmailService());
tracker.setPrice(51000.0); // Notifies EmailService
