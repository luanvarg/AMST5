package com.example.amst5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {
    //Se define una variable de tipo CalendarView y TextView
    CalendarView calendar;
    TextView date_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        /*Se llama por ID para cada componente creado en el XML
        y se usa findViewById para obtener dichos valores*/
        calendar = (CalendarView)findViewById(R.id.calender);
        date_view = (TextView)findViewById(R.id.date_view);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                //Creamos el formato de salida de la fecha mediante el Listener
                //Se agrega + 1 al mes ya que el indice empieza desde 0
                String date = dayOfMonth + "/" + (month + 1)+ "/" + year;

                //seteamos la fecha al TextView para mostrarlo
                date_view.setText(date);
            }
        });
    }
}
