public class Plate {
    private int food;

    public Plate(int food) {this.food = food;}
       
    public void decreaseFood(int foodToEat, boolean satiety){

                if((food - foodToEat) <= 0){
                satiety = false;
                System.out.println("Кот не поел " + satiety);
                }
                else {
                food -= foodToEat;
                satiety = true;
        System.out.println(satiety);
                }
    }

    public void info(){
        System.out.println("Количество еды " + food );
    }
}
