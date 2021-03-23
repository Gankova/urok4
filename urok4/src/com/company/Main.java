package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,-10};
        // в переменную и будут поочередно записываться все элементы массива arr
        // после : может указываться либо массив, либо коллекция
        for (int e : arr) {
            // повторяет запись for (int i; i< arr.length; i= i+1
            System.out.println(e);
        }
        // массив в массиве
        float [][]arr2 = {{1,3},{2,5},{3,4}};
        for(float[] e : arr2) {
            for (float v : e){
                System.out.print(v);
                System.out.print(" ");
            }
            System.out.println();
            // заменяет энтер
        }
        // ++ -инкремент
        // -- декремент
        int a =12;
        a++;
        a--;
        int b = a++;
        // если ++ или -- перед переменной это префиксная форма, записи, если после постфиксная
        int  x =12;
        int y = 23;
        int z = x++ - --y + y++ - --y - --x;
        // 12 - 22 +22 - 22 - 12 =  - 22 (префиксная меняет до операции, постфиксная после)
        System.out.println(z);
        for (int i = 0; i< arr.length; i++) {}

        // break - останавливает выполнение циклы (досрочно)
        // continue - пропускает выполнение текущей операции цикла и переходит к выполнению новой
        // 1 дан массив целых чисел, вывести 1 число кратное трем
        int [] arr3 = {1,6,3,9,0,5};
        for (int j : arr3) {
            if (j % 3 ==0){
                System.out.println(j);
                break;
            }
        }
        //2. данн массив целых чисел, вывести все числа не кратные трем
        for ( int j : arr3) {
            if (j % 3 == 0){
                // пропускаем
                continue;

            }
            System.out.println(j);
        }
        for (int i = 0 ; i< 10; i++) {
            for (int j = 0; j < 5; j++){
                break; // прервется только цикл по j
            }
            break; // прерывает только цикл по i
        }
        // сортировка методом пузырька
        int[] arr4 = { -12, 84, 56,12,100 };
        for (int i =0; i< arr4.length; i++){
            for (int j = i+1; j < arr4.length; j++) {
                if (arr4[i] > arr4[j]) {
                    int tmp = arr4[i];
                    arr4[i]= arr4[j];
                    arr4 [j] = tmp;
                }
                }
        }
        // цикл вывода на экран в строку
        for (int e :arr4) {
            System.out.print(e);
            System.out.print(" ");
        }
        System.out.println();
        // вызов метода sum
        System.out.println(sum(5,2));
        int v1 =123;
        int v2=100;
        int v3 = 52;
        System.out.println(min(v1,v2,v3));
        pryntArray(arr4);
        System.out.println();
        System.out.println(sum2(5,8,15,14,15,136,14));


        }
        // объявление метода
        public static int sum (int a, int b){
         int c = a+b;
         return c;
         // == (return a+b)
        }
        public static int min( int a, int b, int c){
        if (a<b && a<c){
            return a;// return - завершает метод
        }
        if (b<c){
            return b;
        }
        return c;
        }
        public static void pryntArray(int[] arr){
        for (int e : arr) {
            System.out.print(e);
            System.out.print(" ");
        }
        }
        // sum2 функция с неопределнным типам параметров
        public static int sum2(int ...a ) {
        //a массив типа инт
        int s = 0;
        for(int e:a){
            s += e; //s = s + e
        }
        return s;
        }
}
