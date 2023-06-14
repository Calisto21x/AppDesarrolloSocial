package sv.com.paquete.hackathon.fedisal.servicios;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import sv.com.paquete.hackathon.fedisal.controladores.LoginJpaController;
import sv.com.paquete.hackathon.fedisal.entidades.Login;

@Named(value = "registro")
@RequestScoped
public class Registro implements Serializable {

    @Inject
    private Login login;

    @Inject
    private LoginJpaController Logincontrolador;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void Registrar() {
        try {
            Logincontrolador.create(login);
        } catch (Exception e) {
            System.out.println("Error!! " + e.getMessage());

        }

    }

}
