# Password-Generator

This is a short project where the program generates a password with or without special characters. This also uses the SecureRandom in Java which generates cryptographically secure random patterns.

## Table of Contents
- [How to use](#how-to-use)
- [Functions](#functions)
- [Example Use](#example-use)

## How to use

1. Clone this repository or download the PasswordGenerator.java file
2. Compile the Java code using a Java compiler: ` javac PasswordGenerator.java `
3. Run the program: ` java PasswordGenerator`
4. The program will prompt you to enter the desired length of the password and whether you want to include special characters. Follow the prompts and provide the required input.
5. The program will generate a random password based on your input and display it on the screen.

## Functions:

* The `PasswordGenerator` class in the `PasswordGenerator.java` file provides a single function for generating passwords:

* `generatePassword(int length, boolean includeSpecialChars)`
This function generates a random password based on the specified parameters and returns it as a string.

## Example use:

```bash
Enter the length of the password: 16
Special characters? (yes/no): yes
Generated Password: 72O0W1!0cIBtGzr6
```
