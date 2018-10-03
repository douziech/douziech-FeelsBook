package app.android.feelsbook;

public class MaximumLengthExceededException extends Exception {

    MaximumLengthExceededException() {
        super("Comments are restricted to 100 characters in length.");
    }

}
