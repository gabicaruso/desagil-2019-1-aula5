package br.edu.insper.al.algumaluno.aula5;

public class CorruptPolitician extends Politician{

    public CorruptPolitician(String name, double salary) {
        super(name, salary);
    }

    public double getIncome() {
        return 2 * super.getIncome();
    }

    public void salute(Citizen citizen) {
        System.out.println("Saudações, senhor " + citizen.getName() + ", tenha um ótimo dia!");
    }

    public void salute(Politician politician) {
        System.out.println("Honrado em encontrá-lo, Vossa Excelência " + politician.getName() + ", como posso ajudar?");
    }

}
