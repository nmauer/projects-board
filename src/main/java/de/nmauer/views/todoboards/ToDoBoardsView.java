package de.nmauer.views.todoboards;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nmauer.data.User;
import de.nmauer.security.AuthenticatedUser;
import de.nmauer.views.MainLayout;
import jakarta.annotation.security.PermitAll;

@PageTitle("ToDo Boards")
@Route(value = "", layout = MainLayout.class)
@PermitAll
public class ToDoBoardsView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public ToDoBoardsView(AuthenticatedUser authenticatedUser) {

        User user = authenticatedUser.get().get();

        add(new H1(user.getPrimaryCompany().getName()));

    }

}
