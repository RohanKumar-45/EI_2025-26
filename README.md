# Educational Initiatives Coding Exercise 2025-26

This repository contains Java implementations and demos for various software design patterns and a Mars Rover simulation system. The content is organized into two main sections:

---

## Excercise 1: Design Patterns

Explore classic design patterns with clear, practical Java examples. Each pattern includes code, documentation, and UML diagrams.

### Structure

- **Behavioural DesignPattern**
  - **Iterator Pattern**: Custom iterator for a book collection.
  - **Template Pattern**: Game loader using the template method pattern.
- **Creational Design Pattern**
  - **Builder Pattern**: Flexible computer builder for gaming PCs and workstations.
  - **Factory Pattern**: Notification system supporting Email and SMS.
- **Structural Design Pattern**
  - **Facade Pattern**: Home theater system with a unified interface.
  - **Proxy Pattern**: Lazy-loading image viewer using the proxy pattern.

Each pattern folder contains:
- Java source files (`.java`)
- Compiled classes (`.class`)
- UML class diagrams (`Class_Diagram.png`)
- Pattern-specific `README.md` with usage and explanations

---

## Excercise 2: Mars Rover System

A modular Java simulation of a Mars Rover, demonstrating command, composite, and other patterns.

### Structure

- **MarsRoverSystem/**
  - `Main.java`: Entry point for the simulation.
  - `commands/`: Command pattern for rover actions (move, turn, etc.).
  - `grid/`: Grid, coordinates, obstacles, and terrain composite.
  - `rover/`: Rover state, direction, and status reporting.
  - `utils/`: Utility classes (e.g., event logging).

Other files:
- `README.md`: Instructions and overview for the Mars Rover System.
- `Class_Diagram.png`, `ei-class.png`: Diagrams for system architecture.
- `MarsRoverSystem.zip`: Compressed project archive.

---

## How to Run

1. **Compile Java Files**
   ```sh
   javac <path-to-java-files>/*.java
   ```
2. **Run Demos**
   ```sh
   java <MainClassName>
   ```
   - For design patterns, see each pattern's `README.md` for details.
   - For Mars Rover, run `Main.java` in `MarsRoverSystem/`.

---

## Purpose

- Learn and demonstrate key software design patterns.
- Practice modular, maintainable Java programming.
- Simulate real-world systems (Mars Rover) using OOP and design principles.

---