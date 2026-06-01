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

public class PrestamoFragment extends Fragment {

    private EditText edtPrimerDato;
    private EditText edtSegundoDato;
    private EditText edtResultado;
    private Button btnSumar;

    public PrestamoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_prestamo, container, false);

        // Referencias a los controles
        edtPrimerDato = view.findViewById(R.id.edtPrimerDato);
        edtSegundoDato = view.findViewById(R.id.edtSegundoDato);
        edtResultado = view.findViewById(R.id.edtResultado);
        btnSumar = view.findViewById(R.id.btnSumar);

        // Evento del botón
        btnSumar.setOnClickListener(v -> realizarSuma());

        return view;
    }

    private void realizarSuma() {

        String dato1 = edtPrimerDato.getText().toString().trim();
        String dato2 = edtSegundoDato.getText().toString().trim();

        if (TextUtils.isEmpty(dato1) || TextUtils.isEmpty(dato2)) {
            Toast.makeText(getContext(),
                    "Ingrese ambos números",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double num1 = Double.parseDouble(dato1);
            double num2 = Double.parseDouble(dato2);

            double resultado = num1 + num2;

            edtResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException e) {
            Toast.makeText(getContext(),
                    "Ingrese valores numéricos válidos",
                    Toast.LENGTH_SHORT).show();
        }
    }
}