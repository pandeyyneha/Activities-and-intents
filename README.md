# Activities-and-intents
Two Activities

Create and build an app called Two Activities that, unsurprisingly, contains two Activity implementations. You build the app in three stages.

In the first stage, you create an app whose main activity contains one button, Send. When the user clicks this button, your main activity uses an intent to start the second activity.

In the second stage, you add an EditText view to the main activity. The user enters a message and clicks Send. The main activity uses an intent to start the second activity and send the user's message to the second activity. The second activity displays the message it received.

In the final stage of creating the Two Activities app, you add an EditText and a Reply button to the second activity. The user can now type a reply message and tap Reply, and the reply is displayed on the main activity. At this point, you use an intent to pass the reply back from the second activity to the main activity.<br><br>
<img src="/Screenshots/two activities.gif" width="190" height="350"/>
<br>
<b>Challenge</b><br>
An app with three Button elements labeled Text One, Text Two, and Text Three. When any of these Button elements are clicked, launch a second Activity. That second Activity contain a ScrollView that displays one of three text passages. An Intent to launch the second Activity with extras to indicate which of the three passages to display.<br><br>
<img src="/Screenshots/two activities_c.gif" width="190" height="350"/>
<br>
<b>Homework</b><br>
Modify the Toast button so that it launches a new Activity to display the word "Hello!" and the current count. Change the text on the Toast button to Say Hello.<br><br>
<img src="/Screenshots/two activities_h.gif" width="190" height="350"/>

Question 1
<b>What changes are made when you add a second Activity to your app by choosing File > New > Activity and an Activity template?</b>

Ans - The second Activity is added as a Java class, the XML layout file is created, and the AndroidManifest.xml file is changed to declare a second Activity.

Question 2
<b>What happens if you remove the android:parentActivityName and the elements from the second Activity declaration in the AndroidManifest.xml file?</b>

Ans - The Up button in the app bar no longer appears in the second Activity to send the user back to the parent Activity.

Question 3
<b>Which constructor method do you use to create a new explicit Intent? Choose one:</b>

Ans - new Intent(Context context, Class<?> class)

Question 4
<b>In the HelloToast app homework, how do you add the current value of the count to the Intent?</b>

Ans - As an Intent extra

Question 5
<b>In the HelloToast app homework, how do you display the current count in the second "Hello" Activity?</b>

Ans - All of the above.
