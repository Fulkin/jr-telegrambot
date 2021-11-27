package com.fulkin.jrtelegrambot.command;

import com.fulkin.jrtelegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.fulkin.jrtelegrambot.command.CommandName.*;

/**
 * @author Fulkin
 * Created on 27.11.2021
 */

public class HelpCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format(""
           + "<b>Доступные команды</b>\n"
           + "<b>Начать\\закончить работу с ботом</b>\n"
           + "%s - начать работу с ботом\n"
           + "%s - приостановить работу с ботом\n"
           + "%s - команды для работы с ботом\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName()
    );

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(
                update.getMessage().getChatId().toString(),
                HELP_MESSAGE
        );
    }
}
