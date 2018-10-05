
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

import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

class Chrono_Controller {

    public ArrayList<String> list(){
        RecordFeeling_Controller feeling_controller = new RecordFeeling_Controller();
        ArrayList<String> entries = new ArrayList<String>();
        entries = feeling_controller.generateCompositeStringArray();
        return entries;
    }
}