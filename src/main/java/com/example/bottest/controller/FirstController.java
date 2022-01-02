package com.example.bottest.controller;


import com.example.bottest.bot.MyBot;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class FirstController {

    private MyBot myBot;

    public FirstController(MyBot myBot) {
        this.myBot = myBot;
    }

    @PostMapping
    public BotApiMethod<?> method(@RequestBody Update update){
        return myBot.onWebhookUpdateReceived(update);
    }
}
