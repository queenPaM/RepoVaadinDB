package com.example.warteliste;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class LogInView extends VerticalLayout implements View{
	 public static final String NAME = "login";

	
	public LogInView (){
final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener( e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        layout.addComponents(name, button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        //setCompositionRoot(layout);
	}
	@Override
	public void enter(ViewChangeEvent event) {
		getUI().getNavigator().navigateTo(LogInView.NAME);		
	}

}
