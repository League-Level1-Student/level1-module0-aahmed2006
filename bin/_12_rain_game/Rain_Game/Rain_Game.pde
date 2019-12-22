int y = 0;
int x = (int) random(400);
int score = 0;
int width = 20;
int height = 20;
int bucket = 350;
void setup(){
  size(400, 400);
}

void draw() {
  background(#0A0A0A);
  fill(#6FF5F1);
  noStroke();
  ellipse(x, y, width, height);
  y+=5;
  if(y==410) {
    y=0;
    ellipse(x, y, 20, 20);
  y++;
  }
  fill(#A5A5A5);
  rect(mouseX, 350, 50, 30);
  if(width > mouseX && 20 < mouseX+100  ) {
    score++;
    println("Your score is now: " + score);
  }
  fill(#FFFFFF);
  textSize(16);
  text("Score: " + score, 20, 20);
  }
 
