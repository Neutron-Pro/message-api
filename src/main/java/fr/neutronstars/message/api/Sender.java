package fr.neutronstars.message.api;

import net.md_5.bungee.api.chat.BaseComponent;

public interface Sender
{
    void send(BaseComponent... baseComponents);
}
