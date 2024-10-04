public class ExeTwo {
    public void str(String str1, String str2){
        if (str1.equals(str2)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

    }

    public void array(){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i=0; i <array.length; i++){
            if ((array[i]%2)==0) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
