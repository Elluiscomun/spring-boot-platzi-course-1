package com.movies.movies;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService 
public interface AIService {

    @UserMessage("""
        Ask me a hard question about software engineer
        """)
    String generateGreeting();
}
