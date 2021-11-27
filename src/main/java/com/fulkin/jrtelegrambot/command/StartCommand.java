package com.fulkin.jrtelegrambot.command;

import com.fulkin.jrtelegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author Fulkin
 * Created on 27.11.2021
 */

public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String START_MESSAGE = "" +
            "Привет, я JRTelegramBot. Я помогу тебе быть в курсе последних" +
            " статей тех авторов, которые тебе интересны. Я еще маленький и только учусь.";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(
                update.getMessage().getChatId().toString(),
                START_MESSAGE
        );
    }
}
