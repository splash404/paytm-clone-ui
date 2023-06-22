package ddw.splash404.paytm_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ddw.splash404.paytm_clone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        List<String> bankList = new ArrayList<>();
// Private Sector Banks
        bankList.add("Axis Bank Ltd.");
        bankList.add("Bandhan Bank Ltd.");
        bankList.add("CSB Bank Limited");
        bankList.add("City Union Bank Ltd.");
        bankList.add("DCB Bank Ltd.");
        bankList.add("Dhanlaxmi Bank Ltd.");
        bankList.add("Federal Bank Ltd.");
        bankList.add("HDFC Bank Ltd");
        bankList.add("ICICI Bank Ltd.");
        bankList.add("IndusInd Bank Ltd");
        bankList.add("IDFC FIRST Bank Limited");
        bankList.add("Jammu & Kashmir Bank Ltd.");
        bankList.add("Karnataka Bank Ltd.");
        bankList.add("Karur Vysya Bank Ltd.");
        bankList.add("Kotak Mahindra Bank Ltd");
        bankList.add("Nainital bank Ltd.");
        bankList.add("RBL Bank Ltd.");
        bankList.add("South Indian Bank Ltd.");
        bankList.add("Tamilnad Mercantile Bank Ltd.");
        bankList.add("YES Bank Ltd.");
        bankList.add("IDBI Bank Limited");

// Local Area Banks (LAB)
        bankList.add("Coastal Local Area Bank Ltd");
        bankList.add("Krishna Bhima Samruddhi LAB Ltd");

// Small Finance Banks (SFB)
        bankList.add("Au Small Finance Bank Ltd.");
        bankList.add("Capital Small Finance Bank Ltd");
        bankList.add("Fincare Small Finance Bank Ltd.");
        bankList.add("Equitas Small Finance Bank Ltd");
        bankList.add("ESAF Small Finance Bank Ltd.");
        bankList.add("Suryoday Small Finance Bank Ltd.");
        bankList.add("Ujjivan Small Finance Bank Ltd.");
        bankList.add("Utkarsh Small Finance Bank Ltd.");
        bankList.add("North East Small finance Bank Ltd");
        bankList.add("Jana Small Finance Bank Ltd");
        bankList.add("Shivalik Small Finance Bank Ltd");
        bankList.add("Unity Small Finance Bank Ltd");

// Payments Banks (PB)
        bankList.add("Airtel Payments Bank Ltd");
        bankList.add("India Post Payments Bank Ltd");
        bankList.add("FINO Payments Bank Ltd");
        bankList.add("Paytm Payments Bank Ltd");
        bankList.add("Jio Payments Bank Ltd");
        bankList.add("NSDL Payments Bank Limited");

// Public Sector Banks
        bankList.add("Bank of Baroda");
        bankList.add("Bank of India");
        bankList.add("Bank of Maharashtra");
        bankList.add("Canara Bank");
        bankList.add("Central Bank of India");
        bankList.add("Indian Bank");
        bankList.add("Indian Overseas Bank");
        bankList.add("Punjab & Sind Bank");
        bankList.add("Punjab National Bank");
        bankList.add("State Bank of India");
        bankList.add("UCO Bank");
        bankList.add("Union Bank of India");

// Financial Institutions
        bankList.add("National Bank for Agriculture and Rural Development");
        bankList.add("Export-Import Bank of India");
        bankList.add("National Housing Bank");
        bankList.add("Small Industries Development Bank of India");

// Regional Rural Banks
        bankList.add("Assam Gramin Vikash Bank");
        bankList.add("Andhra Pradesh Grameena Vikas Bank");
// ... Add the remaining RRBs if needed

// Foreign Banks
        bankList.add("AB Bank Ltd.");
        bankList.add("Abu Dhabi Commercial Bank PJSC");
        bankList.add("American Express Banking Corporation");
        bankList.add("Australia and New Zealand Banking Group Ltd.");
// ... Add the remaining foreign banks if needed
        Collections.sort(bankList);

// Creating ArrayAdapter for the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, bankList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// Set the adapter to the Spinner
        binding.spinnerSender.setAdapter(adapter);
        binding.spinnerReceiver.setAdapter(adapter);

    }
}