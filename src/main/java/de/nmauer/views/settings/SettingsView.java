package de.nmauer.views.settings;

import com.vaadin.flow.component.board.Board;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nmauer.views.MainLayout;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Settings")
@Route(value = "settings", layout = MainLayout.class)
@RolesAllowed("ADMIN")
public class SettingsView extends VerticalLayout {

    public SettingsView() {

        addClassName("board-column-wrapping");

        // company settings
//        Details companyDetails = new Details();
        Board companyBoard = new Board();

        companyBoard.addRow(
            createCell("Users", "settings/users"),
            createCell("Groups", "settings/users"),
            createCell("User -> Permission", "settings/users"),
            createCell("User -> Group", "settings/users")
        );

//        companyDetails.add(companyBoard);
        add(companyBoard);


        // user settings

    }

    private static Div createCell(String text, String link) {
        Div div = new Div();
        div.setText(text);
        div.addClassNames("cell", "color");

        return div;
    }

}
