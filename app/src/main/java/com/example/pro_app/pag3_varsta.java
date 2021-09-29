package com.example.pro_app;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pag3_varsta extends AppCompatActivity {
    private TextView dob_txt;
    private TextView age_txt;
    String mbithday, mtoday;
    DatePickerDialog.OnDateSetListener dateSetListener;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag3_varsta);

        TextView today_txt = findViewById(R.id.dateText);
        dob_txt =findViewById(R.id.dobText);
        age_txt = findViewById(R.id.ageText);

        Button findDob_btn = findViewById(R.id.dobBTN);
        Button calculate_btn = findViewById(R.id.calcbtn);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");
        mtoday = simpleDateFormat.format(Calendar.getInstance().getTime());
        today_txt.setText("DC: " +mtoday);

        findDob_btn.setOnClickListener(view -> {
            DatePickerDialog datePickerDialog = new
                    DatePickerDialog(view.getContext(),dateSetListener,year,month,day);
            datePickerDialog.getDatePicker().setMaxDate(new Date().getTime() );

            datePickerDialog.show();

        });
        dateSetListener = (view, year1, month1, dayOfMonth) -> {
            month1 = month1 +1;
            mbithday = dayOfMonth + "/" + month1 +"/"+ year1;
            dob_txt.setText("DN: " +mbithday);

        };
        calculate_btn.setOnClickListener(view -> {
            if (mbithday==null) {
                Toast.makeText(getApplicationContext(), "please enter your date ob birth",
                        Toast.LENGTH_SHORT).show();
            } else{
                @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yy");
                try {
                    Date date1 = simpleDateFormat1.parse(mbithday);
                    Date date2 = simpleDateFormat1.parse(mtoday);

                    assert date1 != null;
                    long startDate = date1.getTime();
                    assert date2 != null;
                    long endDate = date2.getTime();

                    Period period = new Period(startDate,
                            endDate,
                            PeriodType.yearMonthDay ());
                    int years = period.getYears();
                    int months = period.getMonths();
                    int days = period.getDays();

                    age_txt.setText(years + " ani | " + months + " luni | " + days + " zile");
                } catch (ParseException e){
                    e.printStackTrace();
                }
            }
        });




    }
}

