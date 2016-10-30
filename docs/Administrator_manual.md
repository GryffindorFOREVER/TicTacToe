#Administrator report

This manual will give the needed information on how to deploy, run and maintain the code in this project. It will also provide the information needed on how to install and run the program.

##Wizard TicTacToe

###Deploy, run and maintain

When deploying and running the project on a fresh computer it is needed to follow certain steps. 

1. A github account is needed.
2. Fork and then clone the project to the computer. It can be done [here](https://github.com/GryffindorFOREVER/TicTacToe). 
3. Download the JRE(Java Runtime environment)
    * It can be downloaded [here](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html).
4. To deploy and run the project locally the following command is needed:
    * *./bin/deploy*
    * Then you should be able to run the program on this link [localhost:4567](localhost:4567).
5. The bin folder is useful if it is needed to debug a code that is new. To run scripts in the bin folder it is needed to write */bin/* and then the name of the script wanted to be executed. The bin folder holds scripts that are used when running, compiling and deploying the project in separate steps.
6. Traves CI takes care of pushing new versions on to the Heroku server. Pushing to the github project automatically starts the Travis CI process.

###How to play the game

1. Visit the game's webpage [http://tictactoe-gryffindor.herokuapp.com/](http://tictactoe-gryffindor.herokuapp.com).
2. The game is a competition between two players, Gryffindor and Slytherin.
3. Choose a cell in the board to click, when you click it your crest will appear in that cell.
4. Gryffindor always makes the first move and then the players take turns making a move. The page will inform the players who is supposed to make the next move.
5. To win the game you need to be the first player to get three identical crests in a row, either vertically, horizontally or diagonally. 
6. When the game is over you can start a new game by clicking the _New game_ button.
7. 
![game_begin](http://i66.tinypic.com/nmawk6.png) 

![slytherin_winner](http://i64.tinypic.com/161l2iu.png)


