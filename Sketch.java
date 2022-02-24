import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
  * Description:
  * Write a program that modifies the drawing using width and height varibales so it works with any sized window
  * @author: Hosey K
  */
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
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
    rect(width/-100, height/((float)100/89), width*(float)1.02, height/((float)20/3));
  
  // Drawing pathway
    fill(189, 189, 189);
    quad(width/(float)1.25, height, width/(float)1.2987012987, height/(float)1.08695652174, width/(float)1.69491525424, height/(float)1.08695652174, width/(float)1.78571428571, height);
  
  // Drawing house base
    fill(242, 234, 203);
    rect(width/(float)6.25, height/((float)25/11), width/((float)10/7), height/((float)25/12)); 

  // Drawing window base
    fill(0, 0, 0);
    rect(width/4, height/((float)50/31), width/((float)10/7), height/((float)25/12)); 

  // Drawing window glass
    fill(255, 255, 255);
    rect(width/((float)50/13), height/((float)100/63), width/((float)50/3), height/20);

    fill(255, 255, 255);
    rect(width/((float)100/33), height/((float)100/63), width/((float)50/3), height/20);

    fill(255, 255, 255);
    rect(width/((float)50/13), height/((float)100/69), width/((float)50/3), height/20);

    fill(255, 255, 255);
    rect(width/((float)100/33), height/((float)100/69), width/((float)50/3), height/20);  
  
  // Drawing door 
    fill(156, 98, 17);
    rect(width/(float)1.69491525424, height/(float)1.66666666667, width/(float)5.55555555556, height/(float)3.125);

  // Drawing door knob 
    fill(228, 235, 33);
    ellipse(width/(float)1.61290322581, height/(float)1.26582278481, width/25, height/25);

  // Drawing chimney
    fill(156, 98, 17);
    rect(width/(float)4.7619047619, height/(float)7.69230769231, width/(float)(6.66666666667), height/(float)3.44827586207);
  
  // Drawing roof
    fill(156, 98, 17);
    triangle(width/(float)9.09090909091, height/(float)2.12765957447, width/(float)1.96078431373, height/(float)8.33333333333, width/(float)1.0989010989, height/(float)2.12765957447);  
  }
  
}