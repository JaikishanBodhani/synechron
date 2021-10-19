package com.synechron.wordcounter.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.wordcounter.exception.WordException;
import com.synechron.wordcounter.exception.WordNotFoundException;
import com.synechron.wordcounter.util.Translator;
import com.synechron.wordcounter.util.Util;

@Service
public class WordCounterService {
	
	@Autowired
	Util util;
	
	@Autowired
	Translator translateUtil;
	
	HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
	
	public int getWordCount(String word) {
		if(!util.isStringOnlyAlphabet(word)) {
			throw new WordException();
		}
		Integer count = wordMap.get(word);
		if(count==null) {
			throw new WordNotFoundException();
		}
        return count;
    }	
	 
	public void addWord(String word) {
		if(!util.isStringOnlyAlphabet(word)) {
			throw new WordException();
		}
		String translateWord=translateUtil.translate(word);
		if(wordMap.containsKey(translateWord)) {
			wordMap.put(translateWord,wordMap.get(translateWord)+1);
		}else {
			wordMap.put(translateWord,1);			
		}
    }

	

}
