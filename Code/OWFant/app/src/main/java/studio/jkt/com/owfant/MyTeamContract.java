package studio.jkt.com.owfant;

import android.graphics.drawable.Drawable;

/**
 * Created by James on 10/12/2017.
 */

public interface MyTeamContract {

    interface OverallView extends BaseView<OverallPresenter> {

        void setTeamName(String name);

        void setTeamRecord(String record);

    }

    interface PlayerDetailView extends BaseView<PlayerDetailPresenter> {

        void setPlayerName(String playerName);

        void setPlayerHeroPicture(Drawable heroPicture);

        void setPlayerRolePicture(Drawable rolePicture);

        void setPlayerTotalPoints(String points);

        void setPlayerTeamName(String teamName);

        void setPlayerNationalityPicture(Drawable nationalityPicture);

    }

    interface OverallPresenter extends BasePresenter {

        void changeName(String name);

    }

    interface PlayerDetailPresenter extends BasePresenter {

        void dropPlayer(String playerId);

        void addPlayer(String playerId);

        void tradePlayers(String playerIdToDrop, String playerIdToPickUp);

        void movePlayers(String playerIdOne, String playerIdTwo);

    }
}
