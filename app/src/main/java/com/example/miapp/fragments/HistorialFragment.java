package com.example.miapp.fragments;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.miapp.R;

public class HistorialFragment extends Fragment {

    private EditText edtLado1;
    private EditText edtLado2;
    private EditText edtLado3;
    private EditText edtResultado;
    private Button btnIdentificar;

    public HistorialFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_historial, container, false);

        edtLado1 = view.findViewById(R.id.edtLado1);
        edtLado2 = view.findViewById(R.id.edtLado2);
        edtLado3 = view.findViewById(R.id.edtLado3);
        edtResultado = view.findViewById(R.id.edtResultado);
        btnIdentificar = view.findViewById(R.id.btnIdentificar);

        btnIdentificar.setOnClickListener(v -> identificarTriangulo());

        return view;
    }

    private void identificarTriangulo() {

        String lado1Texto = edtLado1.getText().toString().trim();
        String lado2Texto = edtLado2.getText().toString().trim();
        String lado3Texto = edtLado3.getText().toString().trim();

        if (TextUtils.isEmpty(lado1Texto) ||
                TextUtils.isEmpty(lado2Texto) ||
                TextUtils.isEmpty(lado3Texto)) {

            Toast.makeText(getContext(),
                    "Ingrese los tres lados",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        try {

            double lado1 = Double.parseDouble(lado1Texto);
            double lado2 = Double.parseDouble(lado2Texto);
            double lado3 = Double.parseDouble(lado3Texto);

            String resultado;

            // Operación matemática para validar si existe el triángulo
            if ((lado1 + lado2 <= lado3) ||
                    (lado1 + lado3 <= lado2) ||
                    (lado2 + lado3 <= lado1)) {

                resultado = "No es un triángulo";

            } else if (lado1 == lado2 && lado2 == lado3) {

                resultado = "Triángulo Equilátero";

            } else if (lado1 == lado2 ||
                    lado1 == lado3 ||
                    lado2 == lado3) {

                resultado = "Triángulo Isósceles";

            } else {

                resultado = "Triángulo Escaleno";
            }

            edtResultado.setText(resultado);

        } catch (NumberFormatException e) {

            Toast.makeText(getContext(),
                    "Ingrese valores numéricos válidos",
                    Toast.LENGTH_SHORT).show();
        }
    }
}