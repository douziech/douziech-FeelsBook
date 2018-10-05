
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


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

//This has to be a persistent database.


public class FeelsBook extends RecordFeeling implements Serializable {

    private static ArrayList<RecordFeeling> book = null;
    private static Hashtable <String, Integer> count_dicEmotions = null;


    //Default constructor
    FeelsBook(){}


    public static Hashtable getDictionary() {
        if( count_dicEmotions == null){
            count_dicEmotions = new Hashtable<String, Integer>();
        }
        return count_dicEmotions;
    }

    public static ArrayList<RecordFeeling> getBook(){
        if (book == null){
            book = new ArrayList<RecordFeeling>();
        }
        return book;
    }



    public void addRecord(RecordFeeling entry) {

        String feeling = entry.getFeeling();
        count_dicEmotions = getDictionary();
        book = getBook();

        if (count_dicEmotions.containsKey(feeling) == true){
            int count = count_dicEmotions.remove(feeling);
            count_dicEmotions.put(feeling, count);
            } else count_dicEmotions.put(feeling, 1);


        book.add(entry);

    }

    public RecordFeeling getRecord(int index){
        return book.get(index);
    }

    public void deleteRecord(int index){
        book.remove(index);
    }

    public void replaceRecord(int index, RecordFeeling newRecord){
        book.set(index, newRecord);
    }

    public int bookSize(){
        int size = book.size();
        return size;
    }




}


