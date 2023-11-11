package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;


public class ServeurJWS {

    public static void main(String[] args) {
        String url = "http://localhost:8084/monservice"; // Spécifiez l'URL souhaitée
        Endpoint.publish(url, new BanqueService());
        System.out.println("Service web publié à l'adresse : " + url);
    }
}
