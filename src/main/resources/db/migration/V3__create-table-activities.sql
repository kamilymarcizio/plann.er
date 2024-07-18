CREATE TABLE activities (
<<<<<<< HEAD
id UUID default RANDOM_UUID() PRIMARY KEY,
title VARCHAR(255) NOT NULL,
occurs_at TIMESTAMP NOT NULL,
trip_id UUID,
FOREIGN KEY (trip_id) REFERENCES trips(id) ON DELETE CASCADE
);
=======
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    occurs_at TIMESTAMP NOT NULL,
    trip_id UUID,
    FOREIGN KEY (trip_id) REFERENCES trips(id) ON DELETE CASCADE
);
>>>>>>> parent of 4dfb1d1 (nlw journey)
