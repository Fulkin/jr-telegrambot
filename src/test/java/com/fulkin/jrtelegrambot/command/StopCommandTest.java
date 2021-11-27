package com.fulkin.jrtelegrambot.command;

import static com.fulkin.jrtelegrambot.command.CommandName.STOP;
import static com.fulkin.jrtelegrambot.command.StopCommand.STOP_MESSAGE;

class StopCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}