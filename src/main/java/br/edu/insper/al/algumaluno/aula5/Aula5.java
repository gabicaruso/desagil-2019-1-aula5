package br.edu.insper.al.algumaluno.aula5;

public class Aula5 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Frodo");
        Politician lord = new CorruptPolitician("Sauron", 1000000.0);

        Politician politician0 = new Politician("Gandalf", 9000.0);
        Politician politician1 = new CorruptPolitician("Saruman", 10000.0);
        Politician politician2 = new Politician("Aragorn", 1000.0);
        Politician politician3 = new CorruptPolitician("Boromir", 900.0);

        politician0.addNetworking(1);
        politician1.addNetworking(2);

        System.out.println(politician0.getName() + ": " + politician0.getIncome());
        politician0.salute(citizen);
        politician0.salute(lord);
        System.out.println();

        System.out.println(politician1.getName() + ": " + politician1.getIncome());
        politician1.salute(citizen);
        politician1.salute(lord);
        System.out.println();

        System.out.println(politician2.getName() + ": " + politician2.getIncome());
        politician2.salute(citizen);
        politician2.salute(lord);
        System.out.println();

        System.out.println(politician3.getName() + ": " + politician3.getIncome());
        politician3.salute(citizen);
        politician3.salute(lord);
        System.out.println();
    }
}
