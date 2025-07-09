# Chess System Design

## 1. Functional Requirements

- The system should allow two players to play a game of chess.
- It should enforce the official rules of chess (legal piece movement, turns, check, checkmate, stalemate).
- It should allow players to start a new game.
- It should track and display the current board state.
- The system should detect and notify when the game is over (checkmate or draw).
- It should allow players to resign.
- It should allow undo/redo moves (optional).
- It should allow saving and loading a game (optional).

## 2. Non-Functional Requirements

- The system should have a user-friendly interface (UI or console).
- It should ensure responsiveness and minimal delays when processing moves.
- It must be written in an object-oriented programming style.
- Code should be maintainable, modular, and easy to extend (e.g., adding AI).
- The system should support future enhancements like multiplayer over network or AI opponent.

---

## 3. Use Cases

### Use Case 1: Start Game
**Actor**: Player  
**Description**: Players start a new chess game.  
**Precondition**: None  
**Postcondition**: A new board is initialized.

### Use Case 2: Move Piece
**Actor**: Player  
**Description**: Player selects a piece and moves it according to the rules.  
**Precondition**: It is the player's turn and the move is legal.  
**Postcondition**: The piece is moved, and the turn changes.

### Use Case 3: Check Game Status
**Actor**: System  
**Description**: After each move, the system checks if the game is over.  
**Postcondition**: If checkmate, stalemate, or draw is detected, the game ends.

### Use Case 4: Resign Game
**Actor**: Player  
**Description**: A player resigns.  
**Postcondition**: The opponent wins the game.

---

## 4. Objects, Classes, and Relationships

### Identified Classes:
- `Game`
- `Board`
- `Square`
- `Player`
- `Move`
- `Piece` (abstract)
    - `Pawn`, `Knight`, `Bishop`, `Rook`, `Queen`, `King`

### Relationships:
- A `Game` has 2 `Players`, 1 `Board`, and a list of `Moves`.
- A `Board` contains 8x8 `Squares`.
- A `Square` may contain 0 or 1 `Piece`.
- Each `Piece` knows its position and owner (`Player`).
- `Move` stores information about a move: from, to, piece moved, etc.

---