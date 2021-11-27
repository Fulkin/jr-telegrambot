package com.fulkin.jrtelegrambot.service;

import com.fulkin.jrtelegrambot.bot.JrTelegramBot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@DisplayName("Unit-level testing for SendBotMessageService")
class SendBotMessageServiceImplTest {
    private SendBotMessageService sendBotMessageService;
    private JrTelegramBot jrTelegramBot;

    @BeforeEach
    public void init() {
        jrTelegramBot = Mockito.mock(JrTelegramBot.class);
        sendBotMessageService = new SendBotMessageServiceImpl(jrTelegramBot);
    }

    @Test
    void shouldProperlySendMessage() throws TelegramApiException {
        //given
        String chatId = "test_chat_id";
        String message = "test_message";
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(message);
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        //when
        sendBotMessageService.sendMessage(chatId, message);
        //then
        Mockito.verify(jrTelegramBot).execute(sendMessage);
    }
}