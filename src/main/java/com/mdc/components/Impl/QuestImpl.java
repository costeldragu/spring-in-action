package com.mdc.components.Impl;

import com.mdc.components.Quest;

import java.io.PrintStream;

public class QuestImpl implements Quest {

    private PrintStream stream;
    public QuestImpl(PrintStream stream) {
        this.stream = stream;
    }


    @Override
    public void embark() {
        stream.println("General Quest");
    }
}
