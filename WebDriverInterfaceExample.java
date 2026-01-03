//3. Advantage of assigning driver reference in WebDriver interface

WebDriver driver = new ChromeDriver();

//Advantages:
 /*.Loose coupling (follows OOP principles)
   .Cross-browser testing becomes easy
   .We can switch browsers without changing test logic
   .Supports runtime polymorphism*/

WebDriver driver;

driver = new ChromeDriver();   // Chrome
driver = new FirefoxDriver();  // Firefox
driver = new EdgeDriver();     // Edge
