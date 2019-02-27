package br.edu.insper.al.algumaluno.aula5;

public class Aula5 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Frodo");
        Politician lord = new Politician(true, "Sauron", 1000000.0);

        Politician politician0 = new Politician(false, "Gandalf", 9000.0);
        Politician politician1 = new Politician(true, "Saruman", 10000.0);
        Politician politician2 = new Politician(false, "Aragorn", 1000.0);
        Politician politician3 = new Politician(true, "Boromir", 900.0);

        politician0.setNetworking(politician0.getNetworking() + 1);
        politician1.setNetworking(politician1.getNetworking() + 2);

        System.out.println(politician0.getName() + ": " + politician0.getIncome());
        politician0.saluteCitizen(citizen);
        politician0.salutePolitician(lord);
        System.out.println();

        System.out.println(politician1.getName() + ": " + politician1.getIncome());
        politician1.saluteCitizen(citizen);
        politician1.salutePolitician(lord);
        System.out.println();

        System.out.println(politician2.getName() + ": " + politician2.getIncome());
        politician2.saluteCitizen(citizen);
        politician2.salutePolitician(lord);
        System.out.println();

        System.out.println(politician3.getName() + ": " + politician3.getIncome());
        politician3.saluteCitizen(citizen);
        politician3.salutePolitician(lord);
        System.out.println();
    }
}
