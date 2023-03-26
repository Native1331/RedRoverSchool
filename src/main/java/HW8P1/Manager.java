package HW8P1;

public class Manager extends BaseEmployee{
   /* Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и
   количество подчиненных. Все поля сделать приватными и для каждого поля добавить
   методы set и get. Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за количество дней
   которые были переданы в качестве аргумента.
        К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.*/



     int workerCount;

    public Manager(int workerCount, String name, int age, char sex, int daySalary) {
            this.workerCount = workerCount;
    }
    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }
    public int getSalary(int days) {
        int salary = getDaySalary() * days;

        return (int) (salary + salary * (getWorkerCount() /100.0));
        }

    }


