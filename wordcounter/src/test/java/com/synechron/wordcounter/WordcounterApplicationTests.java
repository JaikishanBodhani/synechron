package com.synechron.wordcounter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.synechron.wordcounter.service.WordCounterService;

@SpringBootTest
class WordcounterApplicationTests {

	@Mock
	WordCounterService wordCounterService;
	
	
	
	@Test
    public void addWordTest()
    {
        String word="Jaikishan1";
        wordCounterService.addWord(word);
        verify(wordCounterService, times(1)).addWord(word);       
    }
	
	@Test
    public void getWordCountTest()
    {
        when(wordCounterService.getWordCount("Jaikishan")).thenReturn(2);         
        Integer count = wordCounterService.getWordCount("Jaikishan");         
        assertEquals(2, count);
        
    }
     
}
