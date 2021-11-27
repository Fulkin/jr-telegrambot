package com.fulkin.jrtelegrambot.service;

/**
 * @author Fulkin
 * Created on 27.11.2021
 */

public interface SendBotMessageService {
    /**
     * Send message via telegram bot.
     *
     * @param chatId provided chatId in which messages would be sent.
     * @param message provided message to be sent.
     *
     */
    void sendMessage(String chatId, String message);
}
