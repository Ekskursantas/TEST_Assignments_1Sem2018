# startCodeForTesting1
This project contains start code for an exercise given at cphbusiness.dk for the educations:
* AP degree in Computer Science
* Top-up Bachelor's degree in Software Developement

● Explain the necessary steps you did to make the code testable, and some of the patterns involved in this step <br>
> _By following the guided tutorial, the code has been refactored from a) the `DateFormatter` which is now using an interface `IDateFormatter` to change the static method `getFormattedDate()` that injects the Date instance as an argument, that solves the dependency problem; b) to `JokeFetcher` which is now using polymorphism wherein each joke has its own class that implements an interface `IJokeFetcher` since we know that this project is fetching jokes from various open REST APIs and it might differ in response value, so each joke has its own implementation of the method `getJoke()`. In addition, it uses a `FetcherFactory` implementing `IFetcherFactory` which is basically using a Factory Method Pattern, it makes sure that it returns the right types after implementing the logic required in instantiating JokeFetcher types._<br>

● Execute your test cases <br>
> _JokerTestSuite Result(consists of DateFormatterTest, JokeFetcherTest and FetcherFactoryTest):_<br>

![image](https://user-images.githubusercontent.com/16150075/38200020-0ee574de-3693-11e8-9ad8-8b6946d73ddf.png)

● Explain basically about JUnit, Hamcrest, Mockito and Jacoco, and what problems they solve for testers <br>
> __<br>

● Demonstrate how you used Mockito to mock away external Dependencies <br>
> _ _

● Demonstrate how/where you did state-based testing and how/where you did behaviour based testing <br>
> _ _

● Explain about Coverage Criterias, using the results presented by running Jacoco (or a similar tool) against you final test code. <br>
> _ _

● Explain/demonstrate what was required to make this project use, JUnit (Hamcrest), Mockito and Jacoco <br>
> _ _
