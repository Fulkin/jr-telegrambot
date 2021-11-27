package com.fulkin.jrtelegrambot.service;

import com.fulkin.jrtelegrambot.bot.JrTelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author Fulkin
 * Created on 27.11.2021
 */
@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final JrTelegramBot telegramBot;

    @Autowired
    public SendBotMessageServiceImpl(JrTelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            telegramBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            //TODO add logging to the project
            e.printStackTrace();
        }
    }
}
