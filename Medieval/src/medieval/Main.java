package medieval;

public class Main {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        Ogre shrek = new Ogre("Shrek", 100, "Pantano");
        Duende marco = new Duende("Marco", 200, "Verde");

        sujeto.subscribirse(shrek);
        sujeto.subscribirse(marco);

        System.out.println("Notificación del cambio de estación:");
        sujeto.cabiotemporada("Otoño"); 
        sujeto.cabiotemporada("Invierno"); 
        sujeto.cabiotemporada("Primavera"); 
        sujeto.cabiotemporada("Verano");    
    }
}
