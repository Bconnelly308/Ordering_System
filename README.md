# Ordering_System and PoS
## Final Project for Object Oriented Development
### Project Summary:
Java project: Created an ordering system, following is a PoS. GUI uses Java Swing.
Project to meet below guidelines:
- Use 4 design patterns contained within the design patterns book. (50%)
- Program a fully working application in Java to highlight the design patterns you learned (no compile/not running is an automatic fail) Also, no code falls into the category of no compile/not running
- Implement some unit tests. Doesn't have to be complete coverage, minimum test half of the number of implemented patterns rounded down design patterms (25%)
- Write up reflecting the challenges and difficulties you faced and how you learned from them(25%)
### How to run
- Download project
- Run the Main, [App.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/App.java)
### Project Reflection
- Creating the UML
  - In the beginning, creating the UML seemed daunting. I only had a general idea of how I wanted my project to run, and did not know which patterns that I was going to use. My UML went through a few phases of changes as I worked on my project. I originally thought the UML is supposed to guide the developer through a project, however I learned that a UML will change. Unless you are a perfect developer, I don't think the UML is going to be an exact match of the final product.
- Starting
  - Having only a general idea of my project was overwhelming at first. However, after starting the UML, I was able to identify where an ordering system would begin, with a customer. I first created my customer class, and the rest of the code flowed nicely. I coded as if I was a customer runing the ordering system from start to finish. I learned that starting a project from the beginning steps assists in the later details to flow, ensuring that the project is not too daunting.
- Deciding which patterns to use
  - In our design patterns book, we learned about many different patterns. When I began I knew I wanted to use the Decorator, Factory, and Command pattern. I also really enjoyed learning the state pattern, however I didn't find a place where it would flow properly. I decided for my last pattern to use the iterator pattern. Deciding which patterns and where to use them was a challenge, however as I was coding and creating my classes, I tried to think of areas where a pattern would complement the code.
- JUnit Tests
  - I was not looking forward to JUnit tests because they are a new concept to me. When I was creating my JUnit tests, I tried to use the same approach as I did for my code. I looked through my main method, from beginning to end, and tried to create tests where I thought they seemed appropriate. I learned how to create JUnit Test cases, and how to create a JUnit Test Suite, which runs all of the test cases in one run.
- GUI
  - For the GUI, I kept switching between wanting to use Java Swing and JavaFX. I decided that Java Swing would be a better fit for my project. I didn't want to focus too much time during developing on the GUI, so I first coded my project to work through the console. Once completed, and fully working, I updated the code with some Java Swing code. Most updates where pretty straight forward, however I initially got stuck when trying to replace the sysout's within the methods. I figured out that I had to make the updates within the method to replace the sysout's with the Java Swing code, not within my Main. I learned that the better approach is to get the main code working through the console, before concentrating on making it pretty!
### JUnit Tests
JUnit Suite [Alltests.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/AllTests.java): Runs through all JUnit test cases.
Junit test cases:
- [ChickenAlfredoJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/ChickenAlfredoJTest.java): Includes Command and Decorator Pattern.
- [DessertOptionJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/DessertOptionJTest.java)
- [FactoryJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/FactoryJTest.java)
- [HumanJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/HumanJTest.java)
- [IteratorJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/IteratorJTest.java)
- [setOrderDateJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/setOrderDateJTest.java)
- [setOrderIDJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/setOrderIDJTest.java)
- [ShrimpAlfredoJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/ShrimpAlfredoJTest.java): Includes Command and Decorator Pattern.
- [ShrimpChickenAlfredoJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/ShrimpChickenAlfredoJTest.java):Includes Command and Decorator Pattern.
- [totalJTest.java](https://github.com/Bconnelly308/Ordering_System/blob/master/src/totalJTest.java)
### Final UML
[Final UML](https://drive.google.com/file/d/1x4mOlaxRd__6xgOiaPPduO832ugE-lKH/view?usp=sharing)
