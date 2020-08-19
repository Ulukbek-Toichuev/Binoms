import javax.swing.JOptionPane;

class Main {

    public static void main(String[] args) {

        //Текстовые переменные для записи значения в поле ввода и насвание диалоговых окон.
        String input, title = "Биномиальные коэффиценты";

        input = JOptionPane.showInputDialog(null,
                "Укажите значение нижнего индекса", title,
                JOptionPane.QUESTION_MESSAGE);

        if (input==null){
            System.exit(0);
        }

        int n; //Переменная для записи значения нижнего индекса.
        n = Integer.parseInt(input); //Определение числового значения на основе текста.

        //Проверка корректности числового значения.
        if (n<0){
            JOptionPane.showMessageDialog(null,
                    "Указан неверный параметр!",
                    title, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        int[] binoms = new int[n+1]; //Создание массива.
        binoms[0] = 1; //Значение первого элемента массива.

        String txt = "Содержимое массива:\n| " + binoms[0] + " |";

        //Вычисление значений элементов массива.
        for (int m = 1; m < binoms.length; m++){
            binoms[m] = binoms[m-1] * (n-m+1)/m; //Значение элемента
            txt +=" " + binoms[m] + " |";
        }

        JOptionPane.showMessageDialog(null, txt, title,
                JOptionPane.INFORMATION_MESSAGE);
    }
}