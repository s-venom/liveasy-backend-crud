CREATE TABLE loads (
    load_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),  -- Unique identifier for each load
    loading_point VARCHAR(255) NOT NULL,  -- The location where the goods are loaded (e.g., Delhi)
    unloading_point VARCHAR(255) NOT NULL,  -- The destination (e.g., Jaipur)
    product_type VARCHAR(100) NOT NULL,  -- Type of product being transported (e.g., chemicals)
    truck_type VARCHAR(100) NOT NULL,  -- Type of truck (e.g., canter)
    no_of_trucks INTEGER NOT NULL,  -- Number of trucks required for the load
    weight INTEGER NOT NULL,  -- Weight of the load
    comment VARCHAR(500),  -- Optional comments
    shipper_id UUID NOT NULL,  -- Shipper's ID (foreign key to shippers table)
    date DATE NOT NULL,  -- Date of the shipment
    CONSTRAINT fk_shipper FOREIGN KEY (shipper_id) REFERENCES shippers(shipper_id)
);
