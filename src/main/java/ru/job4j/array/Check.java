package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
//    проверяем ИНДЕКС 0 - увеличиваем на 1 - сравниваем - и так до конца массива
        for (int index = 0; index < data.length; index++) {
            if (data[index] != data[0]) {
                result = false;
            }
        }
        return result;
    }
}
