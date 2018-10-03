
/*  This code was influenced by:





*/

package app.android.feelsbook;

import java.util.Date;

public class RecordFeeling implements Record {

    private Date date;
    private String feeling;
    private String comment;

    private static final Integer MAX_COMMENT_LENGTH = 100;

    RecordFeeling(){
        this.date = new Date();
        this.feeling = "Yet to be determined.";
        this.comment = "";
    }

    RecordFeeling(String feeling){
        this.date = new Date();
        this.feeling = feeling;
        this.comment = "";
    }

    RecordFeeling(String feeling, String comment){
        this.feeling = feeling;
        this.comment = comment;
        this.date = new Date();
    }

    public Date getTimeStamp(){
        return this.date;
    }

    public String getComment(){
        return this.comment;
}

    public String getFeeling(){
        return this.feeling;
    }


    public void setComment(String comment) throws MaximumLengthExceededException {
        if (comment.length() <= this.MAX_COMMENT_LENGTH) {
            this.comment = comment;
        } else {
            throw new MaximumLengthExceededException();
        }
    }


}
