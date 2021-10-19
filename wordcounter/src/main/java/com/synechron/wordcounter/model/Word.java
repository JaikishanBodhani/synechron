package com.synechron.wordcounter.model;

import org.springframework.stereotype.Component;

@Component
public class Word {
    private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}
   
	
	
    
}