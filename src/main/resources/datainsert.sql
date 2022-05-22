

INSERT INTO SPECIALIST_DETAIL(SPECIALIST_DETAIL_ID,AREA_OF_EXPERTISE,CONTACT_NUMBER,EXPERIENCE_IN_YEARS,NAME)
                      VALUES (1, 'Orthopaedics', '900000000', 8, 'Steve Rogers'),
                             (2, 'Orthopaedics', '800000000', 4, 'Tony Parker'),
                             ('3', 'Urology', '700000000', '10', 'Natasha'),
                             ('4', 'Urology', '600000000', '5', 'Peter Parker');

INSERT INTO PACKAGE_DETAIL(PACKAGE_DETAIL_PK,TEST_DETAILS,TREATMENT_PACKAGE_NAME,COST,TREATMENT_DURATION)
                   VALUES (1, 'OPT1,OPT2', 'Package1', 2500, 4),
                          (2, 'OPT3,OPT4', 'Package2', 3000, 6),
                          (3,'UPT1,UPT2','Package1',4000,4),
                          (4, 'UPT3,UPT4', 'Package2', 5000, 6);

INSERT INTO IPTREATMENT_PACKAGES(IP_TREATMENT_PACKAGES_ID,AILMENT_CATEGORY,P_DETAIL_FK)
                         VALUES (1, 'Orthopaedics', 1),
                                (2, 'Orthopaedics', 2),
                                 (3, 'Urology', 3),
                                 (4, 'Urology', 4);