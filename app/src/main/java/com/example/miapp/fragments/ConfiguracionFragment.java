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

public class ConfiguracionFragment extends Fragment {

    private EditText edtNumero;
    private EditText edtResultado;
    private Button btnCalcular;

    public ConfiguracionFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_configuracion, container, false);

        edtNumero = view.findViewById(R.id.edtNumero);
        edtResultado = view.findViewById(R.id.edtResultado);
        btnCalcular = view.findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(v -> calcularSumatoria());

        return view;
    }

    private void calcularSumatoria() {

        String numeroTexto = edtNumero.getText().toString().trim();

        if (TextUtils.isEmpty(numeroTexto)) {
            Toast.makeText(getContext(),
                    "Ingrese un número",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        try {

            int n = Integer.parseInt(numeroTexto);

            if (n < 1) {
                Toast.makeText(getContext(),
                        "Ingrese un número mayor que 0",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            int suma = 0;

            for (int i = 1; i <= n; i++) {
                suma += i;
            }

            edtResultado.setText(String.valueOf(suma));

        } catch (NumberFormatException e) {

            Toast.makeText(getContext(),
                    "Ingrese un número válido",
                    Toast.LENGTH_SHORT).show();
        }
    }
}