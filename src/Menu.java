public class Menu {

    private String platoPrincipal;
    private double precioPlato;

    private String complemento;
    private double precioComplemento;

    private String postre;
    private double precioPostre;

    private String bebida;
    private double precioBebida;

    private String sorpresa;

    // Constructor
    public Menu() {
    }

    // Getters y Setters
    public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    public void setPlatoPrincipal (String platoPrincipal, double precioPlato){
        this.platoPrincipal = platoPrincipal;
        this.precioPlato = precioPlato;
    }

    public void setComplemento(String complemento, double precioComplemento) {
        this.complemento = complemento;
        this.precioComplemento = precioComplemento;
    }

    public void setPostre(String postre, double precioPostre) {
        this.postre = postre;
        this.precioPostre = precioPostre;
    }

    public void setBebida(String bebida, double precioBebida) {
        this.bebida = bebida;
        this.precioBebida = precioBebida;
    }

    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    // Calcular el total
    public double calcularTotal() {
        return precioPlato + precioComplemento + precioPostre + precioBebida;
    }
    // Mostrar resumenn
    public void mostrarResumen() {
        System.out.println("Plato principal: " + platoPrincipal + " " + precioPlato + "€");
        System.out.println("Complemento: " + complemento + " " + precioComplemento + "€");
        System.out.println("Postre: " + postre + " " + precioPostre + "€");
        System.out.println("Bebida: " + bebida + " " + precioBebida + "€");
        System.out.println("Sorpresa: " + sorpresa);
        System.out.println("----- Total: " + calcularTotal() + "€");
    }
}
