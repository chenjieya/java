package view;

import javax.swing.*;

public abstract class FrameRule extends JFrame {

    public FrameRule() {}
    public FrameRule(String title) {
        super(title);
    }

    protected void init() {
        this.setLayoutPosition();
        this.addLayout();
        this.addEventLisenter();
        this.frameSelf();
    }


    protected abstract void setLayoutPosition();
    protected abstract void addLayout();
    protected abstract void addEventLisenter();
    protected abstract void frameSelf();

}
