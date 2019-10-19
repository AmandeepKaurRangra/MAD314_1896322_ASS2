import androidx.annotation.NonNull;

import com.example.mad314_1896322_ass2.R;

public class Student {
    String Name;
    int id;
    String Password;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }
}




//public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
//    private LayoutInflater mInflater;
//    private List<Animal> mData = new ArrayList<>();
//
//    public AnimalAdapter(Context context) {
//        this.mInflater = LayoutInflater.from(context);
//        this.mData.addAll(AnimalRepository.getInstance().getAnimals());
//
//    }
//
//    @NonNull
//    @Override
//    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = mInflater.inflate(R.layout.animal_vh, parent, false);
//        return new AnimalViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
//        // get the animals
//        List<Animal> animals = AnimalRepository.getInstance().getAnimals();
//
//
//        holder.Name.setText(animals.get(position).name);
//        holder.id.setText(animals.get(position).sex);
//        holder.Password.setText(String.valueOf(animals.get(position).age));
//    }
//
//    @Override
//    public int getItemCount() {
//        return AnimalRepository.getInstance().getAnimals().size();
//    }
//
//    public void update() {
//        mData.clear();
//        mData.addAll(AnimalRepository.getInstance().getAnimals());
//        notifyDataSetChanged();
//    }
//}