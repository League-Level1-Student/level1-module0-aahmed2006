
PImage record;
int angle = 0;
void setup() {
  size(300, 300);
  record = loadImage("record.png");
  record.resize(300, 300);
}
void draw() {
  if(mousePressed) {
  rotateImage(record, angle);
  }
  image(record, 0, 0);
  angle+=1000;
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
