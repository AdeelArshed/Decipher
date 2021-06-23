package com.decipherllc.decipher.Adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.decipherllc.decipher.Fragments.CallsFragment;
import com.decipherllc.decipher.Fragments.ChatsFragment;
import com.decipherllc.decipher.Fragments.statusFragment;

public class FragmentsAdapter extends FragmentStateAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ChatsFragment();
            case 1:
                return new statusFragment();
            case 2:
                return new CallsFragment();
            default:
                return new ChatsFragment();

        }


    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
