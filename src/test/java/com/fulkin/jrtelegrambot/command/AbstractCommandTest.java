package com.fulkin.jrtelegrambot.command;

import com.fulkin.jrtelegrambot.bot.JrTelegramBot;
import com.fulkin.jrtelegrambot.command.Command;
import com.fulkin.jrtelegrambot.service.SendBotMessageService;
import com.fulkin.jrtelegrambot.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author Fulkin
 * Created on 27.11.2021
 */

abstract class AbstractCommandTest {

    protected JrTelegramBot jrTelegramBot = Mockito.mock(JrTelegramBot.class);
    protected SendBotMessageService sendBotMessageService = new SendBotMessageServiceImpl(jrTelegramBot);

    abstract String getCommandName();
    abstract String getCommandMessage();
    abstract Command getCommand();

    @Test
    void shouldProperlyExecuteCommand() throws TelegramApiException {
        //given
        Long chatId = 123456787654L;

        Update update = new Update();
        Message message = Mockito.mock(Message.class);
        Mockito.when(message.getChatId()).thenReturn(chatId);
        Mockito.when(message.getText()).thenReturn(getCommandName());
        update.setMessage(message);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(getCommandMessage());
        sendMessage.enableHtml(true);

        //when
        getCommand().execute(update);

        //then
        Mockito.verify(jrTelegramBot).execute(sendMessage);
    }
}
