public class Cube {
    /*Создайте открытый класс Cube без конструктора, который получает одну единственную закрытую целочисленную переменную
        Side, метод getside() и setter SetSide(int num) для этого свойства. На самом деле, методы getter и setter
    setter не являются распространенным способом написания этого кода на C#"*/

    private int Side;


     int getSide() {
        return Side;
    }

     int setSide(int num) {
        return num;
    }
}