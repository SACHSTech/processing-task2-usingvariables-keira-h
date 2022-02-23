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
    
	// Drawing grass 
    fill(163, 230, 115);
    rect(width/-100, height/(float)1.12359550562, width*(float)1.02, height/(float)(6.66666666667));
  
  // Drawing pathway
    fill(189, 189, 189);
    quad(400, 500, 385, 460, 295, 460, 280, 500);
  
  // Drawing house base
    fill(242, 234, 203);
    rect(width/(float)6.25, height/(float)2.27272727273, width/(float)1.42857142857, height/(float)2.08333333333); 

  // Drawing window base
    fill(0, 0, 0);
    rect(width/4, height/(float)1.61290322581, width/(float)6.66666666667, height/(float)7.69230769231); 

  // Drawing window glass
    fill(255, 255, 255);
    rect(width/(float)3.84615384615, height/(float)1.5873015873, width/(float)16.6666666667, height/20);

    fill(255, 255, 255);
    rect(width/(float)3.0303030303, height/(float)1.5873015873, width/(float)16.6666666667, height/20);

    fill(255, 255, 255);
    rect(width/(float)3.84615384615, height/(float)1.44927536232, width/(float)16.6666666667, height/20);

    fill(255, 255, 255);
    rect(width/(float)3.0303030303, height/(float)1.44927536232, width/(float)16.6666666667, height/20);  
  
  // Drawing door 
    fill(156, 98, 17);
    rect(295, 300, 90, height/(float)3.125);

  // Drawing door knob 
    fill(228, 235, 33);
    ellipse(310, 395, width/25, height/25);

  // Drawing chimney
    fill(156, 98, 17);
    rect(105, height/(float)7.69230769231, width/(float)(6.66666666667), 145);
  
  // Drawing roof
    fill(156, 98, 17);
    triangle(55, 235, 255, 60, 455, 235);  
  }
  
}