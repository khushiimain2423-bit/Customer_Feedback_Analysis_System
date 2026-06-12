# 📊 Customer Feedback Analysis System
### Using Core Java & OOP Concepts

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-Academic-purple?style=for-the-badge)

**A Java-based console application that automatically processes customer reviews, computes average ratings, and categorizes overall sentiment using Object-Oriented Programming principles.**

</div>

---

## 🏫 Project Info

| Field | Details |
|---|---|
| 🎓 University | Rungta International Skills University, Bhilai, CG |
| 🏛️ School | School of Computer Science and Engineering |
| 📘 Subject | Object Oriented Programming With Java |
| 📅 Session | 2025–26 |
| 💻 Course | B.Tech CSE with AI & ML in association with IBM |

---

## 📌 Table of Contents

- [About the Project](#-about-the-project)
- [Features](#-features)
- [Project Structure](#-project-structure)
- [OOP Concepts Used](#-oop-concepts-used)
- [How It Works](#-how-it-works)
- [Getting Started](#-getting-started)
- [Sample Output](#-sample-output)
- [Future Enhancements](#-future-enhancements)
- [Author](#-author)

---

## 🧩 About the Project

In today's digital world, businesses receive hundreds of customer reviews daily. Reading and analyzing each one manually is **slow, biased, and inefficient**.

This project solves that problem by building a **Customer Feedback Analysis System** in Java that:

- 📥 Accepts multiple customer feedback entries (score + comment)
- 📦 Stores them using **Feedback class objects**
- 🧮 Computes the **average rating** using the **Analyzer class**
- 🏷️ Categorizes sentiment using **switch-case logic**
- 📤 Displays a clean, formatted analysis report

---

## ✨ Features

- ✅ Object-Oriented Design with `Feedback` and `Analyzer` classes
- ✅ Dynamic user input via `Scanner`
- ✅ Average rating calculation using arrays and loops
- ✅ Sentiment categorization with `switch-case`
- ✅ Positive vs Negative review count *(Bonus)*
- ✅ Display of all feedback entries *(Bonus)*
- ✅ Clean, formatted console output

---

## 📁 Project Structure

```
CustomerFeedbackSystem/
│
├── CustomerFeedbackSystem.java    ← Main source file
│     │
│     ├── class Feedback           ← Stores score + comment
│     ├── class Analyzer           ← Processes feedback array
│     └── class CustomerFeedbackSystem  ← Entry point (main)
│
└── README.md                      ← You are here!
```

---

## 🧠 OOP Concepts Used

| Concept | Where Used |
|---|---|
| **Class & Object** | `Feedback` and `Analyzer` classes with objects |
| **Encapsulation** | Private fields with public getter methods |
| **Constructor** | Parameterized constructor in `Feedback` class |
| **Array of Objects** | `Feedback[]` array passed to Analyzer |
| **Method** | `calculateAverage()`, `categorizeSentiment()` |
| **Switch-Case** | Sentiment categorization logic |

---

## ⚙️ How It Works

```
    User Input (score + comment)
            │
            ▼
    Stored in Feedback[] Array
            │
            ▼
    Passed to Analyzer Class
            │
            ▼
    calculateAverage() → loops through array, sums scores
            │
            ▼
    categorizeSentiment() → rounds average → switch-case
            │
     ┌──────┴──────┐
     │  Score → Category  │
     │  5     → Excellent │
     │  4     → Good      │
     │  3     → Average   │
     │  1-2   → Poor      │
     └─────────────┘
            │
            ▼
    Display Formatted Report
```

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or above → [Download here](https://www.oracle.com/java/technologies/downloads/)
- Any IDE or terminal (VS Code recommended)

### 1. Clone the Repository

```bash
git clone https://github.com/YourUsername/CustomerFeedbackSystem.git
cd CustomerFeedbackSystem
```

### 2. Compile the Code

```bash
javac CustomerFeedbackSystem.java
```

### 3. Run the Program

```bash
java CustomerFeedbackSystem
```

---

## 🖥️ Sample Output

```
  How many feedback entries do you want to enter? 5

  Enter score for feedback 1 (1 to 5): 5
  Enter comment for feedback 1: Excellent service!

  Enter score for feedback 2 (1 to 5): 4
  Enter comment for feedback 2: Very good experience.

  Enter score for feedback 3 (1 to 5): 4
  Enter comment for feedback 3: Satisfied with the product.

  Enter score for feedback 4 (1 to 5): 3
  Enter comment for feedback 4: Average, could be better.

  Enter score for feedback 5 (1 to 5): 5
  Enter comment for feedback 5: Absolutely loved it!

  --- All Feedback Entries ---
  [1] Score: 5  |  Comment: Excellent service!
  [2] Score: 4  |  Comment: Very good experience.
  [3] Score: 4  |  Comment: Satisfied with the product.
  [4] Score: 3  |  Comment: Average, could be better.
  [5] Score: 5  |  Comment: Absolutely loved it!

  ==========================================
      CUSTOMER FEEDBACK ANALYSIS REPORT
  ==========================================
      Total Feedback Entries : 5
      Average Rating         : 4.20 / 5.00
      Customer Sentiment     : Good
      Positive Reviews       : 4
      Negative Reviews       : 0
  ==========================================
```

---

## 🔮 Future Enhancements

- [ ] 🗄️ Database integration (MySQL / SQLite) for persistent storage
- [ ] 🖥️ GUI using Java Swing or JavaFX
- [ ] 🔍 Keyword-based sentiment detection from comments
- [ ] 🌐 Web-based deployment using Spring Boot
- [ ] 📊 Graphical charts for rating distribution

---

## 👨‍💻 Author

<div align="center">

**[Your Name]**
B.Tech CSE with AI & ML in association with IBM
Rungta International Skills University, Bhilai, CG

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/YourUsername)

</div>

---

<div align="center">

⭐ **If you found this project helpful, please give it a star!** ⭐

*Made with ❤️!*

</div>