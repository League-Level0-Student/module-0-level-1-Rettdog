void setup(){
  size(350,300);
PImage face = loadImage("face.jpeg");
face.resize(350,300);
image(face, 0, 0);
}
void draw(){
  noStroke();
  fill(mouseX,250,mouseY);
  ellipse(150,119,30,20);
  ellipse(240,127,30,20);
  fill(0,0,0);
  ellipse(150,119,15,15);
  ellipse(240,127,15,15);
}