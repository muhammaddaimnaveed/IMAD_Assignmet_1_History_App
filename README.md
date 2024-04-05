IMAD Assignment1 Essay

In order to develop a successful application, I needed to implement key factors such as good planning, analysis, strategy development, user interface, application development, deployment,
testing and maintenance. The app that I was assigned to design and create for my IMAD5112 Assignment 1 was no easy task. I was tasked with developing a History App whereby I had to research
and define a list of famous people, one per age group that passed away between the age groups of 20 to 100 years old. I was successful in developing and testing the app by using and referencing
the information I had gathered from the classroom sessions, module manual and the Internet. The app is simple to use and easy to navigate. The app works but allowing the users to input an age,
in the range of 20 to 100 years old, and then it provides the user with a famous person that passed away at the same age along with their profession. The main challenge I faced while creating 
this app was to implement a logic that would match all the age groups that the user inputs in the range of 20 to 100 years old to match the correct famous person who passed away at the same age 
along with their profession. To tackle this problem, I used the If and Then Statement to assign each age group with the correct famous person that passed away and I implemented an Else Statement
at the end to indicate an error if a non-numerical value or any numerical value that falls outside the 20 to 100 year old range is put in by the user.

When it came to the design aspect of the Assignment, I firstly browsed through the Internet to gain some inspiration and find some history themed graphics for my user interface. My aim was to go for
a vintage themed look for my app, as it goes hand-in- hand with my Assignment requirements. I decided to use a textured, old brown paper with a lovely black border frame as my wallpaper to go with the 
theme in order to enhance the aesthetic look of my app which would captivate the user’s interest and create an engaging user interface. I firstly created a new project and started to develop the user
interface of my app by going to the Activity_Main.xml file in Android Studio and changed the background to the wallpaper of my choice. I then started to display the layout of the app by adding additional 
features and giving them their own unique id names.  I firstly placed 3 text view boxes, 2 at the top of the app containing the title and the age range of the app and a third semi-transparent vanilla 
colored text view box at the bottom of the app which would display the result. I then placed 2 vanilla-colored buttons, one to generate the history and the other to clear the search results. I chose the
vanilla color for the buttons and the text view box as it is easily able to blend in well with the wallpaper which enhance the aesthetic look of the app. I also placed an edit text box where the users 
are able to input an age to achieve a result. I then changed the font to Garamond and aligned all the features one under another starting with the 2 text view boxes at the top, followed by the edit text
box, then the 2 buttons and a final text view box at the bottom of the app. Overall, I was trying to combine and enhance the layout and aesthetics of my app by using dull colors, changing the font,
aligning the features of my app one under another and keeping it as simple as possible in order to resemble and maintain vintage themed look.

To get my app up and running, I firstly needed to brainstorm a step-by-step logical plan that would allow me to correctly match the age a user inputs with the famous person the passed away at the same 
age along with their profession. I used the W3Schools platform online along with the module manual to learn about the If, Then and Else Statements. I then wrote down the pseudocode and drew a flowchart to 
show the approach I would take in coding the app. I then firstly opened the emulator and activated it by entering the code 5555. I then opened Android Studio and went to the Main Activity file. My first
step was to declare the 4 main variables using the id names I had given them in the Activity_Main.xml file which is essential for my application to function. I firstly declared the Edit Text box by using
the id name inputEditText, where the users are able to enter an age. I then declared the 2 buttons by using the id names generateButton and clearButton, where the users will be able to generate and clear
the history results. Finally, I declared the Text View box that is placed at the bottom of the app by using the id name textView3, where the users will be able to see the search results. I then placed a
setOnClickListener and attached it to my generateButton id so whenever the generate history button is clicked, the program can run and display the result in the Text View box. I then declared a userInput 
value and made it equal to inputEditText.text.toString().toIntOrNull. This line of code basically extracts the users input and from the Edit Text box, converting it to a string and checks to see if the 
user input is an integer or null. I then used the If and Then Statement to match the age entered by the user to the correct famous person that passed away at the same age. I did this by saying
If (userInput == 20), meaning that if the user enters the numerical value 20, then {textView3 = “Jackson Odell (Actor) passed away at the age of 20 years old.”}, meaning that then the Text View box
should print the result, “Jackson Odell (Actor) passed away at the age of 20 years old.” I repeated the same process from the age groups of 20 to 100 years old and used the website Famous Birthdays to 
search for famous people who passed away at different age groups. Thereafter, instead of using the If Statement, I used the Else if Statement because it allows you to check multiple conditions in your 
code so you can input more than one famous person whereas the If Statement only checks for a single condition. I then placed in an Else Statement at the end so that if a non-numerical value or a numerical 
value that falls outside the range of 20 to 100 years old is entered, an error can pop up in the Text View box saying, “the age is invalid”. Finally, I then declared a clear button and attached to the 
setOnClickListener so when the clear history button is clicked, the search results are cleared.

After completing my app, I signed into my GitHub account and created a new GitHub repository. Thereafter, I copied my code from the Android Studio and pasted it into the GitHub repository file. I then 
cloned my GitHub repository to my local machine and ran my app. The app ran successfully and complies with all the code and features I have used in my project. To improve the quality of my app, I would
include the photos of the celebrities so that the users can see who these people were and provide a detailed biography on each of the celebrities so that the users can see how they spent their lives.
By practically developing this app, I have learnt a lot of new information regarding the coding language Kotlin, I better understand the functionality of new code and how to implement different pieces
of code together. I also know how to use the If, Then and Else Statements and I have now gained the necessary skills to create new projects and improve the quality of my code.

(1349 Words)


Reference

Famous Birthdays. (No Date). Deaths by year. [Online]. Available at: https://www.famousbirthdays.com/deceased/. [Accessed: 23 March 2024].

The Independent Institution of Education. (2024). Introduction of Mobile Application Development. IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students – 
IMAD5112MM.pdf – Default View (sharepoint.com). [Accessed: 19 March 2024].

W3Schools. (No Date). Kotlin If…Else Expressions. [Online]. Available at: https://www.w3schools.com/kotlin/kotlin_conditions.php. [Accessed: 23 March 2024].





W3Schools. (No Date). Kotlin If…Else Expressions. [Online]. Available at: https://www.w3schools.com/kotlin/kotlin_conditions.php. [Accessed: 23 March 2024].
