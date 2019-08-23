package br.edu.insper.al.algumaluno.aula5;

public class Politician extends Citizen{
    private double salary;
    private int networking;

    public Politician(String name, double salary) {
        super(name);
        this.salary = salary;
        this.networking = 0;
    }

    public void addNetworking(int networking) {
        this.networking += networking;
    }

    public double getIncome() {
        double factor = 1.0 + 0.1 * networking;
        return factor * salary;
    }

    public void salute(Citizen citizen) {
        System.out.println("E aí, " + citizen.getName() + ", firmeza?");
    }

    public void salute(Politician politician) {
        System.out.println("Olá, " + politician.getName() + ", tudo bem?");
    }
}
