package reflectionPack;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dsk15 on 10/12/2018.
 */
public class Reflection {

    public void withoutParams(Object o) throws Exception{

        Class testClass = o.getClass();
        o = testClass.newInstance();
        Method [] arrayMethods = testClass.getMethods();
        System.out.println(Arrays.toString(arrayMethods));
        for (Method i : arrayMethods) {
            if (i.getParameterCount() == 0){
                System.out.println(i);
                i.invoke(o);
            }
        }
    }

    public void withFinal(Object o) throws Exception{
        Class testClass = o.getClass();
        Method [] arrayMethods = testClass.getMethods();
        for (Method i : arrayMethods) {
            if (i.getModifiers() == 273 || i.getModifiers() == 17){
                System.out.println(i);
            }
        }
    }

    public List<Class> returnAllSuperClasses(Class clazz){
        List<Class> allList = new ArrayList<>();
        Class[] interfaciesArray;
        Class[] classesArray;
        interfaciesArray = clazz.getInterfaces();
        classesArray = clazz.getClasses();
        for(Class classes : classesArray){
            allList.add(classes);
        }

        for(Class interfacies : interfaciesArray){
            allList.add(interfacies);
        }
        System.out.println(allList);
        return allList;

    }
}



/*Метод принимает object и вызывает у него все методы без параметров//
Метод принимает object и выводит на экран все сигнатуры методов в ко//торых есть final
Метод принимает Class и возвращает список всех предков класса и все интерфейсы которое класс имплементирует
TODO Метод принимает объект и меняет всего его поля на их нулевые значение (null, 0, false etc)*/