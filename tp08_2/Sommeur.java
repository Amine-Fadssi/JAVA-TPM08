package tp07_2;

public class Sommeur implements Runnable{
    int[] numbers;
    int debut;
    int fin;
    int somme = 0;
    public Sommeur(int[] numbers, int debut, int fin){
        this.numbers = numbers;
        this.debut = debut;
        this.fin = fin;
    }
    @Override
    public void run() {
        for (int i = this.debut; i < this.fin; i++) {
            this.somme += numbers[i];
        }
        System.out.println(somme);
    }
    public int getSomme(){
        return this.somme;
    }
}
