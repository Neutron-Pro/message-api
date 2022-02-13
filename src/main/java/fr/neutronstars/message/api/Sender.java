package fr.neutronstars.message.api;

import net.md_5.bungee.api.chat.BaseComponent;

/**
 * The entity/entities that will receive the components
 */
public interface Sender
{
    /**
     * Send a list of components to a player.
     * @param baseComponents The chat components to send
     */
    void send(BaseComponent... baseComponents);
}
