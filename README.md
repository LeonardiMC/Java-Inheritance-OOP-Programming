# 🐾 Java Inheritance OOP Project

## 📌 Overview
This project demonstrates **object-oriented programming (OOP)** concepts, specifically **inheritance and composition** in Java. It models animals (`Animal`, `Bird`, `Cat`, and `Dog`) using **superclasses and subclasses**, implementing proper getter/setter methods and validation.

## 📂 Project Structure
- `Animal.java` - The **superclass** that defines shared attributes (`weight`, `height`).
- `Bird.java` - **Extends `Animal`**, adding attributes like `wingspan` and `canFly`.
- `Cat.java` - **Extends `Animal`**, includes a `name` and `countLives` (limited to 0-9).
- `Dog.java` - **Extends `Animal`**, includes a `name`, `breed`, and `birthday`.
- `TestInheritance.java` - The **main class** that creates instances of these animals and prints their details.

## 🎯 Features
✅ **Object-Oriented Design** - Uses **inheritance** to structure animal classes.  
✅ **Encapsulation** - Private attributes with getter/setter methods.  
✅ **Validation** - Ensures valid `countLives`, `weight`, `height`, and `birthday`.  
✅ **Method Overriding** - Each subclass customizes the `toString()` method.  
✅ **Formatted Output** - The program displays animals' details in a structured way.

## 🔧 How to Run
1. **Clone this repository** or download the `.zip` file.
2. Open the project in an **IDE** (e.g., Eclipse, IntelliJ, VS Code).
3. Compile and run `TestInheritance.java` to see the output.

## ⚠️ Data Validation Rules
- **`countLives`** in `Cat.java` must be between **0 and 9**.
- **`weight` and `height`** must be positive values.
- **`Dog.java`** uses `LocalDate` to store and format birthdates.

## 📝 Example Output

## 📜 Author
- Leonardi Montenegro
- [GitHub Profile](https://github.com/LeonardiMC)
