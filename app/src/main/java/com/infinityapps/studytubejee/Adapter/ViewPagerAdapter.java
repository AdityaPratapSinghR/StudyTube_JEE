package com.infinityapps.studytubejee.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.infinityapps.studytubejee.Fragment.Home;
import com.infinityapps.studytubejee.Fragment.LearnoHubFrag;
import com.infinityapps.studytubejee.Fragment.MoreFrag;
import com.infinityapps.studytubejee.Fragment.PhysicsGalaxyFrag;
import com.infinityapps.studytubejee.Fragment.PhysicsWallahFrag;
import com.infinityapps.studytubejee.Fragment.UnacademyFrag;
import com.infinityapps.studytubejee.Fragment.VedantuFrag;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull /*@org.jetbrains.annotations.NotNull*/ FragmentManager fragmentManager, @NonNull /*@org.jetbrains.annotations.NotNull*/ Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    //@org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Home();
            case 1: return new PhysicsWallahFrag();
            case 2: return new UnacademyFrag();
            case 3: return new VedantuFrag();
            case 4: return new PhysicsGalaxyFrag();
            case 5: return new MoreFrag();
            //case 5: return new LearnoHubFrag();
        }
        return new Home();
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
