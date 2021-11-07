package com.pb.ivanov.hv6;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Animal[] animal=new Animal[3];
        animal[1]=new Cat("Cat", "Beef", "Kyiv", 5 );
        animal[2]=new Dog("Dog", "Chicken", "Dnipro", 20 );
        animal[3]=new Cat("Horse", "Grass", "Poltava", 200 );

        Veterinarian vet=new Veterinarian();
        Class clazz = vet.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));
        Class vetClazz= Class.forName("com.pb.ivanov.hv6.Veterinarian");
        Constructor constr=vetClazz.getConstructor(new Class[]{String.class});
        Object obj=constr.newInstance("Dog");
        if(obj instanceof Veterinarian){
            ((Veterinarian) obj).treatAnimal(animal[3]);
        }
    }
}
