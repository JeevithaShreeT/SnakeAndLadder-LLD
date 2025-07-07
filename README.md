# Snake and Ladder – Java Console Application

This is a command-line based Snake and Ladder game implemented in Java. The design follows object-oriented programming (OOP) and low-level design (LLD) principles. The application supports multiple players, dynamic configuration of snakes and ladders, and simulates standard gameplay with turn-based dice rolling.

---

## Features

- Console-based gameplay for two or more players
- Customizable board with configurable snakes and ladders
- Accurate position tracking with ladder climbing and snake sliding
- Randomized dice rolls between 1 and 6
- Automatic player turn management using a queue
- Game ends when a player reaches position 100

---

## Class Overview

**Board**  
Stores the mapping of all snakes and ladders. If a player lands on a key in the map, they are redirected to the mapped value.

**Player**  
Represents an individual player, tracking name and current position.

**Dice**  
Simulates rolling a dice using `java.util.Random`.

**Game**  
Controls the game loop, manages turns, updates player positions, and declares the winner.

**SnakeandLadder (Main Class)**  
Handles user input, sets up the board, players, and starts the game.

---

## Technology Stack

- Java SE 17

- Standard Java collections and command-line I/O

- Designed using core object-oriented principles

- No external dependencies


## Author

- [Jeevitha Shree T](https://github.com/JeevithaShreeT)
