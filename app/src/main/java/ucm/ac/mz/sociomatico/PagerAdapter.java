package ucm.ac.mz.sociomatico;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ucm.ac.mz.sociomatico.*;


public class PagerAdapter extends FragmentStatePagerAdapter {

    int global_numberOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.global_numberOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){

            case 0:
                categorias cat = new categorias();

                return cat;

            case 1:
                internacional inter = new internacional();
                return inter;

            case 2:
                sociedade soc = new sociedade();
                return soc;

            case 3:
                politica pol = new politica();
                return pol;

            case 4:
                economia econ = new economia();
                return econ;

            case 5:
                desporto desp =new  desporto();
                return desp;






        }



        return null;
    }

    @Override
    public int getCount() {
        return global_numberOfTabs;
    }
}