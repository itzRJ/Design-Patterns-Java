# Abstract Factory Design Pattern

## 📌 Overview
The **Abstract Factory Pattern** is a **creational design pattern** that provides an **interface for creating families of related objects** without specifying their concrete classes.

It is also known as the **Factory of Factories**, since it creates multiple factories that, in turn, produce related objects.

---

## 🔹 Definition
- **Factory Method Pattern** → Creates one type of object.
- **Abstract Factory Pattern** → Creates **families of related objects**.

It ensures that the objects created by a factory are compatible with each other.

---

## 📊 When to Use
- When your system needs to be **independent of how objects are created**.
- When you want to **enforce compatibility** between objects (e.g., UI elements for different OS).
- When there are **multiple families of products** and you need a way to switch between them easily.

---

## 🍕 Real-World Analogy
Imagine you go to **Pizza Hut** and order a **Meal Combo**.

- If you order an **Italian Combo**, you get:
    - Italian Pizza 🍕
    - Italian Drink 🥤

- If you order an **Indian Combo**, you get:
    - Indian Pizza 🍕
    - Indian Drink 🥤

Here:
- The **Combo Meal** is the **Abstract Factory**.
- Each **Restaurant (Italian/Indian)** is a **Concrete Factory**.
- The **Pizza and Drink** are the **related products** created.

---

## 💡 Example (Java)

### 1. Abstract Product Interfaces
```java
// Abstract Products
interface Button {
    public void onClick();
    public void render();
}

interface Checkbox {
    public void onClick();
    public void render();
}
```

### 2. Concrete Product Classes
```java
public class DarkButton implements Button {
    @Override
    public void onClick() {
    }
    @Override
    public void render() {
    }
}

public class LightButton implements Button {
    @Override
    public void onClick() {
    }
    @Override
    public void render() {
    }
}

public class LightCheckbox implements Checkbox{
    @Override
    public void onClick() {
    }
    @Override
    public void render() {
    }
}

public class DarkCheckbox implements Checkbox{
    @Override
    public void onClick() {
    }
    @Override
    public void render() {
    }
}
```
### 3. Create Abstract factory interface
```java
public interface FormFactory {
    //add factory methods for the products
    Button createButton();
    Checkbox createCheckbox();
}
```

### 4. Create concrete factory classes
```java
//this specific factory will ensure that the products that are returned are from 'Dark' family
public class DarkFormFactory implements FormFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
//this specific factory will ensure that the products that are returned are from 'Light' family
public class LightFormFactory implements FormFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
```

### 5. Testing the factories
```java
public class AbstractFactoryTest {
    private FormFactory factory;
    
    @After
    public void deInitialize()
    {
        factory = null;
    }
    @Test
    public void testDarkFamily()
    {
        factory = new DarkFormFactory();

        Button darkBtn = factory.createButton();
        Assert.assertNotNull(darkBtn);
        Assert.assertTrue(darkBtn instanceof DarkButton);

        Checkbox darkCheckbox = factory.createCheckbox();
        Assert.assertNotNull(darkCheckbox);
        Assert.assertTrue(darkCheckbox instanceof DarkCheckbox);
    }
    @Test
    public void testLightFamily()
    {
        factory = new LightFormFactory();

        Button lightBtn = factory.createButton();
        Assert.assertNotNull(lightBtn);
        Assert.assertTrue(lightBtn instanceof LightButton);

        Checkbox lightCheckbox = factory.createCheckbox();
        Assert.assertNotNull(lightCheckbox);
        Assert.assertTrue(lightCheckbox instanceof LightCheckbox);
    }
}
```