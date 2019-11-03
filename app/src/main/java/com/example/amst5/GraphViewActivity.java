package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

public class GraphViewActivity extends AppCompatActivity {

    GraphView grafica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_view);

        grafica = findViewById(R.id.graficaEstadistica);

        //Coordenadas y elementos del grafico
        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });

        //SE AGREGAN  LOS DATOS
        grafica.addSeries(series);

        //ESTILO A LAS BARRAS
        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int)data.getX()*255/4, (int)data.getY()*255/6, 100);
            }
        });

        //ESPACIO ENTRE BARRAS
        series.setSpacing(20);

        //DIBUJAMOS LA GRAFICA
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.BLUE);
    }
}
