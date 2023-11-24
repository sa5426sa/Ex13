package com.example.geography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

    TextView capital;
    TextView pop;
    TextView lang;
    TextView anthem;
    ListView lv;
    Spinner spin;
    String[] con = {"Asia", "Europe", "Africa", "N.America", "S.America", "Oceania"};
    String[] ASIA = {"Japan", "China", "Indonesia", "India", "South Korea", "Thailand", "Israel"};
    String[] EU = {"Italy", "Germany", "United Kingdom", "France", "Switzerland", "Netherlands", "Poland"};
    String[] AFRICA = {"South Africa", "Nigeria", "Kenya", "Morocco", "Niger", "Ghana", "Senegal"};
    String[] NA = {"United States", "Canada", "Mexico", "Greenland", "Cuba", "Jamaica", "Panama"};
    String[] SA = {"Brazil", "Argentina", "Colombia", "Peru", "Chile", "Venezuela", "Ecuador"};
    String[] OCEAN = {"Australia", "New Zealand", "Fiji", "Micronesia", "Samoa", "Tonga", "Kiribati"};
    int adp = -1;
    String[] japan;
    String[] china;
    String[] indonesia;
    String[] india;
    String[] south_korea;
    String[] thailand;
    String[] israel;
    String[] italy;
    String[] germany;
    String[] united_kingdom;
    String[] france;
    String[] switzerland;
    String[] netherlands;
    String[] poland;
    String[] south_africa;
    String[] nigeria;
    String[] kenya;
    String[] morocco;
    String[] niger;
    String[] ghana;
    String[] senegal;
    String[] united_states;
    String[] canada;
    String[] mexico;
    String[] greenland;
    String[] cuba;
    String[] jamaica;
    String[] panama;
    String[] brazil;
    String[] argentina;
    String[] colombia;
    String[] peru;
    String[] chile;
    String[] venezuela;
    String[] ecuador;
    String[] australia;
    String[] new_zealand;
    String[] fiji;
    String[] micronesia;
    String[] samoa;
    String[] tonga;
    String[] kiribati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capital = findViewById(R.id.capital);
        pop = findViewById(R.id.pop);
        lang = findViewById(R.id.lang);
        anthem = findViewById(R.id.anthem);
        lv = findViewById(R.id.lv);
        spin = findViewById(R.id.spin);

        japan = getResources().getStringArray(R.array.japan);
        china = getResources().getStringArray(R.array.china);
        indonesia = getResources().getStringArray(R.array.indonesia);
        india = getResources().getStringArray(R.array.india);
        south_korea = getResources().getStringArray(R.array.south_korea);
        thailand = getResources().getStringArray(R.array.thailand);
        israel = getResources().getStringArray(R.array.israel);
        italy = getResources().getStringArray(R.array.italy);
        germany = getResources().getStringArray(R.array.germany);
        united_kingdom = getResources().getStringArray(R.array.united_kingdom);
        france = getResources().getStringArray(R.array.france);
        switzerland = getResources().getStringArray(R.array.switzerland);
        netherlands = getResources().getStringArray(R.array.netherlands);
        poland = getResources().getStringArray(R.array.poland);
        south_africa = getResources().getStringArray(R.array.south_africa);
        nigeria = getResources().getStringArray(R.array.nigeria);
        kenya = getResources().getStringArray(R.array.kenya);
        morocco = getResources().getStringArray(R.array.morocco);
        niger = getResources().getStringArray(R.array.niger);
        ghana = getResources().getStringArray(R.array.ghana);
        senegal = getResources().getStringArray(R.array.senegal);
        united_states = getResources().getStringArray(R.array.united_states);
        canada = getResources().getStringArray(R.array.canada);
        mexico = getResources().getStringArray(R.array.mexico);
        greenland = getResources().getStringArray(R.array.greenland);
        cuba = getResources().getStringArray(R.array.cuba);
        jamaica = getResources().getStringArray(R.array.jamaica);
        panama = getResources().getStringArray(R.array.panama);
        brazil = getResources().getStringArray(R.array.brazil);
        argentina = getResources().getStringArray(R.array.argentina);
        colombia = getResources().getStringArray(R.array.colombia);
        peru = getResources().getStringArray(R.array.peru);
        chile = getResources().getStringArray(R.array.chile);
        venezuela = getResources().getStringArray(R.array.venezuela);
        ecuador = getResources().getStringArray(R.array.ecuador);
        australia = getResources().getStringArray(R.array.australia);
        new_zealand = getResources().getStringArray(R.array.new_zealand);
        fiji = getResources().getStringArray(R.array.fiji);
        micronesia = getResources().getStringArray(R.array.micronesia);
        samoa = getResources().getStringArray(R.array.samoa);
        tonga = getResources().getStringArray(R.array.tonga);
        kiribati = getResources().getStringArray(R.array.kiribati);

        lv.setOnItemClickListener(this);
        lv.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);

        spin.setOnItemSelectedListener(this);

        ArrayAdapter<String> spinAdp = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, con);
        spin.setAdapter(spinAdp);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (adp) {
            case 0: {
                switch (position) {
                    case 0: {
                        capital.setText(capital.getContentDescription() + japan[0]);
                        pop.setText(pop.getContentDescription() + japan[1]);
                        lang.setText(lang.getContentDescription() + japan[2]);
                        anthem.setText(anthem.getContentDescription() + japan[3]);
                        break;
                    }
                    case 1: {
                        capital.setText(capital.getContentDescription() + china[0]);
                        pop.setText(pop.getContentDescription() + china[1]);
                        lang.setText(lang.getContentDescription() + china[2]);
                        anthem.setText(anthem.getContentDescription() + china[3]);
                        break;
                    }
                    case 2: {
                        capital.setText(capital.getContentDescription() + indonesia[0]);
                        pop.setText(pop.getContentDescription() + indonesia[1]);
                        lang.setText(lang.getContentDescription() + indonesia[2]);
                        anthem.setText(anthem.getContentDescription() + indonesia[3]);
                        break;
                    }
                    case 3: {
                        capital.setText(capital.getContentDescription() + india[0]);
                        pop.setText(pop.getContentDescription() + india[1]);
                        lang.setText(lang.getContentDescription() + india[2]);
                        anthem.setText(anthem.getContentDescription() + india[3]);
                        break;
                    }
                    case 4: {
                        capital.setText(capital.getContentDescription() + south_korea[0]);
                        pop.setText(pop.getContentDescription() + south_korea[1]);
                        lang.setText(lang.getContentDescription() + south_korea[2]);
                        anthem.setText(anthem.getContentDescription() + south_korea[3]);
                        break;
                    }
                    case 5: {
                        capital.setText(capital.getContentDescription() + thailand[0]);
                        pop.setText(pop.getContentDescription() + thailand[1]);
                        lang.setText(lang.getContentDescription() + thailand[2]);
                        anthem.setText(anthem.getContentDescription() + thailand[3]);
                        break;
                    }
                    case 6: {
                        capital.setText(capital.getContentDescription() + israel[0]);
                        pop.setText(pop.getContentDescription() + israel[1]);
                        lang.setText(lang.getContentDescription() + israel[2]);
                        anthem.setText(anthem.getContentDescription() + israel[3]);
                        break;
                    }
                }
                break;
            }
            case 1: {
                switch (position) {
                    case 0: {
                        capital.setText(capital.getContentDescription() + italy[0]);
                        pop.setText(pop.getContentDescription() + italy[1]);
                        lang.setText(lang.getContentDescription() + italy[2]);
                        anthem.setText(anthem.getContentDescription() + italy[3]);
                        break;
                    }
                    case 1: {
                        capital.setText(capital.getContentDescription() + germany[0]);
                        pop.setText(pop.getContentDescription() + germany[1]);
                        lang.setText(lang.getContentDescription() + germany[2]);
                        anthem.setText(anthem.getContentDescription() + germany[3]);
                        break;
                    }
                    case 2: {
                        capital.setText(capital.getContentDescription() + united_kingdom[0]);
                        pop.setText(pop.getContentDescription() + united_kingdom[1]);
                        lang.setText(lang.getContentDescription() + united_kingdom[2]);
                        anthem.setText(anthem.getContentDescription() + united_kingdom[3]);
                        break;
                    }
                    case 3: {
                        capital.setText(capital.getContentDescription() + france[0]);
                        pop.setText(pop.getContentDescription() + france[1]);
                        lang.setText(lang.getContentDescription() + france[2]);
                        anthem.setText(anthem.getContentDescription() + france[3]);
                        break;
                    }
                    case 4: {
                        capital.setText(capital.getContentDescription() + switzerland[0]);
                        pop.setText(pop.getContentDescription() + switzerland[1]);
                        lang.setText(lang.getContentDescription() + switzerland[2]);
                        anthem.setText(anthem.getContentDescription() + switzerland[3]);
                        break;
                    }
                    case 5: {
                        capital.setText(capital.getContentDescription() + netherlands[0]);
                        pop.setText(pop.getContentDescription() + netherlands[1]);
                        lang.setText(lang.getContentDescription() + netherlands[2]);
                        anthem.setText(anthem.getContentDescription() + netherlands[3]);
                        break;
                    }
                    case 6: {
                        capital.setText(capital.getContentDescription() + poland[0]);
                        pop.setText(pop.getContentDescription() + poland[1]);
                        lang.setText(lang.getContentDescription() + poland[2]);
                        anthem.setText(anthem.getContentDescription() + poland[3]);
                        break;
                    }
                }
                break;
            }
            case 2: {
                switch (position) {
                    case 0: {
                        capital.setText(capital.getContentDescription() + south_africa[0]);
                        pop.setText(pop.getContentDescription() + south_africa[1]);
                        lang.setText(lang.getContentDescription() + south_africa[2]);
                        anthem.setText(anthem.getContentDescription() + south_africa[3]);
                        break;
                    }
                    case 1: {
                        capital.setText(capital.getContentDescription() + nigeria[0]);
                        pop.setText(pop.getContentDescription() + nigeria[1]);
                        lang.setText(lang.getContentDescription() + nigeria[2]);
                        anthem.setText(anthem.getContentDescription() + nigeria[3]);
                        break;
                    }
                    case 2: {
                        capital.setText(capital.getContentDescription() + kenya[0]);
                        pop.setText(pop.getContentDescription() + kenya[1]);
                        lang.setText(lang.getContentDescription() + kenya[2]);
                        anthem.setText(anthem.getContentDescription() + kenya[3]);
                        break;
                    }
                    case 3: {
                        capital.setText(capital.getContentDescription() + morocco[0]);
                        pop.setText(pop.getContentDescription() + morocco[1]);
                        lang.setText(lang.getContentDescription() + morocco[2]);
                        anthem.setText(anthem.getContentDescription() + morocco[3]);
                        break;
                    }
                    case 4: {
                        capital.setText(capital.getContentDescription() + niger[0]);
                        pop.setText(pop.getContentDescription() + niger[1]);
                        lang.setText(lang.getContentDescription() + niger[2]);
                        anthem.setText(anthem.getContentDescription() + niger[3]);
                        break;
                    }
                    case 5: {
                        capital.setText(capital.getContentDescription() + ghana[0]);
                        pop.setText(pop.getContentDescription() + ghana[1]);
                        lang.setText(lang.getContentDescription() + ghana[2]);
                        anthem.setText(anthem.getContentDescription() + ghana[3]);
                        break;
                    }
                    case 6: {
                        capital.setText(capital.getContentDescription() + senegal[0]);
                        pop.setText(pop.getContentDescription() + senegal[1]);
                        lang.setText(lang.getContentDescription() + senegal[2]);
                        anthem.setText(anthem.getContentDescription() + senegal[3]);
                        break;
                    }
                }
                break;
            }
            case 3: {
                switch (position) {
                    case 0: {
                        capital.setText(capital.getContentDescription() + united_states[0]);
                        pop.setText(pop.getContentDescription() + united_states[1]);
                        lang.setText(lang.getContentDescription() + united_states[2]);
                        anthem.setText(anthem.getContentDescription() + united_states[3]);
                        break;
                    }
                    case 1: {
                        capital.setText(capital.getContentDescription() + canada[0]);
                        pop.setText(pop.getContentDescription() + canada[1]);
                        lang.setText(lang.getContentDescription() + canada[2]);
                        anthem.setText(anthem.getContentDescription() + canada[3]);
                        break;
                    }
                    case 2: {
                        capital.setText(capital.getContentDescription() + mexico[0]);
                        pop.setText(pop.getContentDescription() + mexico[1]);
                        lang.setText(lang.getContentDescription() + mexico[2]);
                        anthem.setText(anthem.getContentDescription() + mexico[3]);
                        break;
                    }
                    case 3: {
                        capital.setText(capital.getContentDescription() + greenland[0]);
                        pop.setText(pop.getContentDescription() + greenland[1]);
                        lang.setText(lang.getContentDescription() + greenland[2]);
                        anthem.setText(anthem.getContentDescription() + greenland[3]);
                        break;
                    }
                    case 4: {
                        capital.setText(capital.getContentDescription() + cuba[0]);
                        pop.setText(pop.getContentDescription() + cuba[1]);
                        lang.setText(lang.getContentDescription() + cuba[2]);
                        anthem.setText(anthem.getContentDescription() + cuba[3]);
                        break;
                    }
                    case 5: {
                        capital.setText(capital.getContentDescription() + jamaica[0]);
                        pop.setText(pop.getContentDescription() + jamaica[1]);
                        lang.setText(lang.getContentDescription() + jamaica[2]);
                        anthem.setText(anthem.getContentDescription() + jamaica[3]);
                        break;
                    }
                    case 6: {
                        capital.setText(capital.getContentDescription() + panama[0]);
                        pop.setText(pop.getContentDescription() + panama[1]);
                        lang.setText(lang.getContentDescription() + panama[2]);
                        anthem.setText(anthem.getContentDescription() + panama[3]);
                        break;
                    }
                }
                break;
            }
            case 4: {
                switch (position) {
                    case 0: {
                        capital.setText(capital.getContentDescription() + brazil[0]);
                        pop.setText(pop.getContentDescription() + brazil[1]);
                        lang.setText(lang.getContentDescription() + brazil[2]);
                        anthem.setText(anthem.getContentDescription() + brazil[3]);
                        break;
                    }
                    case 1: {
                        capital.setText(capital.getContentDescription() + argentina[0]);
                        pop.setText(pop.getContentDescription() + argentina[1]);
                        lang.setText(lang.getContentDescription() + argentina[2]);
                        anthem.setText(anthem.getContentDescription() + argentina[3]);
                        break;
                    }
                    case 2: {
                        capital.setText(capital.getContentDescription() + colombia[0]);
                        pop.setText(pop.getContentDescription() + colombia[1]);
                        lang.setText(lang.getContentDescription() + colombia[2]);
                        anthem.setText(anthem.getContentDescription() + colombia[3]);
                        break;
                    }
                    case 3: {
                        capital.setText(capital.getContentDescription() + peru[0]);
                        pop.setText(pop.getContentDescription() + peru[1]);
                        lang.setText(lang.getContentDescription() + peru[2]);
                        anthem.setText(anthem.getContentDescription() + peru[3]);
                        break;
                    }
                    case 4: {
                        capital.setText(capital.getContentDescription() + chile[0]);
                        pop.setText(pop.getContentDescription() + chile[1]);
                        lang.setText(lang.getContentDescription() + chile[2]);
                        anthem.setText(anthem.getContentDescription() + chile[3]);
                        break;
                    }
                    case 5: {
                        capital.setText(capital.getContentDescription() + venezuela[0]);
                        pop.setText(pop.getContentDescription() + venezuela[1]);
                        lang.setText(lang.getContentDescription() + venezuela[2]);
                        anthem.setText(anthem.getContentDescription() + venezuela[3]);
                        break;
                    }
                    case 6: {
                        capital.setText(capital.getContentDescription() + ecuador[0]);
                        pop.setText(pop.getContentDescription() + ecuador[1]);
                        lang.setText(lang.getContentDescription() + ecuador[2]);
                        anthem.setText(anthem.getContentDescription() + ecuador[3]);
                        break;
                    }
                }
                break;
            }
            case 5: {
                switch (position) {
                    case 0: {
                        capital.setText(capital.getContentDescription() + australia[0]);
                        pop.setText(pop.getContentDescription() + australia[1]);
                        lang.setText(lang.getContentDescription() + australia[2]);
                        anthem.setText(anthem.getContentDescription() + australia[3]);
                        break;
                    }
                    case 1: {
                        capital.setText(capital.getContentDescription() + new_zealand[0]);
                        pop.setText(pop.getContentDescription() + new_zealand[1]);
                        lang.setText(lang.getContentDescription() + new_zealand[2]);
                        anthem.setText(anthem.getContentDescription() + new_zealand[3]);
                        break;
                    }
                    case 2: {
                        capital.setText(capital.getContentDescription() + fiji[0]);
                        pop.setText(pop.getContentDescription() + fiji[1]);
                        lang.setText(lang.getContentDescription() + fiji[2]);
                        anthem.setText(anthem.getContentDescription() + fiji[3]);
                        break;
                    }
                    case 3: {
                        capital.setText(capital.getContentDescription() + micronesia[0]);
                        pop.setText(pop.getContentDescription() + micronesia[1]);
                        lang.setText(lang.getContentDescription() + micronesia[2]);
                        anthem.setText(anthem.getContentDescription() + micronesia[3]);
                        break;
                    }
                    case 4: {
                        capital.setText(capital.getContentDescription() + samoa[0]);
                        pop.setText(pop.getContentDescription() + samoa[1]);
                        lang.setText(lang.getContentDescription() + samoa[2]);
                        anthem.setText(anthem.getContentDescription() + samoa[3]);
                        break;
                    }
                    case 5: {
                        capital.setText(capital.getContentDescription() + tonga[0]);
                        pop.setText(pop.getContentDescription() + tonga[1]);
                        lang.setText(lang.getContentDescription() + tonga[2]);
                        anthem.setText(anthem.getContentDescription() + tonga[3]);
                        break;
                    }
                    case 6: {
                        capital.setText(capital.getContentDescription() + kiribati[0]);
                        pop.setText(pop.getContentDescription() + kiribati[1]);
                        lang.setText(lang.getContentDescription() + kiribati[2]);
                        anthem.setText(anthem.getContentDescription() + kiribati[3]);
                        break;
                    }
                }
                break;
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ArrayAdapter<String> adpASIA = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ASIA);
        ArrayAdapter<String> adpEU = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, EU);
        ArrayAdapter<String> adpAFRICA = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, AFRICA);
        ArrayAdapter<String> adpNA = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, NA);
        ArrayAdapter<String> adpSA = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, SA);
        ArrayAdapter<String> adpOCEAN = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, OCEAN);
        adp=position;
        switch (position) {
            case 0:
                lv.setAdapter(adpASIA);
                break;
            case 1:
                lv.setAdapter(adpEU);
                break;
            case 2:
                lv.setAdapter(adpAFRICA);
                break;
            case 3:
                lv.setAdapter(adpNA);
                break;
            case 4:
                lv.setAdapter(adpSA);
                break;
            case 5:
                lv.setAdapter(adpOCEAN);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}