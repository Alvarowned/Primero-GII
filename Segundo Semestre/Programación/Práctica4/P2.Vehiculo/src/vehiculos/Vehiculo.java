package vehiculos;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad, marcha;
    private boolean luces;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.marcha = 0;
        this.luces = false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public int getMarcha() {
        return marcha;
    }
    
    public void setMarcha(int marcha) {
        if(0 <= marcha && marcha <= 5){
            this.marcha = marcha;
            switch (marcha){
                case 0:
                    this.setVelocidad(0);
                    break;
                case 1:
                    this.setVelocidad(10);
                    break;
                case 2:
                    this.setVelocidad(30);
                    break;
                case 3:
                    this.setVelocidad(60);
                    break;
                case 4:
                    this.setVelocidad(90);
                    break;
                case 5:
                    this.setVelocidad(120);
                    break;
            }
        }
        else System.err.println("Marcha no válida.");
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    @Override
    public String toString() {
        String lucestxt;
        if (this.luces) {
            lucestxt = "luces encendidas";
        } else {
            lucestxt = "luces apagadas";
        }
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", marcha=" + marcha + ", luces=" + lucestxt + '}';
    }
}