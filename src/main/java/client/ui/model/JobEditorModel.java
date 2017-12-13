package client.ui.model;

import client.controller.ViewManager;
import common.model.Job;
import common.model.Station;

import java.time.LocalDate;
import java.util.List;

public class JobEditorModel {

    private final ViewManager viewManager;
    private boolean saveBool;

    private Job job;

    public JobEditorModel(ViewManager viewManager) {
        this.viewManager = viewManager;
    }

    public void updateJobInfo(String detail, String requester, String typeOfMedia, int quantity, LocalDate fromDate, LocalDate toDate) {
        job.setJobDetail(detail);
        job.setRequester(requester);
        job.setTypeOfMedia(typeOfMedia);
        job.setQuantity(quantity);
        job.setFromDate(fromDate);
        job.setToDate(toDate);
        saveBool = true;
    }

    public boolean isSaved() {
        if (saveBool) {
            saveBool = false;
            return true;
        }
        return false;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<Station> loadStationList() {
        return viewManager.getController().getStationList();
    }

    public List<Station>  getStationsInJob() {
        return job.getStations();
    }
}
