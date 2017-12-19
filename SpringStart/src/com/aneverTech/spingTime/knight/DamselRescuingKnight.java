package com.aneverTech.spingTime.knight;

public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;
//Example of tightly coupled. Here embark quest will be called only when ResueDamselQuest is needed. Otherwise it will
    //remain uncalled
    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }
    public void embarkOnQuest()
    {
        quest.embark();
    }
}
