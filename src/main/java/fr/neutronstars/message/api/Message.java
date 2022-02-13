package fr.neutronstars.message.api;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;

/**
 * Build a message with special interactions in the player chat.
 */
public interface Message
{
    /**
     * Go to the next text which will have a different behavior than the previous one.
     *
     * @param text The next text of new component
     * @return this instance of message
     */
    Message next(String text);

    /**
     * Go to the next line of the chat.
     *
     * @return this instance of message
     */
    Message nextln();

    /**
     * Go to the next line of the chat and insert the next text which will have a different behavior than the previous one.
     * @param text The next text of new component
     * @return this instance of message
     */
    Message nextln(String text);

    /**
     * Put a color on the current text.
     * (You must first have called the {@link Message#next(String)} or  {@link Message#nextln(String)} method)
     *
     * @param color the new color of current text.
     * @return this instance of message
     */
    Message color(ChatColor color);

    /**
     * Add or remove italic on the current text.
     * (You must first have called the {@link Message#next(String)} or  {@link Message#nextln(String)} method)
     *
     * @param italic Add or remove italic
     * @return this instance of message
     */
    Message italic(boolean italic);

    /**
     * Add or remove bold on the current text.
     * (You must first have called the {@link Message#next(String)} or  {@link Message#nextln(String)} method)
     *
     * @param bold Add or remove bold
     * @return this instance of message
     */
    Message bold(boolean bold);

    /**
     * Add or remove obfuscated on the current text.
     * (You must first have called the {@link Message#next(String)} or  {@link Message#nextln(String)} method)
     *
     * @param obfuscated Add or remove obfuscated
     * @return this instance of message
     */
    Message obfuscated(boolean obfuscated);

    /**
     * Add or remove strikethrough on the current text.
     * (You must first have called the {@link Message#next(String)} or  {@link Message#nextln(String)} method)
     *
     * @param strikethrough Add or remove strikethrough
     * @return this instance of message
     */
    Message strikethrough(boolean strikethrough);

    /**
     * Add or remove underlined on the current text.
     * (You must first have called the {@link Message#next(String)} or  {@link Message#nextln(String)} method)
     *
     * @param underlined Add or remove underlined
     * @return this instance of message
     */
    Message underlined(boolean underlined);

    /**
     * The text to insert when this component is clicked while pressing the shift key
     *
     * @param insertion The text to insert
     * @return this instance of message
     */
    Message insertion(String insertion);

    /**
     * The action to be performed by clicking on the current text.
     *
     * @param action The action to be performed
     * @param value determines what the action should show or perform.
     * @return this instance of message
     */
    Message click(ClickEvent.Action action, String value);

    /**
     * The text to be displayed when hovering over the current text.
     *
     * @param text The text to be displayed
     * @return this instance of message
     */
    Message hover(String text);

    /**
     * The action to perform when hovering over the current text.
     *
     * @param action The action to perform
     * @param component determines what the action should show or perform.
     * @return this instance of message
     */
    Message hover(HoverEvent.Action action, BaseComponent component);

    /**
     * Add a text with the same format and events as the current text.
     *
     * @param text the new text with the same format and events as the current text.
     * @return this instance of message
     */
    Message extra(String text);

    /**
     * Add a component with the same format and events as the current text.
     *
     * @param baseComponent the new component with the same format and events as the current text.
     * @return this instance of message
     */
    Message extra(BaseComponent baseComponent);

    /**
     * Send the components to the sender
     */
    void send();

    /**
     * Create a new instance with the components of this instance.
     *
     * @return create a new instance of message
     */
    Message clone();
}
