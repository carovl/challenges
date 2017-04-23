import java.io.*;
import java.lang.*;

//este codigo lee las palabras de cada linea de un fichero y las imprime al reves
//https://www.codeeval.com/open_challenges/8/
//public class Main {
public class reverse {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
       
        while ((line = buffer.readLine()) != null) {
		
      		String[] words = line.split(" ");
		int i= words.length-1;
		while(i>=0){
			System.out.print(words[i]+" ");
			i--;
			
		}
		System.out.println("");
		
            
        }
    }
}
// /home/drpc/Dropbox/Wargames/code_eval/test_reverse.txt
