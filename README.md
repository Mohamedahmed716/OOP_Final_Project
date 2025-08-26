# Mood Tracker System  

A simple **console-based Java application** to track your moods with name, date, time, and optional notes.  
It supports adding, editing, deleting, searching, listing, and saving moods to a file.  

---

## ✨ Features  
- ➕ **Add Mood**: Track moods with name, date, time, and notes.  
- 🗑️ **Delete Mood(s)**: Remove a mood by details or all moods by date.  
- ✏️ **Edit Mood**: Update notes of an existing mood.  
- 🔍 **Search Mood(s)**: Find moods by date or specific details.  
- 📋 **View All Moods**: List all stored moods.  
- 💾 **Write to File**: Save all moods to `Moods.txt`.  

---

## 📂 Project Structure  
- **Mood.java** → Represents a mood entry (name, date, time, notes).  
- **InvalidMoodException.java** → Custom exception for invalid/duplicate moods.  
- **MoodTracker.java** → Main driver class with menu and logic.  

---

## 🚀 How to Run  
1. Clone the repository or download the files.  
2. Open a terminal in the project directory.  
3. Compile the project:  
   ```bash
   javac Mood.java InvalidMoodException.java MoodTracker.java
4. Run the Program
   ```bash
   java MoodTracker

