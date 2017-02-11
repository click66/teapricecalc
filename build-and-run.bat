REM On Windows execute:
REM build-and-run.bat

REM or to run using input from file input.txt:
REM build-and-run.bat input.txt

javac -cp libs/tea-calculator.jar src/main/java/com/example/teabags/App.java
java -cp src/main/java;libs/tea-calculator.jar com.example.teabags.App %1
