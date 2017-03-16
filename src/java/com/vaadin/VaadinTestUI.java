package com.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@Widgetset("AppWidgetset")
@Theme("valo")
public class VaadinTestUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		Label label = new Label("Hello from Vaadin with custom widgetset");
		setContent(label);
	}
}
