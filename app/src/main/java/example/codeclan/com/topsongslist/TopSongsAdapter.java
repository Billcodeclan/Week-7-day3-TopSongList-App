package example.codeclan.com.topsongslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//import android.support.v7.view.menu.CascadingMenuPopup;
//import android.support.v7.widget.Toolbar;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;

public class TopSongsAdapter extends ArrayAdapter<Song> {

    public TopSongsAdapter(Context context, ArrayList<Song> songs){
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentSong.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentSong.getTitle().toString());

        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentSong.getArtist().toString());

        ImageView myImageView = (ImageView) listItemView.findViewById(R.id.album_art);
        myImageView.setImageResource(currentSong.getImage());

        listItemView.setTag(currentSong);

        return listItemView;
    }
}
