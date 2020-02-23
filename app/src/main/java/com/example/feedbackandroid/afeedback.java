package com.example.feedbackandroid;

   import android.content.Context;
   import android.view.ContextMenu;
   import android.view.LayoutInflater;
   import android.view.View;
   import android.view.ViewGroup;
   import android.widget.TextView;

   import androidx.annotation.NonNull;
   import androidx.recyclerview.widget.RecyclerView;

   import java.util.ArrayList;
   import androidx.annotation.NonNull;
   import androidx.recyclerview.widget.RecyclerView;


public class afeedback extends RecyclerView.Adapter {

 ArrayList<afeedback> afeedbackList;
 Context context;

 public  afeedback(Context context, ArrayList<afeedback>afeedbackList) {
     afeedbackList = afeedbackList;
     this.context = context;
 }

     class FeedBackViewHolder extends RecyclerView.ViewHolder {
         TextView name, occupation, qualification, rating;

         public FeedBackViewHolder(@NonNull View itemView) {
             super(itemView);
             name = (TextView) itemView.findViewById(R.id.fullnameTV);
             occupation = (TextView) itemView.findViewById(R.id.occupationTV);
             qualification = (TextView) itemView.findViewById(R.id.qualificationTV);
         }
     }


    @NonNull
    @Override
    public FeedBackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.a,parent,false);
     return new FeedBackViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder( FeedBackViewHolder ViewHolder , int position) {
     afeedback gf = afeedbackList.get(position);
     holder.occupation.setText(gf.occupation);
     holder.name.setText(gf.name);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
