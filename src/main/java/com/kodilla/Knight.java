package com.kodilla;

public class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void questAccepted() {
        this.quest.process();
    }
}
