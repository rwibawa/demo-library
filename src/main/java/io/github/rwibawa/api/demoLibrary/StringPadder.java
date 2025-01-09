package io.github.rwibawa.api.demoLibrary;

/**
 * 4
 * Pads a {@link String}.
 * 5
 * <p>
 * 6
 * The instances of classes that implement this interface are thread-safe and immutable.
 * 7
 */
public interface StringPadder {

    /**
     * Returns a new {@link String} that right-aligns the characters in the specified String by padding them with spaces
     * on the left, for a specified total length.
     *
     * @param stringToPad the {@link String} to be padded
     * @param totalLength total length of the new {@link String}
     * @return the padded {@link String}
     */
    String padLeft(String stringToPad, int totalLength);

    /**
     * Returns a new {@link String} that right-aligns the characters in the specified String by padding them with the
     * specified char on the left, for a specified total length.
     *
     * @param stringToPad the {@link String} to be padded
     * @param totalLength total length of the new {@link String}
     * @return the padded {@link String}
     */
    String padLeft(String stringToPad, int totalLength, char paddingCharacter);

    /**
     * Returns a new {@link String} that left-aligns the characters in the specified String by padding them with spaces
     * on the left, for a specified total length.
     *
     * @param stringToPad the {@link String} to be padded
     * @param totalLength total length of the new {@link String}
     * @return the padded {@link String}
     */
    String padRight(String stringToPad, int totalLength);

    /**
     * Returns a new {@link String} that left-aligns the characters in the specified String by padding them with the
     * specified char on the left, for a specified total length.
     *
     * @param stringToPad the {@link String} to be padded
     * @param totalLength total length of the new {@link String}
     * @return the padded {@link String}
     */
    String padRight(String stringToPad, int totalLength, char paddingCharacter);

}
