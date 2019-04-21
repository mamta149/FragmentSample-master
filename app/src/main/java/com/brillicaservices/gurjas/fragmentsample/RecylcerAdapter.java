package com.brillicaservices.gurjas.fragmentsample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecylcerAdapter extends RecyclerView.Adapter<RecylcerAdapter.StudentViewHolder> {

    ArrayList<StudentModel> studentModelArrayList;

    public RecylcerAdapter(ArrayList<StudentModel> studentModelArrayList) {
        this.studentModelArrayList = studentModelArrayList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View itemView = layoutInflater.inflate(R.layout.item_layout_detail, parent, false);

        StudentViewHolder studentViewHolder = new StudentViewHolder(itemView);

        return studentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.studentName.setText("Student Name is - " + studentModelArrayList.get(position).studentName);
        holder.collegeName.setText(studentModelArrayList.get(position).collegeName);
    }

    @Override
    public int getItemCount() {
        return studentModelArrayList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {

        TextView studentName, collegeName;

        public StudentViewHolder(View itemView) {
            super(itemView);

            studentName = itemView.findViewById(R.id.student_name_detail);
            collegeName = itemView.findViewById(R.id.college_name);
        }
    }
}
