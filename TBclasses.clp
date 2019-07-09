(defclass ClinicalData
(is-a USER)
(slot StudyOID)
(slot MetaDataVersionOID)
)


(defclass SubjectData
(is-a ClinicalData)
(slot SubjectKey)
(slot OpenClinica:StudySubjectID)
)

(defclass StudyEventData
(is-a SubjectData)
(slot StudyEventOID)
)

(defclass FormData
(is-a StudyEventData)
(slot FormOID)
)

(defclass ItemGroupData
(is-a FormData)
(slot ItemGroupOID)
(slot ItemGroupRepeatKey)
(slot TransactionType)
)

(defclass ItemData
(is-a ItemGroupData)
(slot ItemOID)
(slot Value)
)

;----------------------------------------------------------------------------------
