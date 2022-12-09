// Encoding cp1251 because my Windows console show ??? for russian chars

// Вывести все простые числа от 1 до 1000

// Чубченко Светлана

public class main {
    public static void main(String[] args) {
        System.out.println("Простые числа от 0 до 1000:  ");
        int n = 0; // для красоты, чтобы каждые 10 чисел делать переход строки
        // начинаем с 2, так как единица не является ни простым, ни составным числом
        for(int i = 2; i < 1000; ++i){
            // проверяем делится ли без остатка на другие числа
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            // каждые 10 чисел делаем переход строки (для красоты вывода)
            if(n==10) {
                System.out.print("\n");
                n = 0;
            }
            // если число простое - выведем и поставим Tab
            if(count<2) {
                System.out.print(i + "\t");
                n++;
            }
        }
    }
}
