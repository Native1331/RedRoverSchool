package HW9;

import HW8P2.BaseManager;

public class Manager extends BaseManager {
    /*  Необходимо создать класс Manager в который нужно добавить следующие методы:
              ●	getNumberOfSubordinates - получить количество подчиненных
  ●	setNumberOfSubordinates

      в классе, метод getSalaryManager будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных>
       / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.

  */
    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates, int numberOfSubordinates1) {
        super(name, baseSalary, numberOfSubordinates);
        this.numberOfSubordinates = numberOfSubordinates1;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalaryManager() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }
}
