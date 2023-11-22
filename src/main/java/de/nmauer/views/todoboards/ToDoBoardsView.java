package de.nmauer.views.todoboards;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nmauer.security.AuthenticatedUser;
import de.nmauer.views.MainLayout;
import jakarta.annotation.security.PermitAll;

@PageTitle("ToDo Boards")
@Route(value = "", layout = MainLayout.class)
@PermitAll
public class ToDoBoardsView extends HorizontalLayout {

    public ToDoBoardsView(AuthenticatedUser authenticatedUser) {

    }

}
