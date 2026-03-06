:rocket: Number Guessing Game

:video_game: How the game works 
1. The player chooses difficulty
2. The system generates secrete number
3. The player enters his/her guesses
4. Allows one to enter guesses until  he/she makes correct guess or runs out of attempts
5. Keeps track of valid attempts
6. The game provides feedback
    - Too high!
    - Too low!
    - Warm/cold hints
7. After winning the player can choose to play again

:rocket: Optional features added
1. :level_slider: Difficulty levels
     - Easy (1➡️50)
     - Normal (1➡️100)
     - Hard (1➡️500)
2. :timer_clock: Limited attempts 
     - Easy ➡️ 7 attempts
     - Normal ➡️ 10 attempts
     - Hard ➡️ 15 attempts
3. :fire: Warm/cold hints
     - very close ➡️ within 5 numbers
     - close ➡️ within 10 numbers
     - far ➡️ otherwise
4. :arrows_counterclockwise: Replay Option
     - After winning the player can choose to play again

:arrow_forward: How to Run
1. Clone the repository
    - Copy the Github repository URL
    - Open IntelliJ
    - Go to Files - New - project - project from version control
    - Paste the URL
    - clone
2. Run NumberGuessgame

:brain: Thinking Task
1. When to use nested conditions
    - Are used when second conditions should be checked when the first one is true
    - Example ➡️ in login system check first if user exists then if password is correct
2. When nested conditions makes code worse
    - When there are many if statements inside each other for input validation
3. :hammer_and_wrench: Technique to reduce nesting
     - Use continue/return to exit early when conditions are invalid
   
:bust_in_silhouette: Author
Griffins Kyei