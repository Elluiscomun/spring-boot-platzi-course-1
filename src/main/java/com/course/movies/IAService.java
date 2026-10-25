package com.course.movies;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface IAService {

    @UserMessage("""
            Genera un saludo de bienvenida haciendo una pregunta avanzada de ingenieria de software
            """)
    String generateGreeting();

}
