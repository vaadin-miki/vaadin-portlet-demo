package org.vaadin.miki.portlet;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author miki
 * @since 2019-02-08
 */
@Route("")
public class PortletUI extends com.vaadin.flow.portlet.PortletUI {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortletUI.class);

    public PortletUI() {
        super();

        final TextField field = new TextField("Reckon the number of the beast");
        field.setPlaceholder("For it is a human number");

        final Span label = new Span("");

        final Button button = new Button("Click to check", event ->
            label.setText(field.getValue().equals("666") ?
                               "Its number is six hundred and sixty six":
                              "It is not the number of the beast."
            ));

        this.add(field, button, label);
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        LOGGER.warn("ui has been attached");
        this.getPage().executeJavaScript("window.alert('hi');");
    }


}
