package com.joke.jokegenerator.services;

import com.joke.jokegenerator.quotes.MyQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
public class SelfJokeImpl implements JokeService {

    private  final MyQuotes myQuotes;

    public SelfJokeImpl() {
        this.myQuotes = new MyQuotes();
    }

    @Override
    public String getJoke() {
        return myQuotes.getRandomQuote();
    }

}
