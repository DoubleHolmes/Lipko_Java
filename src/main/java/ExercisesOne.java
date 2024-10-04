public class ExercisesOne {
    public void firstExercise(int a, int b) {
        if (a > b) {
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }
        double c;

        c=a+b;
        System.out.println("Сумма равна: " + c);
        c=a-b;
        System.out.println("Разность равна: " + c);
        c=a*b;
        System.out.println("Произведение равно: " +c);
        c= (double) a /b;
        if (b==0){
            System.out.println("Нельзя делить на ноль!!!");

        } else {
            System.out.println("Деление равно: " + c);
        }



    }
}
