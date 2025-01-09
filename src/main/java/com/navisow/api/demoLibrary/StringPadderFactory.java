package com.navisow.api.demoLibrary;

public class StringPadderFactory {
    private StringPadderFactory() {
    }

    /**
     * Creates an instance of {@link StringPadder}.
     *
     * @return the new instance
     */
    public static StringPadder createStringPadder() {
        return new StringPadderImpl();
    }
}
