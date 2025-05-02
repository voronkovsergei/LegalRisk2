create table pipelines(
    id integer,
    type_property varchar(32),
    full boolean,
    priority varchar(16),
    phase int8
);

create table egrn_commercial_apartment_documents(
    analysis integer references pipelines,
    documents json,
    status varchar(32)
);

create table egrn_commercial_retail_documents(
    analysis integer references pipelines,
    documents json,
    status varchar(32)
);


