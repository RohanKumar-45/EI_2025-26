# Builder Pattern - Java Example

This project demonstrates the **Builder Design Pattern** in Java, specifically for constructing complex `Computer` objects with customizable configurations. The pattern separates the construction of an object from its representation, allowing the same construction process to create different representations.

## Structure

- `Computer.java` - The product class representing a computer with various components (CPU, RAM, Storage, GPU, Cooling).
- `ComputerBuilder.java` - The builder interface defining methods for building computer parts.
- `GamingPCBuilder.java` - Concrete builder implementing `ComputerBuilder` for high-end gaming PCs.
- `PCManufacturer.java` - The director class orchestrating the building process for predefined configurations.
- `BuilderPatternDemo.java` - Demo client showing usage of the builder and director for both gaming PCs and custom workstations.

## How It Works

1. **Builder Interface**: Defines methods for building each part of the computer.
2. **Concrete Builder**: Implements the interface, providing specific logic for gaming PCs.
3. **Director**: Uses the builder to construct a high-end gaming PC step-by-step.
4. **Client**: Can use the builder directly for custom configurations or use the director for predefined builds.

## Example Usage

- **High-End Gaming PC**: Built using the director (`PCManufacturer`) and the `GamingPCBuilder`.
- **Custom Workstation**: Built directly by the client using the builder for custom specs.

## Running the Demo

1. Compile all `.java` files:
   ```powershell
   javac *.java
   ```
2. Run the demo:
   ```powershell
   java BuilderPatternDemo
   ```

## Output

The demo prints the step-by-step construction process and the final configuration of each computer built.

## Class Diagram

See `Class_Diagram.png` for a visual representation of the pattern implementation.

---

