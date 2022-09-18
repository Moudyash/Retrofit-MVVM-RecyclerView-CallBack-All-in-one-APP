#if(${PACKAGE_NAME}&&${PACKAGE_NAME} !="")package ${PACKAGE_NAME}; #end

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ${AdapterName} extends RecyclerView.Adapter<${AdapterName}.${ViewHolder_Name}> {
private ArrayList<${Model_Name}> ${Model_Name}s = new ArrayList<${Model_Name}>();
    Context context;

    @NonNull
    @Override
    public ${AdapterName}.${ViewHolder_Name} onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ${ViewHolder_Name}(LayoutInflater.from(parent.getContext()).inflate(R.layout.${item_Name},parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ${AdapterName}.${ViewHolder_Name} holder, int position) {

    }

    @Override
    public int getItemCount() {
        return ${Model_Name}s.size();
    }

    public class ${ViewHolder_Name} extends RecyclerView.ViewHolder {
        public ${ViewHolder_Name}(@NonNull View itemView) {
            super(itemView);
        }
    }
}
