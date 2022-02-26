package fr.neutronstars.message.api;

import net.md_5.bungee.api.ChatColor;

public interface Component<T extends Component<?>>
{
    /**
     * Go to the next text which will have a different behavior than the previous one.
     *
     * @param text The next text of new component
     * @return this instance of message
     */
    T next(String text);

    /**
     * Go to the next line of the chat.
     *
     * @return this instance of message
     */
    T nextln();

    /**
     * Go to the next line of the chat and insert the next text which will have a different behavior than the previous one.
     *
     * @param text The next text of new component
     * @return this instance of message
     */
    T nextln(String text);

    /**
     * Put a color on the current text.
     * (You must first have called the {@link T#next(String)} or  {@link T#nextln(String)} method)
     *
     * @param color the new color of current text.
     * @return this instance of message
     */
    T color(ChatColor color);

    /**
     * Add or remove italic on the current text.
     * (You must first have called the {@link T#next(String)} or  {@link T#nextln(String)} method)
     *
     * @param italic Add or remove italic
     * @return this instance of message
     */
    T italic(boolean italic);

    /**
     * Add or remove bold on the current text.
     * (You must first have called the {@link T#next(String)} or  {@link T#nextln(String)} method)
     *
     * @param bold Add or remove bold
     * @return this instance of message
     */
    T bold(boolean bold);

    /**
     * Add or remove obfuscated on the current text.
     * (You must first have called the {@link T#next(String)} or  {@link T#nextln(String)} method)
     *
     * @param obfuscated Add or remove obfuscated
     * @return this instance of message
     */
    T obfuscated(boolean obfuscated);

    /**
     * Add or remove strikethrough on the current text.
     * (You must first have called the {@link T#next(String)} or  {@link T#nextln(String)} method)
     *
     * @param strikethrough Add or remove strikethrough
     * @return this instance of message
     */
    T strikethrough(boolean strikethrough);

    /**
     * Add or remove underlined on the current text.
     * (You must first have called the {@link T#next(String)} or  {@link T#nextln(String)} method)
     *
     * @param underlined Add or remove underlined
     * @return this instance of message
     */
    T underlined(boolean underlined);
}
