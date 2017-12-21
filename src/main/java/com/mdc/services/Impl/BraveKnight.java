package com.mdc.services.Impl;

import com.mdc.components.Quest;
import com.mdc.services.Knight;

public class BraveKnight implements Knight {

    private final Quest quest;

    BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
