package Handler;

import java.util.Scanner;

public class Keyboard {
	Scanner scanner = new Scanner(System.in);
	
	public boolean nextBoolean() {
		return scanner.hasNextBoolean();
	}
	
	public byte nextByte() {
		return scanner.nextByte();
	}
	
	public double nextDouble() {
		return scanner.nextDouble();
	}
	
	public float nextFloat() {
		return scanner.nextFloat();
	}
	
	public int nextInt() {
		return scanner.nextInt();
	}
	
	public String nextLine() {
		return scanner.nextLine();
	}
	
	public long nextLong() {
		return scanner.nextLong();
	}
	
	public short nextShort() {
		return scanner.nextShort();
	}
	
	public boolean hasNext() {
		return scanner.hasNext();
	}
}
