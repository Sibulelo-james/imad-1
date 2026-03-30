Social Spark App
- Developer: Sibulelo Mkhize
- Student Number: ST10528819
- Group: Group A
- Course: Higher Certificate of Web Development
- Subject: IMAD5112 - Mobile Application Development

 Links
- GitHub Repository: [https://github.com/sibulelo/social-spark](https://github.com/sibulelo/social-spark)
  

---

 Project Overview

The Social Spark App is a mobile application developed as part of an assignment in the IMAD5112 Mobile Application Development subject. This application was created using Kotlin and Android Studio. The app's primary purpose is to help people maintain social connections by suggesting small, meaningful actions based on the time of day.

I made this app for my friend Cora who works long hours and struggles to keep in touch with people. The app gives her one simple thing to do depending on what time it is - nothing overwhelming, just small gestures that help her stay connected.

---

 Purpose and Features

 Purpose:
The main goal of this app is to help people who are busy but still want to maintain their relationships. Instead of trying to figure out what to do, they just open the app, type in the time, and get a suggestion. 

 Key Features:
- Text input where users type the time of day (Morning, Afternoon, Dinner, etc.)
- Suggestion display that shows a social spark based on what time they entered
- Reset button that clears everything with one tap
- Error messages that actually help you figure out what to type
- Nice-looking UI with a gradient background and clean cards

These features aim to provide an easy-to-use platform that doesn't require any technical knowledge. Just open, type, and go.

---

 Design Considerations

When I was designing this app, I thought about a few things:

1. User Experience (UX): I wanted it to be really simple. One screen. Two buttons. No menus to get lost in. My friend Cora isn't a tech person so I made sure she wouldn't get confused.

2. Responsiveness: I tested this on different screen sizes. The layout adjusts so it looks decent whether you're on a small phone or a tablet. Used ConstraintLayout for this.

3. Simplicity: I kept it minimal. No extra features that would make it complicated. Just the basics that do what they're supposed to do.

4. Performance: The app is small (about 2MB) and opens instantly. No loading screens or waiting around.

---

 GitHub and GitHub Actions

This project was managed using **GitHub** for version control. I made sure to commit my code regularly so I could track my progress. Every time I added something new or fixed a bug, I pushed it to GitHub.

 GitHub Actions:
I used **GitHub Actions** to automatically build my app whenever I pushed code. This was useful because:

- It checks if my code actually compiles on a fresh system (not just my computer)
- It creates APK files automatically that I can download and test
- It makes sure I didn't break anything when I add new features

Challenges and Learnings
I ran into a few problems while making this app:

Challenge 1: Getting the gradient background to show up

Solution: I didn't know you had to create a separate XML file in the drawable folder. Once I figured that out and referenced it properly, it worked. Took me about 30 minutes of Googling.

Challenge 2: Making it work with uppercase and lowercase inputs

Solution: I used .lowercase() to convert everything to lowercase before checking. This way "MORNING", "Morning", and "morning" all work the same.

Challenge 3: Setting up GitHub Actions

Solution: The first few builds failed because I forgot to make gradlew executable. Added chmod +x gradlew to the workflow and it started working.

From this project I learned a lot about Android development, handling user input, and using GitHub Actions. It was frustrating at times but worth it when everything finally worked.

References
Android Developers Documentation. (2024). "Build your first app." Retrieved from https://developer.android.com/training/basics/firstapp
Kotlin Documentation. (2024). "Basic syntax." Retrieved from https://kotlinlang.org/docs/basic-syntax.html
GitHub Actions Documentation. (2024). "Building and testing Android." Retrieved from https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-android
IMAD5112 Course Materials. (2026). The Independent Institute of Education.

List of Figures
Figure 1: Home screen of the Social Spark app

Figure 2: Suggestion displayed after entering "Morning"

Figure 3: Error message for invalid input

Disclosure of AI Usage in My Assessment
In the development of this project, I have used generative AI tools to assist in various parts of the assignment. Below is a detailed disclosure of where and how these tools were used:

1. Section(s) in which Generative AI was used:
App Features Brainstorming: Used AI to help come up with social spark ideas for different times of day
GitHub Actions Setup: Used AI to help figure out how to set up the workflow file
Code Debugging: Used AI to understand why my gradient background wasn't working
Report Writing: Used AI to help with grammar and clarity in this README
chapgpt to ask for help in fix my errors and create the frist part of my readme  
3. Name of AI Tool(s) Used:
ChatGPT (OpenAI)

GitHub Copilot (GitHub)

3. Purpose/Intention Behind Use:
Brainstorming: Used ChatGPT to generate ideas for social suggestions

Meaning Making: Used AI to help understand Kotlin syntax and Android concepts

Initial Investigation: Used AI to research how to create gradient backgrounds

Code Assistance: GitHub Copilot helped with code completions

Correcting Grammar and Spelling: ChatGPT helped review this report

4. Date(s) in Which Generative AI Was Used:
App Features Brainstorming: March 25, 2026

GitHub Actions Setup: March 27, 2026

Code Debugging: March 28, 2026

Report Writing: March 29, 2026

5. Link to the AI Chat(s) or Screenshots:
Chat 1 (Brainstorming Social Sparks): Link to the AI conversation/chat
(AI helped suggest social interaction ideas for different times)

Chat 2 (GitHub Actions Workflow Setup): Link to the AI conversation/chat
(AI helped with configuring GitHub Actions)

Chat 3 (Debugging): Link to the AI conversation/chat
(AI helped fix the gradient background issue)
