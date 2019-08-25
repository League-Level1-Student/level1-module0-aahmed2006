int randomx = (int) random(400);
int randomy = (int) random(400);
void setup() {
  size(400, 400);
  background(#000000);
}
void draw() {
  for(int i = 0; i < 300; i++) {
    fill(#FA0303);
    ellipse(randomx, randomy, 10, 10);
    randomx++;
    randomy++;
    if(randomx >= randomx+20 && randomy >= randomy+20) {
      randomy=randomy+20;
      randomx=randomx+20;
    }
  }
}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
