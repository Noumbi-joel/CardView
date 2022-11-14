package com.nkjy.cardview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    //1- Data
    private Context context;
    private ArrayList<CourseModel> courseModelArrayList;

    //2- Constructor
    public MyAdapter(Context context, ArrayList<CourseModel> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    //3- View Holder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.image_view_card);
            this.textView = itemView.findViewById(R.id.text_view_card);
        }
    }

    //4- Implementing methods
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_item_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CourseModel courseModel = courseModelArrayList.get(position);
        holder.textView.setText(courseModel.getCourse_title());
        holder.imageView.setImageResource(courseModel.getCourse_image());
    }

    @Override
    public int getItemCount() {
        return courseModelArrayList.size();
    }

}
