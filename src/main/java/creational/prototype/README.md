# Prototype & Registry Design Patterns

## 📌 Overview
This repository demonstrates two important **Creational Design Patterns**:

1. **Prototype Pattern** – Create new objects by cloning existing ones instead of instantiating from scratch.
2. **Registry Pattern** – Maintain a central registry of objects (often prototypes) for easy lookup and reuse.

---

## 🔹 Prototype Design Pattern

### ✅ Definition
The **Prototype Pattern** allows creating new objects by **copying an existing object (prototype)** rather than building from scratch.

### 📊 Use Cases
- When object creation is **costly** (e.g., database calls, heavy initialization).
- To create **multiple variations** of objects at runtime.
- To avoid subclass explosion for object variants.

## 🔹 Registry Design Pattern

### ✅ Definition
The **Registry Pattern** is a creational pattern that acts as a **global storage or lookup** for objects, usually keyed by a name or ID.
It complements the Prototype pattern by allowing you to store prototypes in a registry and retrieve them when needed.

### 📊 Use Cases
- When you need a central location to manage frequently used objects.
- To avoid repeatedly creating heavy objects.
- Works well with **Prototype pattern** (Prototype Registry).