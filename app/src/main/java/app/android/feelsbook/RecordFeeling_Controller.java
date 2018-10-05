


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

package app.android.feelsbook;


import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


public class RecordFeeling_Controller {

    private static FeelsBook feelsBook = null;

    public static  FeelsBook getFeelsBook(){   //changed to private
        if(feelsBook == null){
            feelsBook = new FeelsBook();
        }
        return feelsBook;
    }

    public void insertRecord(String feeling){

        RecordFeeling record = new RecordFeeling(feeling);
        getFeelsBook().addRecord(record);

    }

    public void displayInitialEntry(TextView displayFeelingWindow, TextView displayTimeStampWindow){

        getFeelsBook();
        int size = feelsBook.bookSize();
        RecordFeeling last = feelsBook.getRecord(size-1);
        String feeling = last.getFeeling();
        Date date = last.getTimeStamp();
        String dateString = date.toString();
        displayFeelingWindow.setText(feeling);
        displayTimeStampWindow.setText(dateString);

    }

    public void insertComment(String optionalComment) throws MaximumLengthExceededException {   //Non-indexed comment insertion; simply based on the last entry.
        getFeelsBook();
        int size = feelsBook.bookSize();
        RecordFeeling last = feelsBook.getRecord(size - 1);
        try {
            last.setComment(optionalComment);
        } catch (MaximumLengthExceededException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<String> generateCompositeStringArray(){

        getFeelsBook();

        ArrayList<String>  entries = new ArrayList<String>();

        int size = feelsBook.bookSize();
        String sizeString = Integer.toString(size);

        Log.i("BOOKSIZE", sizeString);


        for( int i=0 ; i < feelsBook.bookSize() ; i++){

            RecordFeeling entry = feelsBook.getRecord(i);

            String feeling = entry.getFeeling();
            String date = entry.getTimeStamp().toString();
            String comment = entry.getComment();
            String composite = feeling + " " + date + " " + comment;
            entries.add(composite);
        }
        return entries;
    }
}