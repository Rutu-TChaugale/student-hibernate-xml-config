# 🚀 Hibernate CRUD Operations with XML Configuration

## 📌 Overview
A simple and efficient Hibernate project demonstrating essential CRUD (Create, Read, Update, Delete) operations using XML-based configuration with MySQL.

## 🛠 Tech Stack
- ☕ **Java** - Core programming language
- 🛠 **Hibernate** - ORM framework for database operations
- 🗄 **MySQL** - Relational database management system
- 🔌 **JDBC** - Database connectivity

## 🌟 Features
✅ **Add Student** - Insert student details into the database  
✅ **Fetch Student** - Retrieve student details from the database  
✅ **Update Student** - Modify existing student records  
✅ **Delete Student** - Remove student records from the database  

## 📂 Project Structure
```
📁 Student_hibernateProject_xmlbase/
├── 📂 src/
│   ├── 📂 com.sit.client/
│   │   ├── 📄 AddStudent.java
│   │   ├── 📄 DeleteData.java
│   │   ├── 📄 FetchData.java
│   │   ├── 📄 UpdateData.java
│   ├── 📂 com.sit.model/
│   │   ├── 📄 Student.java
│   │   ├── 📄 Student.hbm.xml
├── 📄 hibernate.cfg.xml
├── 📂 Hibernate_Jar/
├── 📂 MySqlJAr/
```

## ⚙ Configuration
🔧 **`hibernate.cfg.xml`** - Database connection settings  
📜 **`Student.hbm.xml`** - Hibernate mapping file  

## 🚀 Quick Start
```java
// Add a new Student
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction tx = session.beginTransaction();
Student student = new Student();
student.setName("John Doe");
student.setEmail("johndoe@example.com");
student.setAddress("NYC");
session.save(student);
tx.commit();
session.close();
```

## ▶ How to Run
1️⃣ **Set up MySQL** and update `hibernate.cfg.xml` with your database credentials  
2️⃣ **Compile & Run** Java classes  
3️⃣ **Verify data** in MySQL using queries  

🚀 **Start coding and explore Hibernate with ease!**

