package fr.neutronstars.message.api;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;

/**
 * Build a message with special interactions in the player chat.
 */
public interface MessageComponent extends Component<MessageComponent>
{
    /**
     * The text to insert when this component is clicked while pressing the shift key
     *
     * @param insertion The text to insert
     * @return this instance of message
     */
    MessageComponent insertion(String insertion);

    /**
     * The action to be performed by clicking on the current text.
     *
     * @param action The action to be performed
     * @param value determines what the action should show or perform.
     * @return this instance of message
     */
    MessageComponent click(ClickEvent.Action action, String value);

    /**
     * The text to be displayed when hovering over the current text.
     *
     * @param text The text to be displayed
     * @return this instance of message
     */
    CloseableComponent hover(String text);

    /**
     * The action to perform when hovering over the current text.
     *
     * @param action The action to perform
     * @param text The text to be displayed
     * @return this instance of message
     */
    CloseableComponent hover(HoverEvent.Action action, String text);

    /**
     * Add a text with the same format and events as the current text.
     *
     * @param text the new text with the same format and events as the current text.
     * @return this instance of message
     */
    MessageComponent extra(String text);

    /**
     * Add a component with the same format and events as the current text.
     *
     * @param baseComponents the new components with the same format and events as the current text.
     * @return this instance of message
     */
    MessageComponent extra(BaseComponent... baseComponents);

    /**
     * Build the list of components used for this message.
     *
     * @return the components array of this message.
     */
    BaseComponent[] build();

    /**
     * Send the components to the sender
     */
    void send();

    /**
     * Create a new instance with the components of this instance.
     *
     * @return create a new instance of message
     */
    MessageComponent clone();
}
