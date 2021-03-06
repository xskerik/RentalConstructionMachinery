package cz.mufi.PA165.RentalConstructionMachinery.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import cz.mufi.PA165.RentalConstructionMachinery.domain.Machine;
import cz.mufi.PA165.RentalConstructionMachinery.domain.Revision;

@Repository
public class RevisionDaoImpl extends DaoGenericImpl<Revision> implements RevisionDao {

    @Override
    public List<Revision> getRevisionsForMachineBetween(Machine machine, Date from, Date to) {
        return em
                .createQuery("SELECT r FROM Revision r WHERE r.machine = ?3 AND" + " r.revisionDate BETWEEN ?1 AND ?2",
                        Revision.class)
                .setParameter(1, from).setParameter(2, to).setParameter(3, machine).getResultList();
    }

    @Override
    public List<Revision> getRevisionsBetween(Date from, Date to) {
        return em.createQuery("SELECT r FROM Revision r WHERE " + " r.revisionDate BETWEEN ?1 AND ?2", Revision.class)
                .setParameter(1, from).setParameter(2, to).getResultList();
    }

    @Override
    public boolean revisionExists(Machine machine, Date from, Date to) {
        return getRevisionsForMachineBetween(machine, from, to).size() > 0;
    }
}
