package com.mdc.components.Impl;

import com.mdc.components.Quest;
import java.io.PrintStream;


public class SlayDragonQuest implements Quest {

    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
