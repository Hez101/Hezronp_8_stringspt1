package dostuffwithstrings_hezron_8;

import java.util.Scanner;

public class Dostuffwithstrings_hezron_8 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in); 
//The scanner is declared and initialized. Now I can read and interact 
//with the user's input.
System.out.println("Let's have a chat.");
//println is obvious, it prints what is given on a line.
System.out.println("(ENTER)");
String y = sc.nextLine();
//nextLine-tells the scanner to read the user's next input, which
//is the next written line.
//This input is then recorded as string.
System.out.println("Here's a question that many ponder throughout their lives...");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("Who am I?");
System.out.println("...");
System.out.println("For me, that question is not applicable,");
System.out.println("so...");
System.out.println("who are you?");
System.out.println("(ENTER)");
y = sc.nextLine();
String name = null; 
System.out.println("Seriously.");
System.out.println("(NAME)");
name = sc.nextLine();
for(int le= name.length();le<4;){
//.length returns the length of this string. 
//The length is the number of characters in the string.
//I then save this number as an int for comparison.
System.out.println("Now that's a name too short for my liking, sorry pal.");
System.out.println("(NAME)");
name = sc.nextLine();
le= name.length();
} 
//The new input is saved to a string.
System.out.println("Really? "+name+ "?");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("Hmm.");
System.out.println("(ENTER)");
y = sc.nextLine();
name= name.substring(0, 3);
//The string(NAME) is then reduced to the characters between 0 and 3.
//.substring returns a portion of the string. I tell it which character
//to start copying first and the last character to copy, where it should
//finish.
System.out.println("I'm going to call you..." + name);
System.out.println("Y'know, just 'cause.");
System.out.println("(ENTER)");
y = sc.nextLine();//////////
System.out.println("How have you been, " + name + "?");
System.out.println("(FEELINGS)");
y = sc.nextLine();
while(y.isEmpty()){
    //.isEmpty is basically checking if the string has no characters
    //in it (hint: is empty, literally)
System.out.println("(HOW ARE YOU?)");
y = sc.nextLine();
}
System.out.println("U gtt 2 B k3wl + type lk ths");
    System.out.println("FOR EXAMPLE:");
    System.out.println("'" + y.replace("a", "4").replace("e", "3").replace("i", "").replace("o", "").replace("u", "")
            .replace("s", "5")+ "'");
    //.replace does basically what it says-it replaces a character with another character
    //, or characters with other characters, in a string.
    System.out.println("(ENTER)");
    y = sc.nextLine();
System.out.println("So, what do you feel like talking about?");///////
System.out.println("(SUBJECT)");
String sub = sc.nextLine();
for(int s = sub.length();s<1;){
System.out.println("(SUBJECT, PLEASE)");
sub = sc.nextLine();
s = sub.length();
}
System.out.println("Yeah...");
System.out.println("...");
System.out.println("'"+ sub + "'"+ "...");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("...");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("Hey, do you, or do you not have a last name?");
System.out.println("(ENTER your LAST name:)");
String last = null; 
last = sc.nextLine();
int la = last.length();
boolean not = last.contains("no");
//Here I create a boolean that is true if the users input
//had "no" in it.
//.contains will return true only if the string contains the specific
//characters stated. Basically, it checks for specific words in
//the string/input.
if(not == false && la > 0){

while(last.contains("0") || last.contains("1") ||
last.contains("2") ||last.contains("3") ||
last.contains("4") ||last.contains("5") ||
last.contains("6") ||last.contains("7") ||
last.contains("8") ||last.contains("9")){
System.out.println("I didn't mind this before,");
System.out.println("but a real name doesn't have numbers pal");
System.out.println("(NAME)");
last = sc.nextLine();
}
last = last.substring(0, 1);
last=last.toUpperCase();
System.out.println(name.concat(" ".concat(last.toUpperCase().concat(", got it."))));
//.concat is kind of like the plus sign(+) in the sense that it combines
//code to be more.
//.concat adds new characters to old characters.

}
else if(last.isEmpty() || not == true){
System.out.println("Just " + name + ", got it");
}

System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("So, you're " + name + " " + last + " and you like");
System.out.println("to talk about " + "'" + sub + "'" + " for some reason.");
System.out.println("Well, that's nice.");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("Hey, I haven't gotten out today.");
System.out.println("What's the weather like?");
System.out.println("(WHETHER)");
System.out.println("I mean,");
System.out.println("(WEATHER REPORT, please)");
y = sc.nextLine();
if(y.endsWith(".")){System.out.println("I appriciate the punctuations");
//.endsWith just checks if the string ends with a specific
//character/s
//It checks what the ending of the string is.
System.out.println("y'know.");}
else{
System.out.println("Not the type to use");
System.out.println("periods huh?");
}
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("Anyways, somewhere in world,");
System.out.println("it's raining, and it's raining hard.");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("Somewhere else, though, the sun is shining,");
System.out.println("and the"
+ " breeze is just right.");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("I guess it's more about perspective-");
System.out.println("seeing the big picture, y'know.");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("Always something better.");
System.out.println("Always something worse.");
System.out.println("...");
System.out.println("(ENTER)");
y = sc.nextLine();
System.out.println("Don't you think?");
System.out.println("(RESPOND)");
y = sc.nextLine();
System.out.println("Well, Guess I'll see you later then, " + name + last
+ ".");
System.out.println("Bye.");

}

}