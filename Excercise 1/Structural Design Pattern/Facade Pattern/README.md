# Facade Pattern - Home Theater Example

This project demonstrates the **Facade Design Pattern** using a Home Theater system simulation in Java.

## Structure
- `Amplifier.java` : Represents the amplifier device.
- `Projector.java` : Represents the projector device.
- `Screen.java` : Represents the motorized screen device.
- `HomeTheaterFacade.java` : Facade class that simplifies the operation of the home theater system.
- `FacadePatternDemo.java` : Main class to run the demo.
- `Class_Diagram.png`: UML class diagram for the project.

## How It Works
- The user is prompted to enter descriptions for each device (Amplifier, Projector, Screen) and the movie name.
- The `HomeTheaterFacade` class provides simple methods to start and end a movie experience, hiding the complexity of interacting with individual devices.
- The demo shows how the Facade pattern simplifies client interaction with a complex subsystem.

## Usage
1. Compile all `.java` files:
   ```powershell
   javac *.java
   ```
2. Run the demo:
   ```powershell
   java FacadePatternDemo
   ```
3. Follow the prompts to enter device descriptions and the movie name.

## Example Output
```
Enter description for Amplifier: Denon Home Theater Amplifier
Enter description for Projector: Epson HD Projector
Enter description for Screen: Motorized Projection Screen
Enter movie name to watch: Master (2021)
Get ready to watch a movie: Master (2021)
Motorized Projection Screen lowering into viewing position.
Epson HD Projector is ON.
Epson HD Projector set to widescreen mode (16:9).
Denon Home Theater Amplifier is ON.
Denon Home Theater Amplifier set to surround sound mode.
Denon Home Theater Amplifier setting volume to 12

Shutting down the Home Theater...
Denon Home Theater Amplifier is OFF.
Epson HD Projector is OFF.
Motorized Projection Screen retracting.
```

## Facade Pattern Explanation
The Facade pattern provides a unified interface to a set of interfaces in a subsystem, making it easier for clients to use the subsystem without knowing its details. In this example, `HomeTheaterFacade` acts as the facade for the home theater devices.

## Author
- Example by Rohan (adapted for educational purposes)
