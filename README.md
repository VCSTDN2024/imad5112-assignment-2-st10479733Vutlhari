MemoryLane

What is MemoryLane?

MemoryLane is a quiz app created to test the users knowledge of history and theories. This quiz app was built using Kotlin and Andriod Studio.
The app is simple, clean, and a fun way to keep your mind active. 

Why i built it?

The reason i created MemoryLane is to learn how to handle user input, navigation between 
screens and basic logic in mobile apps. I didn't want just another templete-based quiz-this app reflects how i learn and think.

MemoryLane Functionalities

MemoryLane contains a welcome screen that has a start button, five questions which are True/False, a question button which the user clicks for text to be displayed on the question textView,
a nextButton, a retry button and an exit button. When the user opens the app a welcome screen will be displayed with a start button, They will have to press the start button to take them to the next
screen, in that next screen the user will start the quiz by pressing the question button which will display the question on the question textview the true and false button will be enabled and the next button 
will be disabled, This is created to ensure the user answers the question before clicking next which will generate a new question. When the user either clicks True/False for the question a result will be displayed
either correct or incorrect in the result textview, after the user is done answering the questions they will click on the next button and the score screen will be displayed. Now the score screen will display the score they got over the total and a review of the answers they correct and wrong, a retry button which will the user back to the quiz screen to retry the questions and an exit button to exit the screen.

#Github Actions- our aeroplane mastermind✈️
Github Actions is used to ensure that our app is working effectively with no limitations.
To understand it better think of it as the person who ensures that before departure the aeroplane is safely secured, there are no faults, the engines are working and everything is under control to let it fly.
There is a workflow that is created inorder to write our code,run all jobs and build.To clarify more on workflows these are programmed processes defined in github actions that are activated by certain things like push,pull,scheduled,workflow dispatch,release etc

#Its functionalities
Whenever we put a new code github tests to see if everything is working correctly.
It finds errors early and tells us right away what went wrong in the code which is much easier.
It also builds your code and uploads artifacts which can be downloaded and used to store and generate data by github workflows, artifacts such as APK and AAB etc.The artifacts also assit checking the state of a build,enabling debugging,to ensure specific files from CI/CD process are preserved.

Inorder to find the tests you can go to your github repository and click on the tab "Actions".that will show all the workflows that have been run,including tests.
If the tests in the workflow created are successfully ran then a green checkmark✅ will appear to indicate that the tests were successful and check if the artifacts are uploaded.
If the tests were not successfully ran then a red cross❌will appear and click on the red cross to see the error and correct it.


