package com.example.warteliste;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

public class MainView extends VerticalLayout implements View{

	@Override
	public void enter(ViewChangeEvent event) {
		class ButtonListener implements Button.ClickListener {
	        String menuitem;
	        public ButtonListener(String menuitem) {
	            this.menuitem = menuitem;
	        }

	        @Override
	        public void buttonClick(ClickEvent event) {
	            // Navigate to a specific state
	            getNavigator.navigateTo(MAINVIEW + "/" + menuitem);
	        }
	    }
		
	}

}
