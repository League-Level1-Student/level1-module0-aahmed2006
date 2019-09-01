int y = 0;
int randomNumber = (int) random(400);
int score = 0;
int width = 20;
int height = 20;
void setup(){
  size(400, 400);
}

void draw() {
  background(#0A0A0A);
  fill(#6FF5F1);
  noStroke();
  ellipse(randomNumber, y, width, height);
  y++;
  if(y==410) {
    y=0;
    int random2 = (int) random(400);
    ellipse(random2, y, 20, 20);
  y++;
  }
  fill(#A5A5A5);
  rect(mouseX, 350, 50, 30);
  checkCatch(randomNumber);
  fill(#FFFFFF);
  textSize(16);
  text("Score: " + score, 20, 20);
  }
  void checkCatch(int x){
         if (x > mouseX && x < mouseX+50)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
