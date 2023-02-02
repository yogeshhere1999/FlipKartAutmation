## Flipkart Testing Project

### Tech Stack
- TestNg
- Selenium
- POM FrameWork
- Java
- Maven

---

### Info and Steps to Run the Project 

***To Run:***

- You can run with Driver and Headless Mode:
    - **Run in Different Drivers:**
        - chromeTestng.xml (to run in chrome driver)
        - firefoxTestng.xml (to run in mozilla firefox driver)
        - ieTestng.xml (to run in internet explorer driver)
    - **HeadLess Mode:**
        - chromeHeadless Driver
        - firefoxHeadless Driver

**Information**

- Used utilities like Extent Manager, Reading Properties File, and Screenshots
  
- Utility classes are in 
  `src/main/java >> training.assignmnet.utilites`

- Basic needs of the project are under base package in class BasePage
  `src/test/java >> training.assignmnet.base`

- All elementes of the Flipkart Pages is sorted according to their pages they appear in, is in package pages.
  `src/test/java >> training.assignmnet.pages`

- All the testcase are under testcase package.
  `src/test/java >> training.assignmnet.testcases`


***Note***
    
- After running the project screenshots of failed tests are automatically saved in the project folder itself.

- A better experience of checking the testcases is to open 
`reports >> ExtentReports.html`


    