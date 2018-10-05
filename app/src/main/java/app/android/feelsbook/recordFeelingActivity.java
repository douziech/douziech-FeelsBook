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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class recordFeelingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_feeling);

        TextView feelingView = findViewById(R.id.displayFeeling_Text);
        TextView timeStampView = findViewById(R.id.displayTimeStamp_Text);

        RecordFeeling_Controller controller = new RecordFeeling_Controller();
        controller.displayInitialEntry(feelingView, timeStampView);

    }


    public void captureOptionalText(View v) throws MaximumLengthExceededException {

        EditText optionalText = findViewById(R.id.optionalComment_Text);
        RecordFeeling_Controller controller = new RecordFeeling_Controller();
        String optionalTextString = optionalText.getText().toString();
        try {
            controller.insertComment(optionalTextString);
            Toast.makeText(this, "Comment inserted", Toast.LENGTH_SHORT).show();

        } catch (MaximumLengthExceededException e) {
            e.printStackTrace();
        }

    }



    }


