package com.example.hello;

public class StarWars {
    private String characterName;
    private String organization;
    private Weapon weapon;

    public StarWars(String characterName, String organization, Weapon weapon) {
        this.characterName = characterName;
        this.organization = organization;
        this.weapon = weapon;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getOrganization() {
        return organization;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
