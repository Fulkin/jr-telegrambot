package com.fulkin.jrtelegrambot.command;


import static com.fulkin.jrtelegrambot.command.UnknownCommand.UNKNOWN_MESSAGE;

class UnknownCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return "/fgergerhe";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}