package net.depinfonancy.td01vaadin;

import javax.inject.Inject;

import net.depinfonancy.td01vaadin.beans.CalculatorBean;

import com.vaadin.annotations.Theme;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@CDIUI("")
@Theme("valo")
public class Td01vaadinUI extends UI {

	/*@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = Td01vaadinUI.class)
	public static class Servlet extends VaadinServlet {
	}*/
	@Inject
	private CalculatorBean calc;
	
	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		Button button = new Button("2x8");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				int i = calc.multiply(2, 8);
				String result = Integer.toString(i);
				layout.addComponent(new Label(result));
				
			}
		});
		layout.addComponent(button);
	}

}