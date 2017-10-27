package studio.jkt.com.owfant;

import android.graphics.drawable.Drawable;

/**
 * Created by James on 10/23/2017.
 */

interface VSContract {

    interface OverallView extends BaseView<OverallPresenter> {

        void setUserTeamName(String name);

        void setUserTeamOwner(String username);

        void setUserTeamRecord(String record);

        void setOtherTeamName(String name);

        void setOtherTeamOwner(String username);

        void setOtherTeamRecord(String record);

        boolean isActive();

    }

    interface PlayerDetailView extends BaseView<PlayerDetailPresenter> {

        void setPlayerName(String name);

        void setPlayerTotalPoints(String points);

        boolean isActive();

    }

    interface OWPlayerDetailView extends PlayerDetailView {

        void setPlayerRolePicture(Drawable rolePicture);

        void setPlayerTeamName(String teamName);

    }

    interface OverallPresenter extends BasePresenter {

    }

    interface PlayerDetailPresenter extends BasePresenter {

        void editPlayer();

    }
}
