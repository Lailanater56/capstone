# Blackwell PT Trainer
## Chris Lail
## 5-2-2018

### Abstract
Soldiers in the United States military are required to stay in top physical shape in order to do their jobs effectively. Soldiers are required to take a Physical Training Test (PT Test) that demonstrates that they are within the required physical standards. In the United States Army, the PT Test is structured around two minutes of max push-ups, two minutes of max situps, and a timed two mile run. The standards are based off of age and while most soldiers easily meet these requirements, some struggle. To combat this problem, I developed an Android application that has the ability to keep users on a two week program in order to improve peak physical fitness. 

The areas in which the workout program focuses are core strength and endurance. The workout program was supplied by a friend in the military program. After he struggled to pass the PT Test, his unit, Blackwell, suggested he undertake the workouts that are described in my application. Using this program, he was able to pass his next PT Test, attesting to the effectiveness of this program. 

This paper describes the process of creating my Android application solution I call Blackwell PT Trainer. The application is a lightweight solution to achieving peak physical fitness and maintaining that level of fitness. Blackwell PT Trainer provides a simple, effective way to keep track of your workouts and maintain a regular workout schedule, as well as having the capability to launch all of the tools needed to complete each workout.

<b>Key Words:</b> *Android Studio, Android, Workouts, WorkoutsList, WorkoutsDetailFragment, Blackwell PT Trainer, Fragment, Activity*

### Table of Contents

