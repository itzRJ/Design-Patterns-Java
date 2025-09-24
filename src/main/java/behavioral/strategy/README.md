# 🎯 Strategy Design Pattern

## 📌 Overview
The **Strategy Pattern** is a **behavioral design pattern** that allows you to define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

It lets the algorithm vary independently from clients that use it.

---

## 🔹 Definition
- **Intent:** Define a family of algorithms, encapsulate each one, and make them interchangeable.
- **Also Known As:** Policy Pattern

---

## 📊 When to Use
- When you have multiple algorithms for a specific task, and you want to choose one dynamically.
- To eliminate conditional statements like `if-else` or `switch` blocks.
- To follow **Open/Closed Principle** — add new strategies without modifying existing code.

---

## 🍕 Real-World Analogy
Think of a **navigation app (Google Maps)**:
- You can choose between **driving, walking, cycling, or public transport**.
- Each **mode** is a **strategy** for calculating the route.
- You can switch strategies at runtime depending on the user’s choice.

---

## In this implementation:
- `Navigator` is the context that uses a navigation strategy.
- `NavigationStrategy` is the interface for different navigation algorithms.
- Concrete strategies (e.g., `CarNavigationStrategy`, `BikeNavigationStrategy`, `OnFootNavigationStrategy`) implement specific navigation methods.

## Structure

- `behavioral.strategy.Navigator` — Context that uses a `NavigationStrategy` to navigate.
- `behavioral.strategy.NavigationStrategy` — Strategy interface for navigation algorithms.
- `behavioral.strategy.CarNavigationStrategy` — Concrete strategy for car navigation.
- `behavioral.strategy.BikeNavigationStrategy` — Concrete strategy for bike navigation.
- `behavioral.strategy.OnFootNavigationStrategy` — Concrete strategy for walking navigation.

## Usage

1. Create a `Navigator` with a specific `NavigationStrategy`.
2. Call `navigate(from, to)` to perform navigation using the selected strategy.
3. Change the strategy at runtime if needed.

## Example

```java
Navigator context = new Navigator(new CarNavigationStrategy());
context.navigate("Home", "Office"); // Navigates by car

context.setStrategy(new OnFootNavigationStrategy());
context.navigate("Park", "Mall"); // Navigates by walking
