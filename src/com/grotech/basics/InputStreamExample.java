package com.grotech.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	/*Types
	 * 1. FileInputStream - InputStream
	 * 2. ByteArrayInputStream - byte[] b1 = {2,5,3,6,7};
	 * 3. ObjectInputStream - Student - serializable student
	 * 
	 * Methods of InputStream:
	 * 	1. read() - reads one byte of data at once from the IS. 
	 *  2. read(byte[] arrayOfBytes) - read from source and store in array.
	 *  3. available() - How much more data is available. 
	 *  4. mark() - marks the position in the input stream.
	 *  5. reset() - resets mark
	 *  6. close() - close the input stream
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] array = new byte[100];
		
		try {
			InputStream is = new FileInputStream("abc.txt");
			is.read(array);
			
			String data = new String(array);
			System.out.println(data);
			
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
