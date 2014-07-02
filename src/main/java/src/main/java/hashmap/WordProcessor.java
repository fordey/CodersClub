package src.main.java.hashmap;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class WordProcessor {

	public static void main(String[] args) {
		
		try {
			
			Map<String, Integer> wordCount = new HashMap<String, Integer>();
			List<String> lines = FileUtils.readLines(new File("C:/Users/Paul/Documents/test.txt"));
			
			for(String line : lines){
					
				String[] words = line.split(" ");
				
				for(String word : words){
					int count = wordCount.containsKey(word) ? wordCount.get(word): 0 ;
					wordCount.put(word, count + 1);	
					
				}	
			}
			
			System.out.println(wordCount.toString());		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
