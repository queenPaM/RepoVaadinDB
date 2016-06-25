package com.example.warteliste;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;



public class MainView extends CustomComponent implements View {
	
	

    public static final String NAME = "";

    Label text = new Label();

      
    public MainView() {
    	VerticalLayout layout = new VerticalLayout();
    	HorizontalLayout tabellenlayout = new HorizontalLayout();
    	MenuEditor menu = new MenuEditor();
    	UIUserEditor warteliste = new UIUserEditor();
    	KidsInKitaEditor angemeldetView = new KidsInKitaEditor();
    	
    	
    	tabellenlayout.addComponents(warteliste, angemeldetView);
    	layout.addComponents(menu, tabellenlayout);
        setCompositionRoot(layout);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // Get the user name from the session
      //  String username = String.valueOf(getSession().getAttribute("user"));

        // And show the username
       // text.setValue("Hello " + username);
    }
}
