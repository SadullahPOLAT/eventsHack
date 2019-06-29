package eventshvl

import java.sql.Timestamp

class Events {
    String description
    Timestamp eventDate
    int capacity
    Timestamp applicationStartDate
    Timestamp applicationEndDate


    static constraints = {
    }
}
