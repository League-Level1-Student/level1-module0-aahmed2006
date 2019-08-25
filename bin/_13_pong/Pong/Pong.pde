int x = 200;
int y = 200;
int speed = 5;
void setup() {
  size(400, 400);
  
}

void draw() {
  background(#0A0A0A);
  fill(#F70207);
  noStroke();
  ellipse(x, y, 15, 15);
  x+=speed;
  if(x==400) {
    x--;
  } if(x==0) {
    x++;
  }
  y+=speed;
  if(y==400) {
    y--;
  } if(y==0) {
    y++;
  }
  fill(#C49D63);
  rect(mouseX, 350, 50, 20);
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }
