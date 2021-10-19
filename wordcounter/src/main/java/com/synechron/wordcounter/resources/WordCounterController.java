package com.synechron.wordcounter.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.wordcounter.service.WordCounterService;

@RestController
@RequestMapping("/wordcounter")
public class WordCounterController {
	
	@Autowired
	WordCounterService wordCounterService;
	
	@PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestParam String word) {
		wordCounterService.addWord(word);		
    }
	
	@GetMapping("/count")
    public Integer getCount(@RequestParam String word) {
        return wordCounterService.getWordCount(word);
    }
}
