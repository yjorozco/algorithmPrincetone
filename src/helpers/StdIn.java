package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdIn {

	static BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

public static int readInt() throws NumberFormatException, IOException{

	return Integer.parseInt(reader.readLine());

}

public static boolean isEmpty() throws IOException{
	return reader.ready();
}


}