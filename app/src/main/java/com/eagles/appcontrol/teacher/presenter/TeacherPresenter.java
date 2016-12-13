package com.eagles.appcontrol.teacher.presenter;

import com.eagles.appcontrol.teacher.event.CursoMateriaEvent;

/**
 * Created by carlosc on 12/12/2016.
 */

public interface TeacherPresenter {
    void onResume();
    void onPause();
    void onDestroy();
    void getCursoMaterias();
    void onEventMainThread(CursoMateriaEvent event);
}
