  
import processing.sound.*;
SoundFile file;

void setup(){
  size(500,500);
  noStroke();
  fill(256,150,100);
  ellipse(250,250,200,200);
  fill(256,0,0);
  ellipse(250,250,180,180);
  fill(230,200,0);
  ellipse(250,250,170,170);
  file = new SoundFile(this, "ding.wav");     //in the setup method
}
void draw(){
  
  PImage pepperoni = loadImage("pepperoni.ppm.gif");
  pepperoni.resize(30,30);
  
    if(mousePressed){
     



file.play();     //where you want the sound to play
  image(pepperoni,mouseX,mouseY); 
  
    }
}