package designPattern.structural.adapter.shape;

import designPattern.structural.adapter.shape.apiExamples.Rhombus;
import designPattern.structural.adapter.shape.apiExamples.Triangle;
import designPattern.structural.adapter.shape.soluction.GeometricShapeObjectAdapter;
import designPattern.structural.adapter.shape.twowaysadapter.ShapeType;
import designPattern.structural.adapter.shape.twowaysadapter.TwoWaysAdapter;
//https://dzone.com/articles/adapter-design-pattern-in-java
public class ExampleShape {

	public static void main(String[] args) {
		
		System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));
        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
		
		
		
		/*System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();*/
        
        // two way -----------------
        System.out.println("Creating drawing of shapes...");
       // Drawing drawing = new Drawing();
        drawing.addShape(new TwoWaysAdapter(ShapeType.RECTANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.CIRCLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.TRIANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.RHOMBUS));
        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();        
        //--------------------------
        
        
	}

}
