package com.example.anmeldung;

import javax.servlet.annotation.WebServlet;


import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("com.example.anmeldung.MyAppWidgetset")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
       
        
        final AnmeldeformularEditor anmeldeformular = new AnmeldeformularEditor();
        
         Button apply = new Button("Abschicken");
         apply.setStyleName("friendly");
         apply.addClickListener( e -> {
             layout.addComponent(new Label("Abschicken wurdegedrückt"));
         });
         
         layout.addComponents(anmeldeformular,apply);
         layout.setMargin(true);
         layout.setSpacing(true);
         layout.setComponentAlignment(anmeldeformular, Alignment.MIDDLE_CENTER);
       // layout.setComponentAlignment(apply, Alignment.TOP_CENTER);

         layout.setMargin(true);
         layout.setSpacing(true);
         
         setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
