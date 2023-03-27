package com.example.userprogram;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    TextView userName;
    TextView degreeProgram;
    TextView email;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        userName = itemView.findViewById(R.id.txtUserName);
        degreeProgram = itemView.findViewById(R.id.txtDegreeProgram);
        email = itemView.findViewById(R.id.txtEmail);
    }
}
