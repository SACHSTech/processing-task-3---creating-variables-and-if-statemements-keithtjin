import processing.core.PApplet;

public class Sketch extends PApplet {
    float x, y; // Declare variables for object position

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(210, 255, 173);
    }

    public void draw() {
        // Generate random positions for the object
        x = random(width);
        y = random(height);

        // Draw the object at the random position
        ellipse(x, y, 50, 50);

        // Use if statements and logical operators to change the drawing
        if (x < width / 2 && y < height / 2) {
            background(220);  // Change background color for the top-left quadrant
            fill(255, 0, 0);  // Red color
        } else if (x < width / 2 && y >= height / 2) {
            background(220);  // Change background color for the bottom-left quadrant
            fill(0, 0, 255);  // Blue color
        } else if (x >= width / 2 && y < height / 2) {
            background(220);  // Change background color for the top-right quadrant
            fill(0, 255, 0);  // Green color
        } else {
            background(220);  // Change background color for the bottom-right quadrant
            fill(255);  // White color
        }

        // Display the current time
        String time = nf(hour(), 2) + ":" + nf(minute(), 2) + ":" + nf(second(), 2);
        textSize(24);
        fill(0);
        text("Current Time: " + time, 20, 30);

        // Additional code for your requirements
        // You can add more objects and if statements here to further customize the drawing.
    }
}