/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */
package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int numberOfCoffe=0;
    int retailPrice=5;
    String summary="";
    String name="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price=calculatePrice();
        String displayedMessage=createOrderSummery(price);
        displayMessage(displayedMessage);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, summary);
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.coffee_order_for,name));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void increment(View view)
    {   numberOfCoffe++;
        displayQuantity(numberOfCoffe);

    }
    public void decrement(View view)
    {   if(numberOfCoffe>0)
        numberOfCoffe--;
        displayQuantity(numberOfCoffe);

    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given text on the screen.
     *
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }
    private int calculatePrice()
    {


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        if (checkBox1.isChecked())
            retailPrice +=2 ;
        if (checkBox2.isChecked())
            retailPrice +=3 ;
        int price =  retailPrice * numberOfCoffe;
        return price;

    }
    private String createOrderSummery(int price)
    {  EditText editText= (EditText) findViewById(R.id.eidtText);
        name = editText.getText().toString();
        String returnString = getString(R.string.Name,name);

        returnString+="\n"+ getString(R.string.quantity) + ": "+ numberOfCoffe +"\n\n"+getString(R.string.toppings) + "\n";

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        if (checkBox1.isChecked())
        {
            checkBox1.setChecked(false);
            returnString+= getString(R.string.topping1) + ": " + getString(R.string.topping_price1) + "\n" ;

        }
        if (checkBox2.isChecked())
        {
            checkBox2.setChecked(false);
            returnString+= getString(R.string.topping2) + ": "+ getString(R.string.topping_price2)+"\n" ;

        }
        returnString +="\n"+getString(R.string.total_price) +" "+ price+"\n"+ getString(R.string.thank)+"!";
        summary=returnString;
        return returnString;

    }
}

