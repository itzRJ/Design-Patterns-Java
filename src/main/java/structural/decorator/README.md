# 🎁 Decorator Design Pattern

## 📌 Overview
The **Decorator Pattern** is a **structural design pattern** that allows behavior to be **dynamically added** to individual objects without affecting the behavior of other objects from the same class.

It’s often called the **Wrapper Pattern** because decorators wrap the original object.

---

## 🔹 Definition
- **Intent:** Attach additional responsibilities to an object dynamically.
- **Also Known As:** Wrapper Pattern

---

## 📊 When to Use
- When you want to **add new responsibilities** to objects at runtime.
- To follow the **Open/Closed Principle** → open for extension, closed for modification.
- When subclassing would lead to an **explosion of classes**.

---

## 🍕 Real-World Analogy
Imagine you order a **basic pizza** 🍕.
- You can add **toppings** like cheese 🧀, olives, or mushrooms 🍄.
- Each topping is added **dynamically** without changing the original pizza recipe.

Here:
- **Pizza** → Component (base object)
- **Toppings** → Decorators
- **Final Pizza** → Decorated object with additional behavior

---


## ✅ Pros

- Follows Open/Closed Principle (add behavior without modifying existing code).
- More flexible than subclassing.
- Can combine multiple decorators at runtime.

## ⚠️ Cons

- Increases complexity (many small objects).
- Debugging can be harder since behavior is distributed.

## 🎯 Key Takeaway

Use the Decorator Pattern when you need to add responsibilities dynamically to an object without changing its code or affecting other objects in the system.

