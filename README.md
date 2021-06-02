# Testing GraphQL using Karate

## Requirement
* Java Development Kit
* Maven

## How to running test
```
mvn clean test -Dkarate.env=development -Dtest=developmentTestRunner
```

## Test Report
* Test report automatically generated on `target` folder after finished the test execution
* Open `overview-features.html` file on your browser from `target/cucumber-reports/advanced-reports/cucumber-html-reports` folder