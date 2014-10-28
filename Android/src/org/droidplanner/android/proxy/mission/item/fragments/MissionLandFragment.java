package org.droidplanner.android.proxy.mission.item.fragments;

import org.droidplanner.R;
import org.droidplanner.android.api.services.DroidPlannerApi;
import org.droidplanner.core.mission.MissionItemType;

import android.os.Bundle;
import android.view.View;

public class MissionLandFragment extends MissionDetailFragment {

	@Override
	protected int getResource() {
		return R.layout.fragment_editor_detail_land;
	}

	@Override
	public void onApiConnected(DroidPlannerApi api){
        super.onApiConnected(api);
        typeSpinner.setSelection(commandAdapter.getPosition(MissionItemType.LAND));
    }

}
