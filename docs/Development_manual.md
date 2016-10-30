#Development manual

This is a development manual for a game called Tic Tac Toe made by the group Gryffindor in the course Software Engineering in the University of Reykjavík. 
The source control client in use is github. 

Everyone should be able to open their internet browser and use the url: 
[http://tictactoe-gryffindor.herokuapp.com](http://tictactoe-gryffindor.herokuapp.com)

##Access to source control

To get access to source control you have to contact one of the administrators who can give you access to the source code which is stored on github.

##Build environment
###To get the project to build these things are needed:
1. The JRE(Java Runtime environment) needs to be installed on your computer. 
    * If you don't already have it you can download it here: [http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
2. A github account is needed. If you don't have one, please go ahead an create one.
3. Fork the project to your computer at [https://github.com/GryffindorFOREVER/TicTacToe](https://github.com/GryffindorFOREVER/TicTacToe)
4. Clone the project to your machine.

5. Open up the build.gradle file with the editor of your choosing and change the name to 'is.ru.tictactoe.MainWeb' if you want to deploy the web version, for the console version it should read 'is.ru.tictactoe.Main'.

**If you would like to run the project locally and in separate steps, do the following:**

1. Clean the project using the following command:

    * *./bin/clean*
    
    The message should read 'Build Successful'.

2. Build the project using the following command:

    * *./bin/build*
    
    The message should read 'Build Successful'.

3. Compile the project using the following command:

    * *./bin/compile*
    
    The message should read 'Build Successful'.

4. Compile and run unit tests using the following command:

    * *./bin/unit_test*
    
    The message should read 'Build Successful'.
    
5. Compile and run JaCoCo (Java Code Coverage Library) using the following command:
    
    * *./bin/jacoco_test*
    
    The message should read 'Build Successful'.
    
6. Compile and run Selenium web driver using the following commands (only applies to web version):
    
    First open two terminals. 

    In the first one you use the following command:
    * *./bin/check_run*
    
    When a connection to the server has been established us should see a message that ends with the following line: _INFO org.eclipse.jetty.server.Server - Started..._
    
    Then use the following command in the other terminal:
    * *./bin/selenium_test*
    
    The message should read 'Build Successful'.
 
7. Run all tests (unit and JaCoCo tests) using the following command:

     * *./bin/all_tests*
     
    The message should read 'Build Successful'.
     
8. Now finally execute the program using the following command:

    * *./bin/deploy*
    
    The message should read 'Build Successful'. 
    
    **Console:** The game should be executed in your terminal prompt window.
    
    **Web:** You should be able to open your internet browser and use the url: [localhost:4567](localhost:4567) for executing the game.

**If you want to go straight ahead and execute the program without using separate steps do the following:**


1. To build, compile and run the project all at once use the following commands:

    * *./bin/deploy*
    
    The message should read 'Build Successful'.
    
    **Console:** The game should be executed in your terminal prompt window.
    
    **Web:** You should be able to open your internet browser and use the url [localhost:4567](localhost:4567) for executing the game.


###Tests overview
1. Travis takes care of the unit tests automatically and pushes the code on to a heroku server which deploys the game. Here is the link to the project on Travis [https://travis-ci.org/GryffindorFOREVER/TicTacToe/builds](https://travis-ci.org/GryffindorFOREVER/TicTacToe/builds)
2. Code Coverage can be accessed on the site [https://codecov.io/gh/GryffindorFOREVER/TicTacToe](https://codecov.io/gh/GryffindorFOREVER/TicTacToe)









