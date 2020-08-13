package com.app.furoappdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<ModelClass> modelClassList;
    private Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);

        return new MyViewHolder(itemView);
    }

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    public Adapter(Context context) { this.context = context; }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ModelClass modelClass = modelClassList.get(position);
        holder.title.setText(modelClass.getTitle());
        holder.hour.setText(modelClass.getHour());

    }

    @Override
    public int getItemCount() {
       return modelClassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, hour;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
            hour = (TextView) itemView.findViewById(R.id.hour);
            imageView = itemView.findViewById(R.id.profileIMG);
            imageView = itemView.findViewById(R.id.likeIMG);

        }
    }
}




