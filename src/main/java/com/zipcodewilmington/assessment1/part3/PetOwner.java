package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String name;
    private ArrayList<Pet> pets = new ArrayList<>();

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if(pets != null && pets.length > 0) {
            for (Pet pet : pets) {
                this.pets.add(pet);
            }
        }else {
            this.pets = new ArrayList();
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        pets.add(pet);
   }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int young = Integer.MAX_VALUE;

        for (Pet pet : pets) {
            if (pet.getAge() < young) {
                young = pet.getAge();
            }
        }
        return young;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int old = Integer.MIN_VALUE;

        for (Pet pet : pets) {
            if (pet.getAge() > old) {
                old = pet.getAge();
            }
        }
        return old;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float total = 0f;

        for (Pet per : pets) {
            total += per.getAge();
        }
     return total / pets.size();

    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if(pets.size() == 0){
            return new Pet[1]; //cant return a null array because it needs to have 1 empty spot
        }
       return pets.toArray(new Pet[0]);
    }



}
