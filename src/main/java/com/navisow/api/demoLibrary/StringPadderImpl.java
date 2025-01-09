package com.navisow.api.demoLibrary;

public class StringPadderImpl implements StringPadder {
    public StringPadderImpl() {
    }

    /**
     * Returns a new {@link String} that right-aligns the characters in the specified String by padding them with spaces
     * on the left, for a specified total length.
     *
     * @param stringToPad the {@link String} to be padded
     * @param totalLength total length of the new {@link String}
     * @return the padded {@link String}
     */
    @Override
    public String padLeft(String stringToPad, int totalLength) {
        return padLeft(stringToPad, totalLength, ' ');
    }

    /**
     * Returns a new {@link String} that right-aligns the characters in the specified String by padding them with the
     * specified char on the left, for a specified total length.
     *
     * @param stringToPad      the {@link String} to be padded
     * @param totalLength      total length of the new {@link String}
     * @param paddingCharacter
     * @return the padded {@link String}
     */
    @Override
    public String padLeft(String stringToPad, int totalLength, char paddingCharacter) {
        return getStringToBeAdded(stringToPad, totalLength, paddingCharacter) + stringToPad;
    }

    /**
     * Returns a new {@link String} that left-aligns the characters in the specified String by padding them with spaces
     * on the left, for a specified total length.
     *
     * @param stringToPad the {@link String} to be padded
     * @param totalLength total length of the new {@link String}
     * @return the padded {@link String}
     */
    @Override
    public String padRight(String stringToPad, int totalLength) {
        return padRight(stringToPad, totalLength, ' ');
    }

    /**
     * Returns a new {@link String} that left-aligns the characters in the specified String by padding them with the
     * specified char on the left, for a specified total length.
     *
     * @param stringToPad      the {@link String} to be padded
     * @param totalLength      total length of the new {@link String}
     * @param paddingCharacter
     * @return the padded {@link String}
     */
    @Override
    public String padRight(String stringToPad, int totalLength, char paddingCharacter) {
        return stringToPad + getStringToBeAdded(stringToPad, totalLength, paddingCharacter);
    }

    private String getStringToBeAdded(String stringToPad, int totalLength, char paddingCharacter) {
        int quantity = totalLength - stringToPad.length();
        if (quantity > 0) {
            return Character.toString(paddingCharacter).repeat(quantity);
        } else {
            return "";
        }
    }
}
