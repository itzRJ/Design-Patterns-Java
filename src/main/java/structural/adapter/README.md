# 🔌 Adapter Design Pattern

## 📌 Overview
The **Adapter Pattern** is a **structural design pattern** that allows objects with **incompatible interfaces** to work together.  
It acts as a **bridge** between the existing system and a new interface without changing their source code.

---

## 🔹 Definition
- **Intent:** Convert the interface of a class into another interface clients expect.
- **Also Known As:** Wrapper Pattern

---

## 📊 When to Use
- When you want to **reuse existing classes** but their interface doesn’t match the current system.
- To integrate with **legacy code** or **third-party libraries**.
- When you need to **decouple systems** with different interfaces.

---

## 🍕 Real-World Analogy
Imagine you travel abroad with your laptop charger.
- Your charger plug is **Type A**.
- The socket in the country is **Type C**.
- You need a **Plug Adapter** that allows your charger to fit into the new socket.

Here:
- **Charger Plug** → Existing Interface
- **Socket** → Target Interface
- **Adapter** → Bridge that connects both

---

## ✅ Pros

- Reuses existing code without modifying it
- Increases code reusability and flexibility
- Makes incompatible classes work together

## ⚠️ Cons

- Increases complexity (extra layer of abstraction)
- Too many adapters may make the design messy

## 🎯 Key Takeaway

Use the Adapter Pattern when you need to integrate incompatible systems without altering their existing code. It’s widely used when working with legacy code, external APIs, or third-party libraries.
