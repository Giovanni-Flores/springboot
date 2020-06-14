package flores.giovanni.ExemploGradle.model;

/**
 * @author Giovanni Flores
 * @since 10/06/2020 10:00
 * @version 1.0
 */
public class Cliente {

    private String name;
    private String sobrenome;
    private double renda;

    public Cliente() {
        this.renda = 0.0;
    }

    /**
     *
     * @param name Recebe o nome por padrão
     * @param sobrenome Recebe o sobrenome por padrão
     * @param renda Recebe a renda por padrão
     */
    public Cliente(String name, String sobrenome, double renda) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.renda = renda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    /**
     *
     * @return Retorna a renda mais 10%
     */
    public double calcularRenda() {
        return this.renda * 1.10;
    }

    @Override
    public String toString() {
        return "Cliente: "
             + "\nNome" + this.name
             + "\nSobrenome: " + this.sobrenome
             + "\nRenda: " + this.renda
             + "\n10%: " + this.calcularRenda();
    }
}
