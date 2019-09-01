int x = 200;
int y = 200;
int speed = 5;
void setup() {
  size(300, 300);
}
void draw() {
  background(#0A0A0A);
  fill(#AE2DDE);
  noStroke();
  ellipse(x, y, 15, 15);
  x+=speed;
 
  fill(#FFFFFF);
  rect(mouseX, 290, 50, 10);
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }
