# 🐾 JPetStore Automation Testing Project
## 📌 Project Overview

JPetStore is an online pet purchasing web application where users can buy pets such as cats, dogs, reptiles, birds, and fishes.
Users must first create an account, then log in, add pets to the cart, optionally remove items, and finally complete the purchase successfully.

## 🎯 Purpose of Automation

This project was automated for learning and practice purposes, to gain a strong understanding of:

How web applications are tested using Selenium

How to design and execute automation test frameworks

How different tools work together in a real-time testing scenario

## 🛠️ Tools & Technologies Used

#### Java

#### Selenium WebDriver

#### TestNG

#### Maven

## 🧩 Framework Details

A Hybrid Driven Framework was used for the Registration test

Page Object Model (POM) was used for Login and Add-to-Cart tests

Overall project structure follows POM, which helps in:

#### Better code reusability

#### Easy maintenance

#### Clear separation of test logic and UI elements

## ✅ Tester / Automation Functionalities

The following test scenarios were automated and validated:

### User Registration

### User Login

### Add Pet to Cart

### Purchase Pet (Add to Cart + Checkout combined as one flow)

## ✔️ Validations Performed

#### Verification of successful registration

#### Verification of successful login

#### Verification that the user can:

#### Add pets to the cart

#### Proceed to checkout

#### Place an order successfully

## ▶️ Test Execution Details

Executed on Google Chrome browser

Operating System: Windows 11

Tests were executed using TestNG XML (testng.xml)

## 🌟 Special Features

#### 📊 Extent Reports for detailed test execution results

#### 📸 Automatic screenshot capture for failed test cases

#### 📝 Logging implemented using Log4j2

#### 🌐 After every execution of testng.xml, the report opens automatically using:

Desktop.getDesktop().browse(reportFile.toURI());


## 🚀 Conclusion

This project helped me gain hands-on experience in Selenium automation, framework design, test execution, reporting, and debugging. It strengthened my understanding of real-world QA automation practices.
