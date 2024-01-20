package lauragallace.BEW6D5p.repositories;

import lauragallace.BEW6D5p.entities.Device;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepositories extends JpaRepository<Device, Long> {
    Page<Device> getDevicesByUserId(int id, Pageable pageable);
}