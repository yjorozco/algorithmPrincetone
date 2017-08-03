package helpers



public class StdIn {

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

public static int readInt(){

	return Integer.parseInt(this.reader.readLine());

}

public static boolean isEmty(){
	return reader.ready();
}


}