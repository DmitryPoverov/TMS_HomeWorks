/*
Создать класс компьютер.

Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)

Методы:
- метод описание(вывод всех полей)
- метод включить (при включении может произойти сбой: при вывзове метода
рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
угадали комп включается, если нет - сгорает.Если комп сгорел, при попытке
включить нужно выдать сообщение что ему конец).
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает
*/

package Computer;

public class Computer2 {

    boolean isBurned = false;
    String isOn = "off";
    int resource = 4;

    String cpu;
    String ddr;
    String hdd;

    Computer2 (String cpu, String ddr, String hdd) {
        this.cpu = cpu;
        this.ddr = ddr;
        this.hdd = hdd;
    }

    public void showFields () {
        System.out.printf("Now your comp is %s.\n",isOn);
        System.out.printf("CPU is %s.\n",cpu);
        System.out.printf("DDR is %s.\n",ddr);
        System.out.printf("HDD is %s.\n",hdd);
        System.out.printf("isBurned = %b, isOn = %s, resource = %d\n", isBurned, isOn, resource);
    }

    public void turnOn () {
        if (!isBurned && resource!=0) {
            System.out.println("Your computer is ON");
            resource--;
            isOn = "on";
            if (resource==0) {
                isBurned = true;
                System.out.println("The resource is exhausted");
            }
        } else {
            System.out.println("Your computer is BURNING OFF");
        }
    }

    public void turnOff () {
        System.out.println("Your computer is OFF");
        resource--;
        isOn = "off";
        if (resource==0) {
            isBurned = true;
            System.out.println("The resource is exhausted");
        }
    }
}
