package fr.neutronstars.message.api;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;

public interface Message
{
    Message next(String text);

    Message nextln();

    Message nextln(String text);

    Message color(ChatColor color);

    Message italic(boolean italic);

    Message bold(boolean bold);

    Message obfuscated(boolean obfuscated);

    Message strikethrough(boolean strikethrough);

    Message underlined(boolean underlined);

    Message insertion(String insertion);

    Message click(ClickEvent.Action action, String value);

    Message hover(String text);

    Message hover(HoverEvent.Action action, BaseComponent component);

    Message extra(String text);

    Message extra(BaseComponent baseComponent);

    void send();

    Message clone();
}
