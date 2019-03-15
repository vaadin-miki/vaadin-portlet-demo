package org.vaadin.miki.portlet;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * @author miki
 * @since 2019-02-08
 */
@Route("")
public class PortletUI extends UI {

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
}
