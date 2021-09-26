public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(100);
        Cat[]  CatArr = new Cat[3];
        CatArr[0] = new Cat("Барсик", 25, false);
        CatArr[1] = new Cat("Роза", 35, false);
        CatArr[2] = new Cat("Алла", 45, false);
        for(int i = 0; i < CatArr.length; i++){
            System.out.print(CatArr[i].getName() + " ");
            CatArr[i].eat(plate);
        }
        plate.info();
    }
}
