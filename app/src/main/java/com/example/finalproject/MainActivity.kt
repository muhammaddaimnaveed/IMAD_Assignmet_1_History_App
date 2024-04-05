package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var inputEditText = findViewById<EditText>(R.id.inputEditText)

        val generateButton = findViewById<Button>(R.id.generateButton)

        val clearButton = findViewById<Button>(R.id.clearButton)

        val textView3 = findViewById<TextView>(R.id.textView3)

        // Here, I have declared all the variables by using their id names.

        generateButton.setOnClickListener {

            // This code is to activate the Generate History Button.

            // Reference Below:

            /*
The Independent Institution of Education. (2024). Introduction to Mobile Application Development. IMAD5112. Varsity College Pietermaritzburg.
[Online]. Available at: Tertiary Students - IMAD5112MM.pdf - Default View (sharepoint.com). [Accessed: 19 March 2024].
*/

            val userInput = inputEditText.text.toString().toIntOrNull()

            if (userInput == 20) {
                textView3.text = "Jackson Odell (Actor) passed away at the age of 20 years old."
            } else if (userInput == 21) {
                textView3.text = " Mathew Garber (Actor) passed away at the age of 21 years old."
            } else if (userInput == 22) {
                                  "Christina Grimmie (YouTuber) passed away at the age of 22 years old."
            } else if (userInput == 23) {
                textView3.text = "River Phoenix (Actor) passed away at the age of 23 years old."
            } else if (userInput == 24) {
                textView3.text = "James Dean (Actor) passed away at the age of 24 years old."
            } else if (userInput == 25) {
                textView3.text = "Tupac Shakur (Actor) passed away at the age of 25 years old."
            } else if (userInput == 26) {
                textView3.text = "Jean Harlow (Actress) passed away at the age of 26 years old."
            } else if (userInput == 27) {
                textView3.text = "Jonathan Brandis (Actor) passed away at the age of 27 years old."
            } else if (userInput == 28) {
                textView3.text = "Brandon Lee (Actor) passed away at the age of 28 years old."
            } else if (userInput == 29) {
                textView3.text = " David Strickland (Actor) passed away at the age of 29 years old."
            } else if (userInput == 30) {
                textView3.text = "Sylvia Plath (Poet) passed away at the age of 30 years old."
            } else if (userInput == 31) {
                textView3.text = "Cory Monteith (Actor) passed away at the age of 31 years old."
            } else if (userInput == 32) {
                textView3.text = "Bruce Lee (Actor) passed away at the age of 32 years old."
            } else if (userInput == 33) {
                textView3.text = "Chris Farley (Actor) passed away at the age of 33 years old."
            } else if (userInput == 34) {
                textView3.text = "Owen Hart (Actor) passed away at the age of 34 years old."
            } else if (userInput == 35) {
                textView3.text = "Mark Salling (Actor) passed away at the age of 35 years old."
            } else if (userInput == 36) {
                textView3.text = "Marilyn Monroe (Actress) passed away at the age of 36 years old."
            } else if (userInput == 37) {
                textView3.text = "Sal Mineo (Actor) passed away at the age of 37 years old."
            } else if (userInput == 38) {
                textView3.text = "Scotty Beckett (Actor) passed away at the age of 38 years old."
            } else if (userInput == 39) {
                textView3.text = "Barbara Payton (Actress) passed away at the age of 39 years old."
            } else if (userInput == 40) {
                textView3.text = "Adrienne Shelly (Actress) passed away at the age of 40 years old."
            } else if (userInput == 41) {
                textView3.text = "Kobe Bryant (Basketball Player) passed away at the age of 41 years old."
            } else if (userInput == 42) {
                textView3.text = "Dorothy Dandridge (Actress) passed away at the age of 42 years old."
            } else if (userInput == 43) {
                textView3.text = "Natalie Wood (Actress) passed away at the age of 43 years old."
            } else if (userInput == 44) {
                textView3.text = "Georgia Davis (Actress) passed away at the age of 44 years old."
            } else if (userInput == 45) {
                textView3.text = "George Reeves (Actor) passed away at the age of 45 years old."
            } else if (userInput == 46) {
                textView3.text = "John F. Kennedy (Writer) passed away at the age of 46 years old."
            } else if (userInput == 47) {
                textView3.text = "Kim Porter (Actress) passed away at the age of 47 years old."
            } else if (userInput == 48) {
                textView3.text = "Curly Howard (Comedian) passed away at the age of 48 years old."
            } else if (userInput == 49) {
                textView3.text = "Kenneth Mitchell (Actor) passed away at the age of 49 years old."
            } else if (userInput == 50) {
                textView3.text = "John Pinette (Actor) passed away at the age of 50 years old."
            } else if (userInput == 51) {
                textView3.text = "John Smith (Explorer) passed away at the age of 51 years old."
            } else if (userInput == 52) {
                textView3.text = "William Shakespeare (Poet) passed away at the age of 52 years old."
            } else if (userInput == 53) {
                textView3.text = "Vladimir Lenin (Politician) passed away at the age of 53 years old."
            } else if (userInput == 54) {
                textView3.text = "Mathew Perry (Actor) passed away at the age of 54 years old."
            } else if (userInput == 55) {
                textView3.text = "Emily Dickinson  (Poet) passed away at the age of 55 years old."
            } else if (userInput == 56) {
                textView3.text = " Steve Jobs (Entrepreneur) passed away at the age of 56 years old."
            } else if (userInput == 57) {
                textView3.text = "Patrick Swayze (Actor) passed away at the age of 57 years old."
            } else if (userInput == 58) {
                textView3.text = "Randy Savage (Wrestler) passed away at the age of 58 years old."
            } else if (userInput == 59) {
                textView3.text = "Clark Gable (Actor) passed away at the age of 59 years old."
            } else if (userInput == 60) {
                textView3.text = "Diego Maradona (Soccer Player) passed away at the age of 60 years old."
            } else if (userInput == 61) {
                textView3.text = "Sally Ride (Astronaut) passed away at the age of 61 years old."
            } else if (userInput == 62) {
                textView3.text = "Carl Judie (Actor) passed away at the age of 62 years old."
            } else if (userInput == 63) {
                textView3.text = "Robin Williams (Actor) passed away at the age of 63 years old."
            } else if (userInput == 64) {
                textView3.text = "Karl Marx (Philosopher) passed away at the age of 64 years old."
            } else if (userInput == 65) {
                textView3.text = "Bob Saget (Actor) passed away at the age of 65 years old."
            } else if (userInput == 66) {
                textView3.text = "Marie Curie (Physicist) passed away at the age of 66 years old."
            } else if (userInput == 67) {
                textView3.text = "Leonardo da Vinci (Painter) passed away at the age of 67 years old."
            } else if (userInput == 68) {
                textView3.text = "James Avery (Actor) passed away at the age of 68 years old."
            } else if (userInput == 69) {
                textView3.text = "Alan Rickman (Actor) passed away at the age of 69 years old."
            } else if (userInput == 70) {
                textView3.text = "Louis Vuitton (Fashion Designer) passed away at the age of 70 years old."
            } else if (userInput == 71) {
                textView3.text = "Guccio Gucci (Fashion Designer passed away at the age of 71 years old."
            } else if (userInput == 72) {
                textView3.text = "John Wayne (Actor) passed away at the age of 72 years old."
            } else if (userInput == 73) {
                textView3.text = "Carles Darwin (Biologist) passed away at the age of 73 years old."
            } else if (userInput == 74) {
                textView3.text = "Fred Rogers (Actor) passed away at the age of 74 years old."
            } else if (userInput == 75) {
                textView3.text = "Rocky Johnson (Wrestler) passed away at the age of 75 years old."
            } else if (userInput == 76) {
                textView3.text = "Albert Einstein (Physicist) passed away at the age of 76 years old."
            } else if (userInput == 77) {
                textView3.text = "Galileo Galilei (Inventer) passed away at the age of 77 years old."
            } else if (userInput == 78) {
                textView3.text = "Franz Beckenbaur (Soccer Player) passed away at the age of 78 years old."
            } else if (userInput == 79) {
                textView3.text = "Richard Dawson (Actor) passed away at the age of 79 years old."
            } else if (userInput == 80) {
                textView3.text = "John Lewis (Politician) passed away at the age of 80 years old."
            } else if (userInput == 81) {
                textView3.text = "Ray Kroc (Entrepreneur) passed away at the age of 81 years old."
            } else if (userInput == 82) {
                textView3.text = "Neil Armstrong (Astronaut) passed away at the age of 82 years old."
            } else if (userInput == 83) {
                textView3.text = "Gene Wilder (Actor) passed away at the age of 83 years old."
            } else if (userInput == 84) {
                textView3.text = "Isaac Newton (Physicist) passed away at the age of 84 years old."
            } else if (userInput == 85) {
                textView3.text = "Shirley Temple (Actress) passed away at the age of 85 years old."
            } else if (userInput == 86) {
                textView3.text = "Nikola Tesla (Inventor) passed away at the age of 86 years old."
            } else if (userInput == 87) {
                textView3.text = "Coco Chanel (Fashion Designer) passed away at the age of 87 years old."
            } else if (userInput == 88) {
                textView3.text = "Charlie Chaplin (Actor) passed away at the age of 88 years old."
            } else if (userInput == 89) {
                textView3.text = "Harper Lee (Novelist) passed away at the age of 89 years old."
            } else if (userInput == 90) {
                textView3.text = "Sean Connery (Actor) passed away at the age of 90 years old."
            } else if (userInput == 91) {
                textView3.text = "Pablo Picaso (Painter) passed away at the age of 91 years old."
            } else if (userInput == 92) {
                textView3.text = "Sam Walton (Entrepreneur) passed away at the age of 92 years old."
            } else if (userInput == 93) {
                textView3.text = "Mickey Rooney (Actor) passed away at the age of 93 years old."
            } else if (userInput == 94) {
                textView3.text = "Sidney Poitier (Actor) passed away at the age of 94 years old."
            } else if (userInput == 95) {
                textView3.text = "John Glenn (Astronaut) passed away at the age of 95 years old."
            } else if (userInput == 96) {
                textView3.text = "Marian Anderson (Actor) passed away at the age of 96 years old."
            } else if (userInput == 97) {
                textView3.text = "Dora Gabe (Poet) passed away at the age of 97 years old."
            } else if (userInput == 98) {
                textView3.text = "Carl Reiner (Actor) passed away at the age of 98 years old."
            } else if (userInput == 99) {
                textView3.text = "Eddie Albert (Actor) passed away at the age of 99 years old."
            } else if (userInput == 100) {
                textView3.text = "Bob Hope (Comedian) passed away at the age of 100 years old."
            }

            /* I used the website Famous Birthdays to research the deaths of all the famous people that passed away at each
             age group. I then used the else if statement to match the age the user inputs with the correct famous person.
               */
            else {
                textView3.text = "The age is invalid."
            }

            /* The else statement is important because if the user enters a non-numerical value, or any numerical value
               that falls outside the range of 20 to 100 years old,the program will print, "The age is invalid".
             */


// Reference Below:

            /*
            The Independent Institution of Education. (2024). Introduction to Mobile Application Development. IMAD5112. Varsity College Pietermaritzburg.
            [Online]. Available at: Tertiary Students - IMAD5112MM.pdf - Default View (sharepoint.com). [Accessed: 19 March 2024].

            W3Schools. (No Date). Kotlin If…Else Expressions. [Online]. Available at: https://www.w3schools.com/kotlin/kotlin_conditions.php. [Accessed: 20 March 2024].

            Famous Birthdays. (No Date). Deaths by year. [Online]. Available at: https://www.famousbirthdays.com/deceased/. [Accessed: 23 March 2024].
            */
        }



var editField = findViewById<EditText>(R.id.inputEditText)

val clearTextbtn: Button = findViewById(R.id.clearButton)

var texts = findViewById<TextView>(R.id.textView3)

clearTextbtn.setOnClickListener { editField.text.clear() }

// This code is to activate the Clear Button.

// Reference Below:

/*
The Independent Institution of Education. (2024). Introduction to Mobile Application Development.IMAD5112. Varsity College Pietermaritzburg.
[Online]. Available at: Tertiary Students - IMAD5112MM.pdf - Default View (sharepoint.com). [Accessed: 19 March 2024].
*/

}}
