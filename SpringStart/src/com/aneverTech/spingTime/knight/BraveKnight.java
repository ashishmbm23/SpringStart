package com.aneverTech.spingTime.knight;

public class BraveKnight implements Knight {

    private RescueDamselQuest quest;

    //Example of data injection, this is constructor injection


    public BraveKnight(RescueDamselQuest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest()
    {
        quest.embark();
    }
}
