
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

---

## Comparison of 3 factory designs

| Simple Factory                         | Factory Method                                               | Abstract Factory                                          |
|----------------------------------------|--------------------------------------------------------------|-----------------------------------------------------------|
| Subclass usage                         | Subclass usage                                               | Subclass usage<br/>Family of products                     |
| **Implementation**:                    |                                                              |                                                           |
| 1. Product Interface                   | 1. Product Interface                                         | 1. Product Interface                                      |
| 2. Concrete products                   | 2. Concrete products                                         | 2. Concrete products                                      |
| 3. Factory class with a static method. | 3. Create a product factory interface.<br/>ex: ButtonFactory | 3. Create a family factory interface.<br/>ex: FormFactory |
|                                        | 4. Create concrete factories.<br/>ex: RoundButtonFactory     | 4. Create concrete factories.<br/>ex: LightFormFactory    |
| **Total number of classes:**           |                                                              |                                                           |
| 1                                      | n (number of products)                                       | m (number of families)                                    |
| **Downsides:**                         |                                                              |                                                           |
| SRP/OCP violations                     | Class explosion                                              | Class explosion<br/>Complex implementation                |
