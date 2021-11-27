package com.fulkin.jrtelegrambot.command;

import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author Fulkin
 * Created on 20.11.2021
 */

public interface Command {
    /**
     ** @param update provided {@link Update} object with all the needed data for command.
     */
    void execute(Update update);
}
