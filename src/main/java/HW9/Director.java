package HW9;

import HW8P2.BaseManager;

public class Director extends BaseManager {
    /*Необходимо создать класс Director, метод getSalaryDirector должен возвращать результат по формуле - <базовая ставка>
    * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
*/

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryDirector(){
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        }
    }
}

