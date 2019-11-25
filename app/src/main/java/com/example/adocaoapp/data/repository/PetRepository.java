package com.example.adocaoapp.data.repository;

import com.example.adocaoapp.data.model.Pet;


public interface PetRepository implements MainRepository {
    private Pet pet;

    @Override
    public Pet getPet() {
        if (pet == null) {
            Pet pet = new Pet("Dinesh", "Kumar", "", "",
                    "", "","", "", "", "");
            //pet.setId(0);
        }
        return pet;
    }

    @Override
    public void savePet(Pet pet) {
        if (pet == null) {
            pet = getPet();
        }
        this.pet = pet;
    }


}
