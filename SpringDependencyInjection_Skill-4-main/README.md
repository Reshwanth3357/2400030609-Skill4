# Spring Dependency Injection Practice Project

## 📋 Project Overview

This is a hands-on learning project that demonstrates different ways to implement **Dependency Injection** using the Spring Framework. It's designed to help you understand how Spring manages object creation and dependency resolution through various injection techniques.

## 🎯 What You'll Learn

This project covers four main types of dependency injection:
- **Constructor Injection** - Using XML configuration
- **Setter Injection** - Using XML configuration  
- **Annotation-based Injection** - Using Java configuration
- **Component Scanning** - Automatic bean discovery

## 🏗️ Project Structure

```
src/main/java/com/practice/SpringDI/
├── App.java              # Main application class
├── Student.java          # Student entity class
├── AppConfig.java        # Java-based configuration
└── applicationConfiguration.xml  # XML-based configuration
```

## 🔧 How It Works

### 1. **Student Class**
The `Student` class represents a simple entity with properties like student ID, name, course, and academic year. It demonstrates:
- Constructor-based dependency injection
- Setter-based dependency injection
- Annotation-based value injection

### 2. **XML Configuration** (`applicationConfiguration.xml`)
This file shows traditional Spring configuration using XML:
- Defines beans with constructor arguments
- Sets properties using setter methods
- Uses `constructor-arg` and `property` tags

### 3. **Java Configuration** (`AppConfig.java`)
Modern Spring approach using Java annotations:
- `@Configuration` marks the class as a configuration source
- `@ComponentScan` automatically discovers components
- `@Bean` defines beans programmatically

### 4. **Main Application** (`App.java`)
Demonstrates two ways to use Spring containers:
- **XML-based**: Uses `ClassPathXmlApplicationContext` to load beans from XML
- **Annotation-based**: Uses `AnnotationConfigApplicationContext` with Java config

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven build tool
- Spring Framework 7.0.3

### Running the Project

3. **Run from your IDE**:
   - Open `App.java`
   - Right click select run as Java appliaction
   - Run the main method

## 📖 Key Concepts Demonstrated

### Dependency Injection Types

**Constructor Injection** (XML):
```xml
<bean id="studentConsBean" class="com.practice.SpringDI.Student">
    <constructor-arg value="2400030371" type="long"/>
    <constructor-arg value="Bhargav"/>
</bean>
```

**Setter Injection** (XML):
```xml
<property name="courseName" value="Full-Stack"/>
<property name="acadamicYear" value="2024"/>
```

**Annotation-based Injection** (Java):
```java
@Bean
public Student student() {
    return new Student(102, "Ravi", "AI", 4);
}
```
**Happy Learning!** 🎓
