package com.mdc.components.Impl;

import com.mdc.components.Minstrel;

import java.io.PrintStream;

public class MinstrelImpl implements Minstrel{

    private final PrintStream stream;

    public MinstrelImpl(PrintStream stream) {
        this.stream= stream;
    }

    @Override
    public void singBeforeQuest() {

    }

    @Override
    public void singAfterQuest() {

    }
}
