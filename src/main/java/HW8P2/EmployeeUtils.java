package HW8P2;

public class EmployeeUtils {
   /* Задача №3

    Необходимо создать класс со следующими методами:
            ●	поиск сотрудника в массиве по его имени
●	поиск сотрудника в массиве по вхождению указанной строки в его имени
●	подсчет зарплатного бюджета для всех сотрудников в массиве
●	поиск наименьшей зарплаты в массиве
●	поиск наибольшей зарплаты в массиве
●	поиск наименьшего количества подчиненных в массиве менеджеров
●	поиск наибольшего количества подчиненных в массиве менеджеров
●	поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
●	поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров*/

    public int findByName(String name, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public int findBySubName(String subname, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(subname)) {
                return i;
            }
        }
        return -1;
    }

    public int salarySum(Employee[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getBaseSalary();
        }
        return result;
    }

    public int findMaxSalary(Worker[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getSalaryWorker()) {
                max += arr[i].getSalaryWorker();
            }
            max += arr[i].getSalaryWorker();
        }
        return max;
    }
    public int findMinSalary(Worker[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i].getSalaryWorker()) {
                min += arr[i].getSalaryWorker();
            }
            min += arr[i].getSalaryWorker();
        }
        return min;
    }
}



