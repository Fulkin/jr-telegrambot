package com.fulkin.jrtelegrambot.command;

import static com.fulkin.jrtelegrambot.command.CommandName.START;
import static com.fulkin.jrtelegrambot.command.StartCommand.START_MESSAGE;

class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}