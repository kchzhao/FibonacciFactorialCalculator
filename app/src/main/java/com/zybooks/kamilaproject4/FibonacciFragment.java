package com.zybooks.kamilaproject4;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import static java.lang.Integer.parseInt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.view.KeyEvent;
import com.zybooks.kamilaproject4.LargeInputConfirmationDialogFragment;
public class FibonacciFragment extends Fragment implements View.OnClickListener{

    private View view;
    private Button calcButton;
    private EditText inputEditText;
    private int input;
    private TextView resultTextView;
    //private KeyEvent keyEvent;
    private String TAG = "LargeInputConfirmation";
    private String userInput;
    public FibonacciFragment() {
    }
    public FibonacciFragment(int number) {
        fibonacci(number);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fibonacci, container, false);
        calcButton = (Button) view.findViewById(R.id.calcFibBtn);
        calcButton.setOnClickListener(this);
        inputEditText = (EditText) view.findViewById(R.id.numberFib);
        resultTextView = (TextView) view.findViewById(R.id.textViewFib);
        return view;
    }

    public void onClick(View view) {
//        if (Integer.parseInt(inputEditText.getText().toString()) > 25) {
//           new LargeInputConfirmationDialogFragment().show(
//              getChildFragmentManager(), TAG);
//            }
            fibonacciCalculateClick();
    }


public void fibonacciCalculateClick(){
    //Get the input number
    int number = input;
    try{
        number = Integer.parseInt(inputEditText.getText().toString());
    }
    catch(NumberFormatException ex){
        number = 1;
    }
    long result = fibonacci(number);
    //Place the result into the string resource and display
    if (Integer.parseInt(inputEditText.getText().toString()) <= 25) {
        String output = getString(R.string.result, result);
        resultTextView.setText(output);
    }
    else {
        new LargeInputConfirmationDialogFragment().show(
                getChildFragmentManager(), TAG);
        String output = getString(R.string.result, result);
        resultTextView.setText(output);
        }
    }

    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
            return (fibonacci(n - 1) + fibonacci(n - 2) + 1);
        }








}