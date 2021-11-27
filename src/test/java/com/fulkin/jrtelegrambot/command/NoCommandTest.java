package com.fulkin.jrtelegrambot.command;

import static com.fulkin.jrtelegrambot.command.CommandName.NO;
import static com.fulkin.jrtelegrambot.command.NoCommand.NO_MESSAGE;

class NoCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}