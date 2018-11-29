package demo.springboot;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
  public static void main(String[] args) throws IOException {
	InputStream in = System.in;
	int read = in.read();
	System.out.println(read);
	int read2 = in.read();
	System.out.println(read2+"--");
	InputStreamReader isr=new InputStreamReader(in);
	System.out.println((char)isr.read());
	System.out.println(isr.read()+"---");
}
}
