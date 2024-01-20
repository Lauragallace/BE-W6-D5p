package lauragallace.BEW6D5p.payloads;

import java.time.LocalDateTime;

public class DevicePostDTO{
    private long id;
    private LocalDateTime timestamp = LocalDateTime.now();

    public DevicePostDTO(long id) {
        this.id = id;
    }
}