[Introduction and Project Overview](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#introduction-and-project-overview)
* [Problem and Objectives](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#problem-and-objectives)
* [Potential Users](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#potential-users)
* [Value](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#value)
* [Problem Scope](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#problem-scope)
* [Features](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#features)

[Design, Development and Test](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#design-development-and-test)
* [Design](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#design)
* [Development](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#development)
* [Test](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#test)

[Results](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#results)

[Conclusions and Future Work](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#conclusions-and-future-work)

[References](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#references)

[Appendices](https://github.com/Lailanater56/capstone/blob/master/FinalTechnicalReport.md#appendices)

### Introduction and Project Overview

#### Problem and Objectives
Soldiers that fail the PT Test are put under immense pressure to make sure they are able to meet the minimum requirements. Sometimes punishment can go as far as being demoted to a previous rank and pay grade until you can meet the minimum requirements again. Therefore, it was imperative to make a solution that would be able to quickly improve physical fitness and maintain ease of use. Blackwell PT Trainer includes a two week program which requires the user to train five times a week. The simple two week program is a viable solution that can deliver results fast. The application aims to allow the user to complete workouts, keep track of previously completed workouts, and have access to all the tools needed to complete them. For example, the workouts can require the user to run for a workout; Blackwell PT Trainer has a button near the bottom of the workout screen that can launch a GPS tracked run. The workouts can also require the user to do as many push-ups and situps as they can in a certain amount of time. Blackwell PT Trainer also has the capability to launch the default timer application on your Android device. To my knowledge, there is no other application on the market that is geared towards helping improve PT scores. The only applications that are available are apps that calculate your PT score or are generic workout programs created as a one size fits all. This is part of the reason that Blackwell PT Trainer is unique.    

#### Potential Users
Blackwell PT Trainer is specifically aimed at members of the United States military who are looking to improve their scores on the PT Test. Although the application is not limited to members of the military; it can be geared towards anyone who is looking to improve their level of physical fitness. Blackwell PT Trainer does not confirm if you are a member of the military because that information is not needed. Anyone may use this app if they are looking for a simple workout program.

#### Value
The benefit of Blackwell PT Trainer is its ability to adapt to you and your style. The application comes with built in dark and light themes to fit the users preference. On top of that, whenever the application seeks to launch a GPS tracked run, it will look through all of the apps on your phone and allow you to choose your favorite fitness app to complete the run. This allows the user to continue using their preferred GPS tracking fitness app. Many times those applications have built-in sharing mechanisms. This allows the user to also share the results of runs in a way that they are already familiar with. Being able to share runs can improve accountability by allowing your friends to keep tabs on your workouts. Blackwell PT Trainer also eliminates the need for keeping up with the program in paper form. With the Android application you have access to the entire list of workouts at the touch of your fingertips.

#### Problem Scope
Ideally I would have liked to implement my own GPS tracking and timers right into the application. I ultimately decided against it because I did not know much of the Google Maps API and I have no experience with creating timers in Android applications. Due to the time restriction of this course, I was unable to explore those options. In the end, I am happy with my decision to launch any app the user prefers because they do not have to learn another platform. One big problem is that the “Begin Run” button will not work without a third party GPS application to launch. As for the “Start timer” button, all Android phones come preinstalled with a clock application that has the capability of launching a timer. Deferring to other applications saved time and allowed me to work on other key features of the application.

#### Features
* *Different Themes* - Built-in Light and Dark mode themes that feature respective white and black backgrounds with contrasting font colours to provide the user additional aesthetic choice (Figure 1 & Figure 2)
* *Clickable Workout Checklist* - When clicking on a workout, each task has a checkbox indicating whether the task is completed or not. (Figure 6)
* *Uses Your Preferred GPS Fitness App* - When the “Begin Run” button is pressed, Blackwell PT Trainer launches a fitness Intent which allows the user to use their preferred location tracking application.
* *Start Timers Without Leaving The App* - When pressing the “Start Timer” button, Blackwell PT Trainer launches the default clock timer application which allows the user to input the exact desired time without closing the application.
* *Ability To Snap To Current Workout* - When pressing on the floating action button in the bottom right hand corner of the screen, the app opens up the next unfinished workout, immediately bringing the user to the next tasks. 
* *Fitness Safety Tips* - In the navigation drawer in the upper left hand corner of the screen, there is a “Tips” options feature. This opens a screen that directs you to download a portable document format (pdf) file called “Army Pocket Physical Training Guide”. This document is provided by GoArmy.com and include a variety of safety tips and workout demonstrations. (Figure 3 & Figure 4)

### Design, Development and Test

#### Design
Blackwell PT Trainer was developed in Android Studio [3] using the Java and XML programming languages. The Android application is built off of one main Activity that serves as a Fragment placeholder for all of the different views that you see as you traverse through the app. When a new Fragment needs to be displayed, the application creates a new Fragment of that specific type and then uses the built-in SupportFragmentManager to replace the old Fragment with the newly created one. The SupportFragmentManager is crucial to how Blackwell PT Trainer updates its display. Inside of MainActivity [4], there is a blank Fragment that serves as a template where the SupportFragmentManager manages the current and future Fragments that are displayed.

Blackwell PT Trainer remembers user settings and input by storing it into Android's SharedPreferences which essentially performs like a local database. Since I do not need to process user data, then I felt no need to include a full fledged database although originally I had planned on it anyways. I lost a couple of days of programming it in SQLite when I soon realized that it was too much work and was overkill for the scope of this project.

In Android, there is a simple way to create two basic themes that I used to create a Light and Dark theme for Blackwell PT Trainer. There is a default method called AppCompatDelegate.setDefaultNightMode(int) that I used to switch between the two themes. The great part about using the built in functionality to create themes is that Android handles the changing of assets such as text color, background color, etc needed to make the new theme work.

#### Development
In the initial stages of development, the application was simply just a bunch of different Fragments that were not connected. The application was just all about design early on. I was creating XML files that would be inflated and brought to life in the Android Studio design page for each Fragment. A different XML layout file was used to create every UI page in the application. While I was working on the layouts, my friend created a custom icon for the Blackwell PT Trainer app that I incorporated into the design. My friend also created a custom floating action button that is currently in use.

After creating the layouts I moved onto creating the model to store the data. The main classes that hold the data are Workout.java [5] and WorkoutsList.java [7]. The Workout class is used to store specific data about any particular workout such as a unique ID number, workout name, description, content, and whether or not the workout is complete. The WorkoutsList class is a Singleton class used to access the list of workouts throughout the application. This way, making any modifications to a workouts data inside any Fragment will reflect the same result to any other Fragment.

Lastly, I implemented the controller classes that interact with the data based on user input. This portion of development expanded on the Fragment classes allowing them to access data and display it on screen. Simply adding onClickListeners to buttons and other elements allowed the Fragment classes to truly become controller classes since they took user input and responded with the correct action on the data. Android programming [1][2] is purely built on the MVC (Model View Controller) architecture due to its nature so this method of development made the most sense.

#### Test
In order to assure that the program was working as intended I created test programs that would make sure everything was still correct even after making a change. The simplest way to create test programs in Android is to use the Espresso Test Recorder [8]. Essentially, the application runs in an emulator allowing you to interact with it like normal. Behind the scenes the Espresso Test Recorder is generating code to perform the same actions that you are inputting. This made creating tests much faster and it was easier to understand what the test cases were doing since you were simply interacting with the app as normal.

The problems that I ran into with the Espresso Test Recorder is it would not validate that certain things are actually on the screen. The only things that it would automate was the actual touches and interactions that the user inputs. Therefore, I had to go through and manually write the test code that would verify when objects should and should not appear on the screen. For example, the floating action button in Blackwell PT Trainer application should not be shown after clicking on it. If you are already on the current workout, then there is no need to press a button to go to the current workout. Writing these extra checks assured that not only the user interface was still working, but that the data shown was correct as well. I was unable to test the begin run button in the Android emulator because it doesn't have a GPS tracking fitness app preinstalled and you cannot install apps from the Play Store on the emulator. For this, I used my own Android device to make sure it was still running smoothly.

### Results
In the end, Blackwell PT Trainer is a functional solution to the problem that I set out to solve. In the early stages of the project, I had ambitious hopes for the amount of features that I could implement in a semester. I had a vision to create a platform that would allow users the opportunity to share their progress as they completed the program. In a way, I achieved that goal by allowing the user to use their favorite GPS tracking fitness app where most support some flavor of statistics and a sharing mechanism. I also had aspirations of creating my own timers inside the Blackwell PT Trainer application. In the end, I found it much easier to also divert this task to another application that is trusted and more functional than something I would have rushed to create.

The performance of Blackwell PT Trainer is as smooth as I had originally envisioned; there is relatively no delay between interacting with the user interface and the data. Blackwell PT Trainer's simplistic design translates to seamless navigation throughout the app. The only real performance hit occurs when switching between themes in the settings menu (Figure 5). This is due to the application restarting the MainActivity after the theme change is completed. This causes the application to kick you back to the main workouts page every single time, which can feel a little clunky and not the behavior that a user might expect.

The greatest challenge in developing Blackwell PT Trainer was creating the checkboxes for each step in the WorkoutsDetailFragment [6]. This was a problem because of the way that I originally stored the content of a workout. At first, all of the content of a workout was stored as one long String, meaning I could not dynamically add the checkboxes at each of the steps. The solution was simple: I changed the content variable from a String to an ArrayList<String> where each different element in the ArrayList was a different step in the workout. After solving that portion of the problem, I had to figure out how to create the checkboxes dynamically when loading a new workout.

Most of the time in Android programming, you have to create an XML layout file beforehand that has all of the elements to be displayed already defined. In this case, each workout does not have the same amount of steps, so they needed to be created at runtime. Thankfully, there is a method .addView() that allows you to add new elements to the layout dynamically allowing me loop through my ArrayList and create a checkbox for each element. The last step in solving this challenge was making sure that the state of the checkboxes were saved in the preferences after every click so the application would remember if the user has already completed that step or not.

After solving the aforementioned problem, Blackwell PT Trainer evolved from simply a readable, scrollable workout program to an interactive workout program that can save your progress. This allows users to actually feel like they're interacting with the application instead of just reading from a pdf file. The ability to interact with the program in your own way, along with the custom icons created for the Blackwell PT Trainer application, makes the experience feel unique. Giving the user the ability to pair the unique experience that Blackwell PT Trainer brings, plus the familiarity of their favorite applications, allows less of a learning curve to use the application. Increasing the ease of use of the application could increase the amount of users because when something is difficult to use, most people just give up on it.

Located below is a table of planned versus implemented features. Even though I had high expectations of the amount of features that I could implement, I am still satisfied with the way Blackwell PT Trainer ended up. The application in its current form is still able to do everything that it needs to in order to be functional. The only feature that I wish I could have implemented before the end of the semester would have been the Facebook API support. Ideally it would have been awesome to be able to start a group to complete the program together with on Facebook and then be able to share your progress and statistics together in that group. This was something that my friend's unit wanted him to do to make sure he will keeping up with the program. I think adding that integration would have added a fun support system for people going through the program with someone else. Having a support system can help people stick to and accomplish their goals. Facebook is such a large social media platform at this point that almost everyone has a profile, so that would increase the usability of such a feature.

| Planned Features     | Implemented Features |
| -------------------- | -------------------- |
| Custom Icon          | Custom Icon          |
| Database             | SharedPreferences    |
| Tips Page            | Tips Page            |
| Facebook Integration | GPS Tracking         |
| Statistics Page      | Launch Timer App     |
| Push Notifications   |                      |
| GPS Tracking         |                      |
| Built-in Timers      |                      |

### Conclusions and Future Work
Before the creation of Blackwell PT Trainer, many soldiers in the US military that struggle to pass the PT Test had to create their own workouts in the hopes of improving their scores. The workouts that these soldiers need are supposed to be challenging in order to change their level of physical fitness. Now Blackwell PT Trainer is a viable solution that can help gives soldiers a plan and structure to their workouts with a program that is targeted towards fast results. The application allows the user to input when they have finished different parts of a workout and save their progress. Blackwell PT Trainer is a simple, effective solution to a problem that has never been tackled in the phone application realm before.

Some lessons that I have learned from the Blackwell PT Trainer project would be that test driven development and writing clean code will increase productivity and understanding when reviewing old code. Towards the end of the project, I realized how difficult some of my code was to read so when I wanted to add new features it was taking me forever to remember what I was even doing last time. I took the last few days to refactor some of the code to make it more readable and easy to understand. If I wrote cleaner code from the start of the project, then I think I could have increased my productivity. This is a good skill to get in the habit of not only for myself, but for my career and the companies that I will work for in the future. The same goes for test driven development. If I started writing more tests for my code earlier, then I would have saved a lot of time figuring out what I need to fix and if the application is working as intended.

Blackwell PT Trainer is a unique application that I hope to work more on in the future in order to achieve more of the goals that I had originally set out to accomplish. I think this application can help soldiers perform the best they can on the PT Test and I would love for it to be available to everyone. After developing this project for a couple months, I have learned so much more about Android programming and I am thankful for that. The next Android project that I start will be able to be much more productive since I have acquired the skills and knowledge from this project.


### References

[1] https://www.bignerdranch.com/books/android-programming/

[2] https://developer.android.com/guide/

[3] https://developer.android.com/studio/

[4] https://github.com/Lailanater56/capstone/blob/master/app/src/main/java/com/lailperry/android/blackwellpttrainer/MainActivity.java

[5] https://github.com/Lailanater56/capstone/blob/master/app/src/main/java/com/lailperry/android/blackwellpttrainer/Workout.java

[6] https://github.com/Lailanater56/capstone/blob/master/app/src/main/java/com/lailperry/android/blackwellpttrainer/WorkoutsDetailFragment.java

[7] https://github.com/Lailanater56/capstone/blob/master/app/src/main/java/com/lailperry/android/blackwellpttrainer/WorkoutsList.java

[8] https://www.youtube.com/user/androiddevelopers



### Appendices

![Figure1](https://github.com/Lailanater56/capstone/blob/master/Final%20Technical%20Report%20Figures/Screenshot_20180506-210959.png)

## Figure 1

![Figure2](https://github.com/Lailanater56/capstone/blob/master/Final%20Technical%20Report%20Figures/Screenshot_20180506-211006.png)

## Figure 2

![Figure3](https://github.com/Lailanater56/capstone/blob/master/Final%20Technical%20Report%20Figures/Screenshot_20180506-211015.png)

## Figure 3

![Figure4](https://github.com/Lailanater56/capstone/blob/master/Final%20Technical%20Report%20Figures/Screenshot_20180506-211021.png)

## Figure 4

![Figure5](https://github.com/Lailanater56/capstone/blob/master/Final%20Technical%20Report%20Figures/Screenshot_20180506-211026.png)

## Figure 5

![Figure6](https://github.com/Lailanater56/capstone/blob/master/Final%20Technical%20Report%20Figures/Screenshot_20180506-211040.png)

## Figure 6
