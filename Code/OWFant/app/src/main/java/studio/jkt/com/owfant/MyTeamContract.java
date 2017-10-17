package studio.jkt.com.owfant;

import android.graphics.drawable.Drawable;

/**
 * Created by James on 10/12/2017.
 */

public interface MyTeamContract {

    interface OverallView extends BaseView<OverallPresenter> {

        void setTeamName(String name);

        void setTeamRecord(String record);

        boolean isActive();

    }

    interface PlayerDetailView extends BaseView<PlayerDetailPresenter> {

        void setPlayerName(String playerName);

        void setPlayerTotalPoints(String points);

        boolean isActive();

    }

    interface OWPlayerDetailView extends PlayerDetailView {

        void setPlayerHeroPicture(Drawable heroPicture);

        void setPlayerRolePicture(Drawable rolePicture);

        void setPlayerTeamName(String teamName);

        void setPlayerNationalityPicture(Drawable nationalityPicture);

    }

    interface OverallPresenter extends BasePresenter {

        void changeName();

    }

    interface PlayerDetailPresenter extends BasePresenter {

        void editPlayer();

    }
}
