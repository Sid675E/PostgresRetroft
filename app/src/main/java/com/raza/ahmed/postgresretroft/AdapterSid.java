package com.raza.ahmed.postgresretroft;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ahmedraza on 04/09/16.
 */
public class AdapterSid extends RecyclerView.Adapter<AdapterSid.AdapterSidViewHolder> {
    List<CustomViewHolder> sidView;
    private int roWLayout;
    private Context context;


    public static class AdapterSidViewHolder extends RecyclerView.ViewHolder{
        LinearLayout sidLayout;
        TextView sidTt;
        TextView sidId;
        TextView sidVar;
        TextView sidEdi;

        public AdapterSidViewHolder(View v){
            super(v);
            sidLayout = (LinearLayout) v.findViewById(R.id.sid_linear_layout);
            sidId = (TextView) v.findViewById(R.id.sid_id);
            sidEdi = (TextView) v.findViewById(R.id.sid_edi);
            sidTt = (TextView) v.findViewById(R.id.sid_tt);
            sidVar = (TextView) v.findViewById(R.id.sid_var);
        }
    }


    public AdapterSid(List<CustomViewHolder> sidView, int roWLayout, Context context){
        this.sidView = sidView;
        this.roWLayout = roWLayout;
        this.context = context;
    }

    @Override
    public AdapterSid.AdapterSidViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(roWLayout, parent, false);
        return new AdapterSidViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterSidViewHolder holder, final int position){
        holder.sidId.setText(sidView.get(position).getid().toString());
        holder.sidEdi.setText(sidView.get(position).getedi());
        holder.sidTt.setText(sidView.get(position).gettt());
        holder.sidVar.setText(sidView.get(position).getvarr().toString());
    }

    @Override
    public int getItemCount(){
        return sidView.size();
    }
}
