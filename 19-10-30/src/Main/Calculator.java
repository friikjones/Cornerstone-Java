package Main;


import javax.swing.*;

public class Calculator {
	public float Add(float a, float b) {
		return a + b;
	}
	public int Add(int a, int b) {
		return a + b;
	}
	public float Sub(float a, float b) {
		return a - b;
	}
	public float Mult(float a, float b) {
		return a * b;
	}
	public float Div(float a, float b) {
		return a / b;
	}
	public float Sqr(float a) {
		return a * a;
	}
	public float Sqrt(float a) {
		return (float) Math.sqrt(a);
	}
	public float Pow(float a, float b) {
		return (float) Math.pow(a, b);
	}
	public float Root(float a, float b) {
		return (float) Math.pow(a, 1/b);
	}
	
	
	JFrame frame = new JFrame();

	
}