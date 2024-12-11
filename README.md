

# Temperature Conversion Program

### **Task-01 by Prodigy Infotech**

This project is a simple temperature conversion program that converts temperatures between Celsius, Fahrenheit, and Kelvin scales. The program allows the user to input a temperature value along with its unit (Celsius, Fahrenheit, or Kelvin) and then converts it to the other two units, displaying the results.

### **Features**
- Converts temperatures between Celsius, Fahrenheit, and Kelvin.
- Takes user input for temperature and unit.
- Converts the input to the other two temperature scales.
- Outputs the converted temperatures in an easy-to-read format.
  
### **Example**
If the user enters a temperature of 25 degrees Celsius, the program will convert it to:
- 77.00°F (Fahrenheit)
- 298.15K (Kelvin)

### **Technology Used**
- **Java** programming language.
- Simple console-based input and output.

### **How It Works**
1. The program prompts the user to input the temperature value and its unit (C for Celsius, F for Fahrenheit, K for Kelvin).
2. Based on the input unit, the program calculates the corresponding temperatures in the other units.
3. The program displays the converted values.

### **Code Explanation**
- **Methods for Conversion**:
    - Each unit conversion has its dedicated method for accurate calculation.
    - The methods cover conversions from Celsius to Fahrenheit, Celsius to Kelvin, and so on.
  
- **User Input**:
    - The user is prompted to enter the temperature and its corresponding unit. 
    - Based on the input unit, the program performs the required conversions and displays the results.
  
### **Example Execution:**

```
Enter the temperature value: 25
Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): C
25.00°C = 77.00°F = 298.15K
```

### **How to Run the Program**
1. Download or clone the repository.
2. Open the Java file (`TemperatureConverter.java`) in any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor.
3. Compile and run the Java program.
4. Enter a temperature value and the unit when prompted. The program will output the converted temperatures in the other units.

### **Example Run:**
```
Enter the temperature value: 100
Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): F
100.00°F = 37.78°C = 310.93K
```

### **Installation and Setup**
1. Make sure you have **Java 8 or higher** installed on your computer.
2. Clone or download this repository.
3. Navigate to the directory where the file is stored using a terminal or command prompt.
4. Run the following commands:

   - Compile the program:
     ```bash
     javac TemperatureConverter.java
     ```
   - Run the compiled program:
     ```bash
     java TemperatureConverter
     ```


