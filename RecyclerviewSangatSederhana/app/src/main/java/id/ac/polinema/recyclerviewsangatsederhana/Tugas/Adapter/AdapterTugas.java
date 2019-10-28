package id.ac.polinema.recyclerviewsangatsederhana.Tugas.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.Tugas.Model.ModelTugas;

public class AdapterTugas extends RecyclerView.Adapter<AdapterTugas.TransaksiViewHolder> {


    private List<ModelTugas> dataList;
    public Context mContext ;
    public AdapterTugas(Context context, List<ModelTugas> dataList) {
        this.dataList = dataList;
        mContext  = context;
    }

    @Override
    public TransaksiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_tugas, parent, false);
        return new TransaksiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TransaksiViewHolder holder, final int position) {
        holder.title.setText(dataList.get(position).getNama());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class TransaksiViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView gambar;

        public TransaksiViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
        }
    }
}

