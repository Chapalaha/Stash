package com.example.stash;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    Button btnTr, btnLan, btnMB;
    EditText txtEnter;
    EditText txtResult;
    ImageButton imageButton;
    TextView txt1, txt2;
    int p = 1;
    int t = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btnTr = view.findViewById(R.id.btnTranslate);
        btnLan = view.findViewById(R.id.btnLanguage);
        btnMB = view.findViewById(R.id.btnType);

        txtEnter = view.findViewById(R.id.textIn);
        txtResult = view.findViewById(R.id.textOut);

        imageButton = view.findViewById(R.id.btnChange);

        txt1 = view.findViewById(R.id.textFirst);
        txt2 = view.findViewById(R.id.textSecond);

        btnTr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String txtToConvert = txtEnter.getText().toString();

                    if(txt1.getText().toString().equals("Морзе") && txt2.getText().toString().equals("Русский")){
                        String convertedTxt = Morse.morseToRusAlpha(txtToConvert);
                        txtResult.setText(convertedTxt);
                    }else if(txt1.getText().toString().equals("Морзе") && txt2.getText().toString().equals("Английский")){
                        String convertedTxt = Morse.morseToAlpha(txtToConvert);
                        txtResult.setText(convertedTxt);
                    }

                    else if(txt1.getText().toString().equals("Русский") && txt2.getText().toString().equals("Морзе")){
                        String convertedTxt = Morse.rusAlphaToMorse(txtToConvert);
                        txtResult.setText(convertedTxt);
                    }else if(txt1.getText().toString().equals("Английский") && txt2.getText().toString().equals("Морзе")){
                        String convertedTxt = Morse.alphaToMorse(txtToConvert);
                        txtResult.setText(convertedTxt);
                    }

                    else if(txt1.getText().toString().equals("Русский") && txt2.getText().toString().equals("Двоичный код")){
                        String convertedTxt = BinaryCode.alphaToBinary(txtToConvert);
                        txtResult.setText(convertedTxt);
                    }else if(txt1.getText().toString().equals("Английский") && txt2.getText().toString().equals("Двоичный код")){
                        String convertedTxt = BinaryCode.alphaToBinary(txtToConvert);
                        txtResult.setText(convertedTxt);
                    }

                    else if(txt1.getText().toString().equals("Двоичный код") && txt2.getText().toString().equals("Русский")){
                        String convertedTxt = BinaryCode.binaryToAlpha(txtToConvert);
                        txtResult.setText(convertedTxt);
                    }else if(txt1.getText().toString().equals("Двоичный код") && txt2.getText().toString().equals("Английский")){
                        String convertedTxt = BinaryCode.binaryToAlpha(txtToConvert);
                        txtResult.setText(convertedTxt);
                    }
            }
        });




        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txtLan1 = btnLan.getText().toString();   //  Рус/Анг
                String txtLan2 = btnMB.getText().toString();    //  Мор/Двоич

                String text1 = txtEnter.getText().toString();
                String text2 = txtResult.getText().toString();

                if (txt1.getText().toString().equals("Морзе") | txt1.getText().toString().equals("Двоичный код")){
                    txt1.setText(txtLan1);
                    txt2.setText(txtLan2);
                    txtEnter.setText(text2);
                    txtResult.setText(text1);
                }
                else if (txt2.getText().toString().equals("Морзе") | txt2.getText().toString().equals("Двоичный код")){
                    txt1.setText(txtLan2);
                    txt2.setText(txtLan1);
                    txtEnter.setText(text2);
                    txtResult.setText(text1);
                }
            }
        });

        btnLan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                p++;
                if (p % 2 != 1){
                    btnLan.setText("Русский");
                    if (txt1.getText().toString().equals("Морзе") | txt1.getText().toString().equals("Двоичный код")){
                        txt2.setText("Русский");
                    }else{
                        txt1.setText("Русский");
                    }
                }
                else{
                    btnLan.setText("Английский");
                    if (txt1.getText().toString().equals("Морзе") | txt1.getText().toString().equals("Двоичный код")){
                        txt2.setText("Английский");
                    }else{
                        txt1.setText("Английский");
                    }
                }
            }
        });

        btnMB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                t++;
                if (t % 2 != 1){
                    btnMB.setText("Двоичный код");
                    if (txt1.getText().toString().equals("Русский") | txt1.getText().toString().equals("Английский")){
                        txt2.setText("Двоичный код");
                    }else{
                        txt1.setText("Двоичный код");
                    }
                }
                else{
                    btnMB.setText("Морзе");
                    if (txt1.getText().toString().equals("Русский") | txt1.getText().toString().equals("Английский")){
                        txt2.setText("Морзе");


                    }else{
                        txt1.setText("Морзе");
                    }
                }
            }
        });

        return view;
    }
}