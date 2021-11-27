package com.fulkin.jrtelegrambot.command;

import com.fulkin.jrtelegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author Fulkin
 * Created on 27.11.2021
 */

public class StopCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String STOP_MESSAGE =
            "Деактивировал все ваши подписки \uD83D\uDE1F.";

    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(
                update.getMessage().getChatId().toString(),
                STOP_MESSAGE);
    }
}
