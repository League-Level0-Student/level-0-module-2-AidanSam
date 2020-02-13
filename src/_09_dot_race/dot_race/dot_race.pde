//1. Make a variable to hold the X co-ordinate of the dot and set it to 50.
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
void setup() {
    size(4000, 500);
}
int x=0;
int y=0;
int z=0;
void draw() {
  
 background(#FFFFFF);
 if (mousePressed) {
   x+=12;
   y+=13;
   z+=20;
  }
  fill(#6F7E2D);
  ellipse(50 + x,100,100,100);
  fill(#54A062);
  ellipse(50 + y,250,100,100);
  fill(#00FF30);
  ellipse(50 + z,400,100,100);
    //3. make the ellipse a nice color
if (x==3950){
  playsound()
}
    //4. If the mouse is pressed change the X co-ordinate so that the dot moves to the right

    //5. Make your dot move faster
    //  (you have to figure out what part of your code to change)

    //2. Draw an ellipse of height and width 10. Make sure to use your variable for the X position.
 
    //6. Use the playSound() method to play a ding when your dot crosses the finish line. 
}
