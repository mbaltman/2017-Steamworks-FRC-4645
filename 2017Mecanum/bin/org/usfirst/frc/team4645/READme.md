# List of files 

      Pipeline.java	
      Robot.java	
      TowerPipelineGreen.grip
      
      
## Purpose 
This code allows the mecanum drive center on a piece of retro reflective tape in  the x and y plane,  meaning it will  adjust how far away it is from a piece of tape and then it will adjust to center horizontally on the piece of tape.
      
### TowerPipelineGreen.grip 
This file can be opened with the program grip.  It filters out anything that is not a piece of green tape of a certain size. When calibrating to a new color, size, or lighting environment  this file can be adjusted  and then a new Pipeline.java file can be created.

### Pipeline.java
Pipeline.java is created in grip.  Open TowerPipelineGreen then generate code in java.  If any changes are made in the grip pipeline a new java file must be generated.  Then the pipeline is referenced in the robot code, so this file must be moved into the same folder as the robot code in the project that is built in eclipse. 


### Robot.java 
This is the robot code.  It is what is actually runs on the roborio. As of 1/24/17  it will  position the robot vertically and then horizontally in relationship to the tower using a mecanum drive.  
