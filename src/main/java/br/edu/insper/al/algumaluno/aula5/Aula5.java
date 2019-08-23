package br.edu.insper.al.algumaluno.aula5;

public class Aula5 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Frodo");
        Politician lord = new CorruptPolitician("Sauron", 1000000.0);

        Politician[] politician = new Politician[4];

        politician[0] = new Politician("Gandalf", 9000.0);
        politician[1] = new CorruptPolitician("Saruman", 10000.0);
        politician[2] = new Politician("Aragorn", 1000.0);
        politician[3] = new CorruptPolitician("Boromir", 900.0);



        politician[0].addNetworking(1);
        politician[1].addNetworking(2);

        for (int i = 0; i <= 3; i++){
            System.out.println(politician[i].getName() + ": " + politician[i].getIncome());
            politician[i].salute(citizen);
            politician[i].salute(lord);
            System.out.println();

        }

    }
}
