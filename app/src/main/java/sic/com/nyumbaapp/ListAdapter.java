package sic.com.nyumbaapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    Context context;
    ArrayList<Item> itemArrayList;

    public ListAdapter(Context context, ArrayList<Item> itemArrayList) {
        this.context = context;
        this.itemArrayList = itemArrayList;
    }

    @Override
    public int getCount() {
        return itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder;
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.txtName = convertView.findViewById(R.id.txtName);
            holder.txtLocation = convertView.findViewById(R.id.txtLocation);
            holder.txtCost = convertView.findViewById(R.id.txtCost);
            holder.imgProperty=convertView.findViewById(R.id.imgProprty);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Item property = itemArrayList.get(position);

        holder.txtLocation.setText(property.getLocation());
        holder.txtName.setText(property.getName());
        holder.imgProperty.setImageResource(property.getImage());
        holder.txtCost.setText("KES "+property.getCost());



        return convertView;
    }

    static  class ViewHolder{

        TextView txtName;
        TextView txtLocation;
        TextView txtCost;
        ImageView imgProperty;


    }
}
