package com.fulkin.jrtelegrambot.command;

import com.fulkin.jrtelegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author Fulkin
 * Created on 27.11.2021
 */

public class NoCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String NO_MESSAGE =
            "Я поддерживаю команды, начинающиеся с символа \"/\". \n" +
            "Чтобы посмотреть список команд введите /help.";

    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(
                update.getMessage().getChatId().toString(),
                NO_MESSAGE
        );
    }
}
