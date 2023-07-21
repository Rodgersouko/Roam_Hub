# Roam-Hub
The Roam Hub battery rental java.

The "Roam-Hub" is a Java program that calculates the total number of late returns for the given day based on the input array of all the rider's borrow and return times.

## Problem Description

The Roam Hub provides battery rental services. A rider can rent a battery for a total of 5 hours maximum on a given day. The input array contains borrow and return times (values) of all the rider's battery rentals for the given day. The task is to find the total number of late returns.
## Prerequisites

Before running the program and tests, make sure you have the following installed on your system:

- Java Development Kit (JDK) - [Download and install JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- Apache Maven - [Download and install Maven](https://maven.apache.org/download.cgi)

### Assumptions:
1. Borrow and return times might overlap even if the rider borrowed more than one battery.
2. The times are in the format 'HH:MM' using the 24-hour clock.

## Example

### Input
inputTimes = [
["04:00", "11:00"],
["13:00", "16:00"],
["06:00", "10:00"],
["12:30", "13:30"],
["02:00", "11:00"]
];

### Output

For the example input, the output is 2, indicating that there were two late returns.

# How to Use

1. ### Clone the repository to your local machine using the following command:
        git clone https://github.com/Rodgersouko/Roam-Hub.git

2. Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ e.t.c).

3. Run the `BatteryRental.java` file containing the Java solution.
      1. ### compile file
        javac .\src\main\java\org\example\BatteryRental.java
      2. ### run file
       java .\src\main\java\org\example\BatteryRental.java

4. The program will display the total number of late returns for the provided inputTimes dataset.
## ##################################################################################################

#  Running the Tests
1. ### compile 
     mvn compile
2. ### test 
     mvn test
	
## Test Scenario

The Cucumber feature file containing the test scenario can be found at `src/test/resources/battery_late_returns.feature`. The feature file is written in Gherkin language and describes the behavior of the "Battery Late Return Count" feature.

## Test Implementation

The Cucumber step definitions that define the behavior for each Gherkin step can be found in the Java class `your.package.name.BatteryLateReturnSteps` under `src/test/java`. Make sure to replace `your.package.name` with the actual package name where the step definition class is located.

## Test Reports

Cucumber generates test reports after the test execution. The reports can be found in the `target/cucumber-reports` directory. Open the HTML report (`index.html`) in your browser to view the detailed test results.

you can also view reports on the terminal

View your Cucumber Report at:                                             ?
? https://reports.cucumber.io/reports/f9ab7ee9-8fe6-435a-8abd-975a9c0a67fb ?
?

The link redirects you to your browser.
#

## Contributing

Contributions to this project are welcome. If you have any suggestions or improvements, feel free to create a pull request or open an issue.

## License

This project is licensed under the [MIT License](LICENSE).

