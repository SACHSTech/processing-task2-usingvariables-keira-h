import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(207, 244, 250);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    
	// Drawing grass 
    fill(163, 230, 115);
    rect(-5, 445, 510, 75);
  
  // Drawing pathway
    fill(189, 189, 189);
    quad(400, 500, 385, 460, 295, 460, 280, 500);
  
  // Drawing house base
    fill(242, 234, 203);
    rect(80, 220, 350, 240); 

  // Drawing window base
    fill(0, 0, 0);
    rect(125, 310, 75, 65); 

  // Drawing window glass
    fill(255, 255, 255);
    rect(130, 315, 30, 25);

    fill(255, 255, 255);
    rect(165, 315, 30, 25);

    fill(255, 255, 255);
    rect(130, 345, 30, 25);

    fill(255, 255, 255);
    rect(165, 345, 30, 25);  
  
  // Drawing door 
    fill(156, 98, 17);
    rect(295, 300, 90, 160);

  // Drawing door knob 
    fill(228, 235, 33);
    ellipse(310, 395, 20, 20);

  // Drawing chimney
    fill(156, 98, 17);
    rect(105, 65, 75, 145);
  
  // Drawing roof
    fill(156, 98, 17);
    triangle(55, 235, 255, 60, 455, 235);  
  }
  
}