package fr.neutronstars.message.api;

/**
 * Component of type closeable.
 */
public interface CloseableComponent extends Component<CloseableComponent>
{
    /**
     * Allows you to return to the parent component once this one is finished.
     *
     * @return back to message to the end of this component.
     */
    MessageComponent close();
}
