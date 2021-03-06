package cz.mufi.PA165.RentalConstructionMachinery.facade;

import java.util.Date;
import java.util.List;

import cz.mufi.PA165.RentalConstructionMachinery.dto.MachineDTO;

public interface MachineFacade {

    /**
     * Add a new machine to our fleets.
     * 
     * @param machine
     */
    MachineDTO addMachine(MachineDTO machine);

    /**
     * Remove a machine from our fleets.
     * 
     * @param id
     *            of machine to remove
     */
    void removeMachine(Long id);

    MachineDTO getMachineById(Long id);

    /**
     * Get list of all machines.
     * 
     * @return
     */
    List<MachineDTO> getAllMachines();

    /**
     * Get lists of available machines in our fleets for required time period.
     * 
     * @param sinceDate
     * @param tillDate
     * @return
     */
    List<MachineDTO> getAvailableMachines(Date sinceDate, Date tillDate);

    /**
     * Get lists of rented (not available) machines in our fleets for required
     * time period.
     * 
     * @param sinceDate
     * @param tillDate
     * @return
     */
    List<MachineDTO> getRentedMachines(Date sinceDate, Date tillDate);

}
