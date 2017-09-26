package com.example.jennapfingsten.beautifulbulldog;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * A simple {@link Fragment} subclass.
 */
public class RankingsFragment extends Fragment {

    private ListView rankingsList;
    //MainActivity mainActivity = (MainActivity) this.getActivity();
    MainActivity mainActivity;

    public RankingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rankings, container, false);


        rankingsList = (ListView) view.findViewById(R.id.rankings_list);

        mainActivity = (MainActivity) this.getActivity();


        BulldogArrayAdapter adapter = new BulldogArrayAdapter(this.getActivity(), this.getRankings());
        rankingsList.setAdapter(adapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        BulldogArrayAdapter adapter = new BulldogArrayAdapter(this.getActivity(), this.getRankings());
        rankingsList.setAdapter(adapter);
    }

    public ArrayList<Bulldog> getRankings() {
        ArrayList<Bulldog> bulldogs = new ArrayList(mainActivity.realm.where(Bulldog.class).findAll());

        Collections.sort(bulldogs, new Comparator<Bulldog>() {
            @Override
            public int compare(Bulldog bulldog, Bulldog bulldog2) {
                return ((Double) bulldog2.getVotes().average("rating"))
                        .compareTo((Double) bulldog.getVotes().average("rating"));
            }
        });

        return bulldogs;
    }

}
