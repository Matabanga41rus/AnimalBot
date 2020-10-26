package animals;

import java.awt.*;
import java.util.List;

public class Animal {
    private Image image;
    private String type;
    private String name;
    private int level;
    private int satiety;
    private String condition;
    private String nameCurrency;
    private int numCurrency;
    private String mood;
    private Animal marriage;

    private List<Achievement> achievements;

    public Animal(Image image, String type, String name, String nameCurrency) {
        this.image = image;
        this.type = type;
        this.level = 1;
        this.satiety = 5;
        this.name = name;
        this.condition = "Здоров";
        this.nameCurrency = nameCurrency;
        this.numCurrency = 0;
        this.mood = "Хорошое";
        this.marriage = null;
    }

    public void addAchievement(Achievement achievement){
        achievements.add(achievement);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public void setNameCurrency(String nameCurrency) {
        this.nameCurrency = nameCurrency;
    }
    public void setNumCurrency(int numCurrency) {
        this.numCurrency = numCurrency;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }
    public void setMarriage(Animal marriage) {
        this.marriage = marriage;
    }

    public Image getImage() {
        return image;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getSatiety() {
        return satiety;
    }
    public String getCondition() {
        return condition;
    }
    public String getNameCurrency() {
        return nameCurrency;
    }
    public int getNumCurrency() {
        return numCurrency;
    }
    public String getMood() {
        return mood;
    }
    public Animal getMarriage() {
        return marriage;
    }
    public List<Achievement> getAchievements() {
        return achievements;
    }
}
