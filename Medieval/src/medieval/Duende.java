package medieval;

public class Duende implements Observer{
    private String nombre;
    private int magiaLevel;
    private String color;

    public Duende(String nombre, int magiaLevel, String color) {
        this.nombre = nombre;
        this.magiaLevel = magiaLevel;
        this.color = color;
    }

    @Override
    public void update(String season) {
        switch (season) {
            case "Otoño":
                System.out.println(nombre + "  Debo trabajar.");
                break;
            case "Invierno":
                System.out.println(nombre + "  Hora de dormir.");
                break;
            case "Primavera":
                System.out.println(nombre + "  El duende hace magia.");
                break;
            case "Verano":
                System.out.println(nombre + "  Momento de salir a disfrutar el paisaje.");
                break;
        }
    }
}
