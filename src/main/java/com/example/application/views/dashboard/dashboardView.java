package com.example.application.views.dashboard;



import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;

@Route("dashboard")
public class dashboardView extends Div {
    public dashboardView() {
        // Add components to your dashboard view
        // For example:
        add(new H1("Welcome to the Dashboard"));
        add(new Paragraph("This is your dashboard view."));
    }
}