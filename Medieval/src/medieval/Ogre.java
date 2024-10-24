package medieval;

public class Ogre implements Observer {
    private String nombre;
    private int fortaleza;
    private String casa;

    public Ogre(String nombre, int fortaleza, String casa) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.casa = casa;
    }

    @Override
    public void update(String season) {
        switch (season) {
            case "Otoño":
                System.out.println(nombre + "  Voy a cazar.");
                break;
            case "Invierno":
                System.out.println(nombre + "  Me bañaré en mi pantano.");
                break;
            case "Primavera":
                System.out.println(nombre + "  Sigo durmiendo.");
                break;
            case "Verano":
                System.out.println(nombre + "  Voy a comer.");
                break;
        }
    }
}
