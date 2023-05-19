package com.zybooks.kamilaproject4;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;


public class FactorialFragment extends Fragment implements View.OnClickListener {


    private View view;
    private Button calcButton;
    private EditText inputEditText;
    private int input;
    private TextView resultTextView;

    public FactorialFragment() {
        //super(R.layout.fragment_factorial);
    }

    public FactorialFragment(int number) {
        //super(R.layout.fragment_factorial);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_factorial, container, false);
        calcButton = (Button) view.findViewById(R.id.calcFacBtn);
        calcButton.setOnClickListener(this);
        inputEditText = (EditText) view.findViewById(R.id.numberFac);
        resultTextView = (TextView) view.findViewById(R.id.textViewFac);
        System.out.println(inputEditText.getText().toString());
        //input = Integer.parseInt(inputEditText.getText().toString());
        return view;
    }

    public void onClick(View view) {
        factorialCalculateClick();
    }

    public void factorialCalculateClick() {
        int number = input;
        try {
            number = Integer.parseInt(inputEditText.getText().toString());
        } catch (NumberFormatException ex) {
            number = 1;
        }

        if (number <= 20) {
            long result = factorial(number);
            //Place the result into the string resource and display
            String output = getString(R.string.result, result);
            resultTextView.setText(output);
        } else {
            BigInteger result = bigFactorial(number);
            //Place the result into the string resource and display
            String output = getString(R.string.result, result);
            resultTextView.setText(output);
        }
    }
    //Calculation for values <= 20
    public long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
    //Calculation for values > 20
    public BigInteger bigFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}