package animals;

import java.awt.*;

public class AnimalFactory {
    public static Animal createAnimal(AnimalType animalType, Image image) throws Exception {
        Animal animal;

        switch (animalType){
            case OPOSSUM:{
                animal = new Opossum(image, "Опоссуменок", "Виноград");
            }break;

            case OTTER:{
                animal = new Otter(image, "Выдрочка", "Виноградик");
            }break;

            default:{
                throw new Exception("Не верный тип животного!!!");
            }
        }

        return animal;
    }
}
