
# 🏭 Factory Pattern (Creational)

## 💡 Intent
Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory pattern delegates the responsibility of instantiating objects to a **factory class**.

## 🧰 Use Cases
- Centralized object creation logic
- Decoupling client code from concrete classes
- Plugin architectures

## 🏗️ Structure
- `Button.java` – Interface
- `RectangulaButton.java`, `RoundButton.java` – Implementations
- `ButtonFactory.java` – Central factory method
- `ButtonFactoryTest.java` – Demonstrates creation via factory

