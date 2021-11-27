package com.fulkin.jrtelegrambot.command;

import static com.fulkin.jrtelegrambot.command.CommandName.HELP;
import static com.fulkin.jrtelegrambot.command.HelpCommand.HELP_MESSAGE;

class HelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}