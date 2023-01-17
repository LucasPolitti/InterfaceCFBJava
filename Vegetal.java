public class Vegetal {

    private Boolean vivo;
    public int massa;
    public Vegetal(int massa){
        this.vivo=true;
        this.massa=massa;
    }

    public int getMassa(){
        return this.massa;
    }

    public void setMassa(int massa){
        this.massa=massa;
    
    }

    public Boolean getVivo() {
        return this.vivo;

    }

    public void setVivo() {

    }

    public void info(){
        System.out.printf("Tipo:...%s%n", getClass().toString());
        System.out.printf("Vivo:...%s%n", this.getVivo() ? "Sim" : "Não");
        System.out.printf("Massa:..%s%n", this.massa);
      

    }
    
}
