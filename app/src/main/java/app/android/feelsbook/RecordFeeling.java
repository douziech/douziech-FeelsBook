/* FeelsBook : An application to record and track emotions as they arise.
   Copyright (C) 2018 D.M.Douziech; douziech@ualberta.ca

    FeelsBook is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

*/



/*  This code was influenced by LonelyTwitter:



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

    RecordFeeling(String feeling, String comment) throws MaximumLengthExceededException {

        if (comment.length() <= RecordFeeling.MAX_COMMENT_LENGTH) {
            this.comment = comment;
        } else {
            throw new MaximumLengthExceededException();
        }
        this.feeling = feeling;
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
