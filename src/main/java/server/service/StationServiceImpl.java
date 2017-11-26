//package server.service;
//
//import common.model.Station;
//import common.service.StationService;
//import server.persistence.StationDAO;
//
//import java.util.List;
//
///**
// * ON PROGRESS!
// */
//
//public class StationServiceImpl implements StationService {
//
//    private final StationDAO<Station> dao;
//
//    @Autowired
//    public StationServiceImpl(StationDAO<Station>dao) {
//        this.dao = dao;
//    }
//
//    @Override
//    public List<Station> loadStations() {
//        return dao.loadAll();
//    }
//
//    @Override
//    public void addStation(Station station) {
//        dao.insert(station);
//    }
//
//    @Override
//    public void updateStation(Station station) {
//        dao.update(station);
//    }
//
//    @Override
//    public void deleteStation(Station station) {
//        dao.delete(station);
//    }
//}
