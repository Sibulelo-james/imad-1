Testing I did 

For this, I tried all the below-mentioned scenarios to test the app: 

Morning. I got a good morning suggestion 

Afternoon snack. Afternoon snack. 

I left it blank. I was sent an error message 

I typed gibberish like “blah. I received an error with samples 

I typed in all DINNER.” It still worked 

I hit the reset button. This final action – a click on the reset button – cleared everything. 

Everything worked just like I thought it would. For this purpose, Logcat was used to display what occurred behind the scenes. 

What I learned 

Making this app, taught me: 

How to use when statements in Kotlin 

How to get and validate user input 

How to build a UI with gradients and cards that does not look ugly 

How to use GitHub Actions to build your app 

The Importance of log4j in Problem Diagnosis 

Any issues I ran into 

The main problem was achieving gradient background. For this, I had to create an XML file and then reference it in the layout. I made several mistakes and had to try a few times. Eventually, I was able to make it work. 

Screenshots 

I wish I could show you some screenshots, but the app has: 
text for errors 
How to run this yourself 
Running the app; 
Clone the repo: git clone [ https://github.com/Sibulelo-james/imad-1.git] 
Open it in Android Studio 
Wait for Gradle to sync 

Hit the run button 

Choose an emulator or plug your phone in 

The app runs on Android 5.0 and above. 

Stuff I might add 

If I had more time I’d probably; 

Add the option to choose a date so that users can set reminders for themselves. 

Make it possible to define custom sparks 

Add sharing so that the suggestions can be sent to friends. 

Add some motion elements to the UI 

About the background 

My friend Cora has problems with staying in touch when she is busy. She works a lot. Sometimes she will go weeks without sending a message to someone she actually cares about. The app, therefore, is supposed to streamline this for her by letting her do one small thing. 

This was a fun project. It isn’t very complex. It actually solves a real problem that one of my acquaintances has. The app works it looks ok. It does what the app is supposed to do. 
